package service;



import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class serveur {
        public static void main(String[] args) {
            try {
                //demarrer l'annuaire
                LocateRegistry.createRegistry(1099);
                //creer lobjet distant
            Implementation ObjetDistant=new Implementation();
            //publier sa reference dans annuaire
            Naming.rebind("rmi://localhost:1099/sd",ObjetDistant);
            
            } catch (Exception e) {
                e.printStackTrace();
            }
            
 
}}
