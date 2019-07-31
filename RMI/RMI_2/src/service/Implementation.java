package service;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Implementation extends UnicastRemoteObject implements InterfaceServeur{
    public Implementation()throws RemoteException {
        
    }
    @Override
    public String EnvoieMessage() throws RemoteException {
         return "Madoune sidali ";
    
        
    }
}
