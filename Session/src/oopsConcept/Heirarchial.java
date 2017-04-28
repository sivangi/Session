package oopsConcept;

class Apple {
	public void methodA() {
		System.out.println("method of Class A");
	}
}

class Banana extends Apple {
	public void methodB() {
		System.out.println("method of Class B");
	}
}

class Cherry extends Apple {
	public void methodC() {
		System.out.println("method of Class C");
	}
}

class Date extends Apple {
	public void methodD() {
		System.out.println("method of Class D");
	}
}

public class Heirarchial {
	public void methodB() {
		System.out.println("method of Class B");
	}

	public static void main(String args[]) {
		Banana obj1 = new Banana();
		Cherry obj2 = new Cherry();
		Date obj3 = new Date();
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
	}
}