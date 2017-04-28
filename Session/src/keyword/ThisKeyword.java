package keyword;

public class ThisKeyword {

	ThisKeyword() {
		this("ThisKeyword");
		System.out.println("Inside Constructor without parameter");
	}

	ThisKeyword(String str) {
		System.out.println("Inside Constructor with String parameter as " + str);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ThisKeyword obj = new ThisKeyword();
	}

}
