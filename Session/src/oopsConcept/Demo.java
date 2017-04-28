package oopsConcept;

class AOne {
	public void draw() {
		System.out.println("A is drawing");
	}

	public void spin() {
		System.out.println("A spins");
	}
}

class BTwo extends AOne {
	public void draw() {
		System.out.println("B draws");
	}

	public void bad() {
		System.out.println("B is bad");

	}
}

public class Demo {

	public static void main(String[] args) {

		AOne testObject = new BTwo();

		testObject.draw(); // calls B's draw, polymorphic
		testObject.spin(); // calls A's spin, inherited by B
		// testObject.bad(); // compiler error, you are manipulating this as an
		// A
	}
}