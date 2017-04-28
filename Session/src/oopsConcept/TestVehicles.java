package oopsConcept;

class Vehicle {
	String color;
	int speed;
	int size;

	void attributes() {
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
		System.out.println("Size : " + size);
	}
}

// A subclass which extends for vehicle
class Toyota extends Vehicle {
	int CC;
	int gears;
	public String color;
	public int size;

	void attributescar() {
		String color = null;
		// The subclass refers to the members of the superclass
		System.out.println("Color of Car : " + color);
		System.out.println("Speed of Car : " + speed);
		String size = null;
		System.out.println("Size of Car : " + size);
		System.out.println("CC of Car : " + CC);
		System.out.println("No of gears of Car : " + gears);
	}
}

public class TestVehicles {
	public static void main(String args[]) {
		Toyota b1 = new Toyota();
		b1.color = "Blue";
		b1.speed = 200;
		b1.size = 22;
		b1.CC = 1000;
	}
}