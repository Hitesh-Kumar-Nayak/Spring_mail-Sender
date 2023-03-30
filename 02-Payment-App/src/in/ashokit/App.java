package in.ashokit;

public class App {
	public static void main(String[] args) {
		
		IPayment p1 = new CreditCard();
		IPayment p2 = new DebitCard();
		
		PaymentService ps = new PaymentService(p1);
		ps.setPayment(p2);
		ps.doPayment(100.00);
		
	}

}
