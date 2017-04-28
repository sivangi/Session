package moreQuestions;

public class ConstructorChaining {

	public static void main(String args[]) {
		
		@SuppressWarnings("unused")
		Derived sub = new Derived("Test");
	}
}

class Base {
	protected String name;

	public Base() {
		this(""); 
		System.out.println("Inside no argument constructor of Base class");
	}

	public Base(String name) {
		this.name = name;
		System.out.println("One arg constructor of Base class");
	}
}

class Derived extends Base {

	public Derived() {
		System.err.println("Inside no argument constructor of Derived class");
	}

	public Derived(String name) {
		super(name); 
		System.out.println("Inside one arg constructor from Derived class");
	}
}
