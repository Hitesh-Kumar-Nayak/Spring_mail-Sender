package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Robot {
	
	public Robot() {
		System.out.println("Robot Constructor");
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private Chip chip;
	
	public void doWork() {
		String type = chip.chipType();
		
		if(type.equals("32-Bit")) {
			System.out.println("Performance is slow");
		}
	}
	
	

}
