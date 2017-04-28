package keyword;

public class MultipleInheritance {

	interface X
	{
	   public void myMethod();
	}
	interface Y
	{
	   public void myMethod();
	}
	class Demo implements X, Y
	{
	   public void myMethod()
	   {
	       System.out.println(" Multiple inheritance example using interfaces");
	   }
	}
}
