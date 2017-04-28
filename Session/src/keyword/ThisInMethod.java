package keyword;

public class ThisInMethod {
	public static void main(String[] args) {
		ThisInMethod obj = new ThisInMethod();
		obj.methodTwo();
	}

	void methodOne() {
		System.out.println("Inside Method ONE");
	}

	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
	}
}
