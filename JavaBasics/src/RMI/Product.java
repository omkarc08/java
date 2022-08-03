package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Product extends Remote {
	
	public String getName() throws RemoteException;
	public double getPrice() throws RemoteException;
	public String getDiscription() throws RemoteException;

}
