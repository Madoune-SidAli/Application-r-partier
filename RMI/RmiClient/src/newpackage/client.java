package newpackage;



import java.rmi.Naming;
import service.InterfaceServeur;


public class client {
            public static void main(String[] args) {

     try {
              InterfaceServeur stub=(InterfaceServeur)Naming.lookup("rmi://localhost:1099/sd");
              System.out.println("le message est: "+stub.EnvoieMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            
}
}