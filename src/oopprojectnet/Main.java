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
        
        Database database = new Database();
        Database.startDatabase();
        new MainMenu().setVisible(true);
    }
    
}
