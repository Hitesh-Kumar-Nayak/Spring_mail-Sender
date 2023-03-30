package in.ashokit;

public class DieselEngine implements IEngine {
	public DieselEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("Diesel engine Constructor");
	}
	
	public int start() {
		System.out.println("DieselEng Started");
		return 1;
	}

}
