package oopsConcept;



	class A
	{
	   public void methodA()
	   {
	     System.out.println("Base class method");
	   }
	}

	public class SingleInheritance extends A
	{
	   public void methodB()
	   {
	     System.out.println("Child class method");
	   }
	   public static void main(String args[])
	   {
	    SingleInheritance obj = new SingleInheritance();
	     obj.methodA(); //calling super class method
	     obj.methodB(); //calling local method
	  }
	}

	
