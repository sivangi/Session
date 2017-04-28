package programmingQuestions;

public class PrintTo10 {

	public static int print(int i) {
		System.out.println(i);
		return (i < 10) ? print(i + 1) : 0;

	}

	public static void main(String[] args) {
		print(1);
	}

}
// It is called logical not operator in Java. It is used for reverses the
// logical state of its operand.
// If a condition is true then Logical NOT operator will make false. for eg. !(
// A && B) is true.
