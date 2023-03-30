package in.ashokit;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment( billAmt);
		
		if(status) {
			System.out.println("Printing recipet");
		}else {
			System.out.println("payment Declined");
		}
	}
	
	
}
