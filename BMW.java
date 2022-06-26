package Week3.day1;

public class BMW extends Car{
	
	public void automatic() {
		System.out.println("Inside automatic method in BMW class");
	}
	
	public void applyBrake() {

		System.out.println("M4 brakes");

		
	}
	
	public static void main(String[] args) {
		BMW obj_bmw=new BMW();
		obj_bmw.automatic();
		obj_bmw.applyBrake(); // method overriding
		obj_bmw.soundHorn();
		obj_bmw.turnOnAc();
		obj_bmw.sunRoof();

}

}