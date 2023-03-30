package in.ashokit;

public class SodexCard implements IPayment {
	
	public boolean processPayment(double billAmt) {
		System.out.println("SodexCard Payment Processed");
		return true;
	}

}
