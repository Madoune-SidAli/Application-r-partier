
package soket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

public class client {
     public static void main(String[] args) {
         try {
             Socket s=new Socket("localhost", 1234);
             InputStream is=s.getInputStream();
             OutputStream os=s.getOutputStream();
             PrintWriter pw=new PrintWriter(os, true);
             Scanner sc=new Scanner(System.in);
            
          
             System.out.print("entrer un message : ");
             String a=sc.nextLine();
             pw.println(a);
              System.out.print("entrer un nombre : ");
             int b=sc.nextInt();
             os.write(b);
           

             

         } catch (IOException ex) {
             Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
}
