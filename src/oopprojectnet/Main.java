/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
TODO: adding to event check if already added, adicionar acima da capacidade
*/
package oopprojectnet;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author almof
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Pubs novo = new Pubs("ola","ola","4","2", new ArrayList<>());
        Pubs adeus = new Pubs("adeus","re","30","10", new ArrayList<>());
        Pubs adeus2 = new Pubs("adeus","NB","30","1", new ArrayList<>());
        Pubs adeus3 = new Pubs("adeus","moelas","1","1", new ArrayList<>());
        Pubs adeus4 = new Pubs("adeus","insonias","30","3", new ArrayList<>());
        Pubs adeus5 = new Pubs("adeus","mandarim","30","0", new ArrayList<>());
        Database database = new Database();
        Database.startDatabase();

        Database.listPlaces.add(novo);
        Database.listPlaces.add(adeus);
        Database.listPlaces.add(adeus2);
        Database.listPlaces.add(adeus3);
        Database.listPlaces.add(adeus4);
        Database.listPlaces.add(adeus5);
        new MainMenu().setVisible(true);
    }
    
}
