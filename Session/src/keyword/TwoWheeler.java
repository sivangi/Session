package keyword;

public class TwoWheeler {

	TwoWheeler()
	{
		System.out.println("Two Wheeler is created");
		
	}

static class Bike extends TwoWheeler{
	Bike()
	{
		super();//invoke the parent class constructor
		System.out.println("Bike is created");
	}
}

	public static void main (String[]args){
      
	
		@SuppressWarnings("unused")
		Bike b = new Bike();
		
	}
}




