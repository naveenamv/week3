package Week3.day1;

/*Create a class called Vehicle
with two methods
applyBrake()
soundHorn()
Create 2 classes Car & Auto
Inherit Vehicle
Car turnOnAC(), sunRoof()
Auto turnOnMeter(), handStart()
BMW -> Car
Bajaj -> Auto
Create object for BMW, Bajaj*/

public class Vehicle {
	public void applyBrake() {
		System.out.println("Normal Break ");
		
	}
	public void soundHorn() {
		System.out.println("Inside soundHorn method in vehicle class");
		
	}
	public static void main(String[] args) {
		Vehicle obj_vehicle=new Vehicle();
		obj_vehicle.applyBrake();
		obj_vehicle.soundHorn();
	}

}
