package oopsConcept;

interface Aster {
	public void methodA();
}

interface B extends Aster {
	public void methodB();
}

interface C extends Aster {
	public void methodC();
}

public class Hybrid implements B, C {
	public void methodA() {
		System.out.println("MethodA");
	}

	public void methodB() {
		System.out.println("MethodB");
	}

	public void methodC() {
		System.out.println("MethodC");
	}

	public static void main(String args[]) {
		Hybrid obj1 = new Hybrid();
		obj1.methodA();
		obj1.methodB();
		obj1.methodC();
	}
}