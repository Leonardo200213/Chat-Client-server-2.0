/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server.client.pkg05;

import java.io.IOException;

/**
 *
 * @author Leonardo Messeri
 */
public class MainClient {
    //main principale che inizializza il main della classe server
    public static void main(String[] args) throws IOException{
        
        Client c = new Client();
        c.main();
    }
}
