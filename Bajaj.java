package Week3.day1;

public class Bajaj extends Auto {
	
	public void motors() {
		System.out.println("Inside motors method in Bajaj class");
	}
	public static void main(String[] args) {
		
		Bajaj obj_bajaj=new Bajaj();
		obj_bajaj.motors();
		obj_bajaj.applyBrake();
		obj_bajaj.soundHorn();
		obj_bajaj.turnOnMeter();
		obj_bajaj.handStart();
		
		
	}

}
