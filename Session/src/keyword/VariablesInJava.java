package keyword;

public class VariablesInJava {

	int instanceField;

	static String staticField;

	public void method() {

		final String localVariable = "Initial Value";
		System.out.println(localVariable);
	}

	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		VariablesInJava obj = new VariablesInJava();

		System.out.println(obj.instanceField);

		System.out.println(obj.staticField);
		System.out.println(VariablesInJava.staticField);
	}
}
