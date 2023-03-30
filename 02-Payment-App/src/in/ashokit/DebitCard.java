package in.ashokit;

public class DebitCard implements IPayment{
	
	
	public boolean processPayment(double billAmt) {
		System.out.println("DebitCard Payment Process");
		
		return true;
	}

}
