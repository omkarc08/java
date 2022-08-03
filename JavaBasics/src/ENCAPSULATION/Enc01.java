package ENCAPSULATION;

class movie{
	private int price=120;
	private int tickets;
	
	//creating getter method
	public int money() {
		
		System.out.println(this.price);
		return price;
	}
	//creating setter method
	public int mytick(int tickets){
		this.tickets=tickets;
		System.out.println(tickets);
		return tickets;
	}
}
class DDLJ extends movie{
	void srk() {
		System.out.println("srk is king of bollywood");
	}
}

public class Enc01 {

	public static void main(String[] args) {
		DDLJ d =new DDLJ();
		d.money();
		d.mytick(5);
		d.srk();
	}
}
