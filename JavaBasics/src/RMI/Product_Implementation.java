package RMI;

import java.rmi.RemoteException;

public class Product_Implementation implements Product {

	public String name;
	public double price;
	public String desc;
	
	public Product_Implementation(String NewName,double NewPrice,String NewDesc) throws RemoteException{
		this.name=NewName;
		this.price=NewPrice;
		this.desc=NewDesc;
	}
	
	public String getName() throws RemoteException{
		return this.name;
	}
	public double getPrice() throws RemoteException{
		return this.price;
	}
	public String getDiscription() throws RemoteException{
		return this.desc;
	}
	
	

}
