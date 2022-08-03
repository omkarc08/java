package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

	public static void main(String[] args) {
		try {
			Product_Implementation p1=new Product_Implementation("laptop",45000,"My laptop is HP");
			Product_Implementation p2=new Product_Implementation("laptop",35000,"My laptop is Dell");
			Product_Implementation p3=new Product_Implementation("laptop",25000,"My laptop is Lenovo");
			Product_Implementation p4=new Product_Implementation("laptop",15000,"My laptop is Asus");
			
			Product stub1=(Product) UnicastRemoteObject.exportObject(p1,0);
			Product stub2=(Product) UnicastRemoteObject.exportObject(p2,0);
			Product stub3=(Product) UnicastRemoteObject.exportObject(p3,0);
			Product stub4=(Product) UnicastRemoteObject.exportObject(p4,0);

			Registry reg=LocateRegistry.getRegistry("127.0.0.1", 9100);
			
			reg.bind("l", stub1);
			reg.bind("m", stub2);
			reg.bind("p", stub3);
			reg.bind("y", stub4);
			
		}catch(Exception e){
			System.out.println("some server error"+e);
		}
	}

}
