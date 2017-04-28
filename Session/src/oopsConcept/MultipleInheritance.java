package oopsConcept;

interface X {
	public void myMethod();
}

interface Y {
	public void myMethod();
}

class MultipleInheritance implements X, Y {
	
	public void myMethod() {
		System.out.println(" Multiple inheritance example using interfaces");
	}
}
