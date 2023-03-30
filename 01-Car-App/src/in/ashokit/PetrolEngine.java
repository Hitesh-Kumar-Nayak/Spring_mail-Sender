package in.ashokit;

public class PetrolEngine  implements IEngine {
	public PetrolEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("petrol engine constructor");
	}
	
	public int start() {
		System.out.println("PetrolEngine Started");
		return 1;
	}
	

}
