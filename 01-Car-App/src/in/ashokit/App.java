package in.ashokit;

public class App {
	public static void main(String[] args) {
		Car c = new Car ();
		c.eng = new PetrolEngine();
		c.drive();
	}

}
