
package soket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;

public class server {

    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("attente d'une connexion ");
            Socket s=ss.accept();
            InputStream is=s.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);
            
            
            OutputStream os = s.getOutputStream();
           
           
            System.out.println("attente d'une chaine de caratere ");
            String str=br.readLine();
            System.out.println("la chaine de caractere est  "+str);
            System.out.println("attente d'un nombre");
            int nombre=is.read();
            System.out.println("le nombre est "+nombre);
           
            
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
