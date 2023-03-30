package in.ashokit.beans;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		// TODO Auto-generated constructor stub
		System.out.println("CreditCardPayment Constructor");
	}
	
	public boolean processPayment(double billAmt) {
		System.out.println("CreditCard Payment Successful.....");
		return true;
	}

}
