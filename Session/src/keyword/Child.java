package keyword;

public class Child implements Man{

	

		   public void eat(){
		      System.out.println("Child eats");
		   }

		   public void travel(){
		      System.out.println("Child travels");
		   } 

		   public void noOfLegs(){
		      return ;
		   }

		   public static void main(String args[]){
		      Child c = new Child();
		      c.eat();
		      c.travel();
		      
		   }
		} 

