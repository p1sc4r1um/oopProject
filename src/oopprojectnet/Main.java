/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectnet;

import java.util.ArrayList;

/**
 *
 * @author almof
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pubs novo = new Pubs("ola","ola","ola","paa",new ArrayList<Person>());
        Pubs adeus = new Pubs("adeus","re","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus2 = new Pubs("adeus","bar","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus3 = new Pubs("adeus","bado","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus4 = new Pubs("adeus","tass","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus5 = new Pubs("adeus","bem","adeus","aaaapaa",new ArrayList<Person>());
        Student ola1 = new Student("ola1", "ola2", "sporty", "ola3");
        Teacher ola2 = new Teacher("ola1", "ola2", "sporty", "ola3");
        Staff ola3 = new Staff("ola1", "ola2", "sporty", "ola3");
        Student ola4 = new Student("ola1", "ola2", "sporty", "ola3");
        Student ola5 = new Student("ola1", "ola2", "sporty", "ola3");
        Student ola6 = new Student("ola1", "ola2", "sporty", "ola3");
        new Database();
        Database.listPeople.add(ola1);
        Database.listPeople.add(ola2);
        Database.listPeople.add(ola3);
        Database.listPeople.add(ola4);
        Database.listPeople.add(ola5);
        Database.listPeople.add(ola6);
        Database.listPlaces.add(novo);
        Database.listPlaces.add(adeus);
        Database.listPlaces.add(adeus2);
        Database.listPlaces.add(adeus3);
        Database.listPlaces.add(adeus4);
        Database.listPlaces.add(adeus5);
        new MainMenu().setVisible(true);
    }
    
}
