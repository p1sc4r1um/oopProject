/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
TODO: adding to event check if already added, adicionar acima da capacidade
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

        Pubs novo = new Pubs("ola","ola","4","2", new ArrayList<>());
        Pubs adeus = new Pubs("adeus","re","30","10", new ArrayList<>());
        Pubs adeus2 = new Pubs("adeus","NB","30","1", new ArrayList<>());
        Pubs adeus3 = new Pubs("adeus","moelas","1","1", new ArrayList<>());
        Pubs adeus4 = new Pubs("adeus","insonias","30","3", new ArrayList<>());
        Pubs adeus5 = new Pubs("adeus","mandarim","30","0", new ArrayList<>());
        Student ola1 = new Student("ze", "Sporty", "sporty", "LEI");
        Teacher ola2 = new Teacher("Josef", "Cultured", "sporty", "Assitant");
        Student ola3 = new Student("madalena", "bohemian", "sporty", "LEI");
        Student ola4 = new Student("ferreiro", "ola2", "sporty", "ola3");
        Student ola5 = new Student("cesario", "ola2", "sporty", "ola3");
        Student ola6 = new Student("jonas", "ola2", "sporty", "ola3");

        Database database = new Database();
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
