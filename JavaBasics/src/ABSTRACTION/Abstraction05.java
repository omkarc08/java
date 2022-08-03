package ABSTRACTION;

abstract class RBIBank {
	abstract double getRateOfInterestForHomeLoan();
	void loan() {
		System.out.println("As per RBI loan..");
	}
}
class SBI extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class PNB extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 7.5;
	}
}

public class Abstraction05 {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println("As per SBI loan..Interest rate is : "+s.getRateOfInterestForHomeLoan()+"%");
		System.out.println("***********************");
		PNB p = new PNB();
		System.out.println("As per PNB loan..Interest rate is : "+p.getRateOfInterestForHomeLoan()+"%");

	}
}
