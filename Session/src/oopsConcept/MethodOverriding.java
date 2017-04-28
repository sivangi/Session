package oopsConcept;

class Animal {
	public void methodToOverride() // Base class method
	{
		System.out.println("I'm the method of BaseClass");
	}
}

class Cat extends Animal {
	public void methodToOverride() // Derived Class method
	{
		System.out.println("I'm the method of DerivedClass");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		// BaseClass reference and object
		Animal obj1 = new Animal();
		// BaseClass reference but DerivedClass object
		Cat obj2 = new Cat();
		// Calls the method from BaseClass class
		obj1.methodToOverride();
		// Calls the method from DerivedClass class
		obj2.methodToOverride();
	}
}
