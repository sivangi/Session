package keyword;

 class Vehicle {

	
	int speed = 50;
	
}

class Car extends Vehicle{
	
	int speed =100;

	void display(){
		
		System.out.println(super.speed);
	}

	
	public static void main (String[] args){
		
		Car c = new Car();
		c.display();
	}
}
