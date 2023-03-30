package in.ashokit.beans;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		// TODO Auto-generated constructor stub
		System.out.println("DebitCardPayment:: Constructor");
	}
	public boolean processPayment(double billAmt) {
		System.out.println("DebitCard Payment Successful....");
		
		return true;
	}

}
