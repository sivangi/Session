package keyword;

public class VariableHiding {
	
	int variable = 5;
	 
	public static void main(String args[]) {
		VariableHiding obj = new VariableHiding();
 
		obj.method(20);
		obj.method();
	}
 
	void method(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of variable :" + variable);
	}
 
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of variable :" + variable);
	}
}


