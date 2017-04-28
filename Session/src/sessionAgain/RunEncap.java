package sessionAgain;

public class RunEncap {

	public static void main(String args[]) {
		EncapTest obj = new EncapTest();
		obj.setEmpName("James");
		obj.setEmpAge(32);
		obj.setEmpSSN(112233);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}
}