package ABSTRACTION;

interface father{
	void myhome();
}
interface mother{
	void mykitchen();
}
//multiple inheritance achieve by using interface
class child implements father,mother{
	public void myhome() {
		System.out.println("father's home");
	}
	
	public void mykitchen() {
		System.out.println("mothers kitchen");
	}
	
	void mybike() {
		System.out.println("child's bike");
	}
}
public class Interface03 {

	public static void main(String[] args) {
		child c =new child();
		c.mybike();
		c.myhome();
		c.mykitchen();	
	}
}
