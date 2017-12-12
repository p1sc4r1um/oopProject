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
        Pubs adeus = new Pubs("adeus","adeus","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus2 = new Pubs("adeus","adeus","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus3 = new Pubs("adeus","adeus","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus4 = new Pubs("adeus","adeus","adeus","aaaapaa",new ArrayList<Person>());
        Pubs adeus5 = new Pubs("adeus","adeus","adeus","aaaapaa",new ArrayList<Person>());
        new Database();
        Database.listPlaces.add(novo);
        Database.listPlaces.add(adeus);
        Database.listPlaces.add(adeus2);
        Database.listPlaces.add(adeus3);
        Database.listPlaces.add(adeus4);
        Database.listPlaces.add(adeus5);
        new MainMenu().setVisible(true);
    }
    
}
