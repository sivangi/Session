package keyword;

public class StaticKeyword {

	static int i = 10;
	 
	static void method() {
		System.out.println("Inside Static method");
	}
 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
 
		
		StaticKeyword.method();
 
		
		System.out.println(StaticKeyword.i);
 
		
		StaticKeyword obj1 = new StaticKeyword();
		@SuppressWarnings("unused")
		StaticKeyword obj2 = new StaticKeyword();
 
		
		System.out.println(obj1.i);
		
		obj1.method();
	}
}

