package service;



import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfaceServeur extends Remote {
    
    public String EnvoieMessage() throws RemoteException;
}
