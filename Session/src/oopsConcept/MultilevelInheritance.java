package oopsConcept;

class one {
	public void methodX() {
		System.out.println("Class X method");
	}
}

class two extends one {
	public void methodY() {
		System.out.println("class Y method");
	}
}

public class MultilevelInheritance extends two {
	public void methodZ() {
		System.out.println("class Z method");
	}

	public static void main(String args[]) {
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.methodX(); // calling grand parent class method
		obj.methodY(); // calling parent class method
		obj.methodZ(); // calling local method
	}
}
