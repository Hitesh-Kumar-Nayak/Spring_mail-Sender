package in.ashokit;

public class CreditCard implements IPayment {
	
	public boolean processPayment(double billAmt) {
		System.out.println("Credit Card Payment Process");
		return true;
	}

}
