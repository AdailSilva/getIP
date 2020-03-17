/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obter.endereco.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author adailsilva
 */
public class ObterEnderecoIp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            URL url = new URL("http://bot.whatismyipaddress.com");
            URLConnection connection = url.openConnection();
            String str = null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            str = reader.readLine();
            System.out.println(str);
        } catch (IOException e) {
        }
    }

}
