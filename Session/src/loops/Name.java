package loops;

public class Name {

	
	private String name;//to store the name
	
	private Date birthday;//reference to Date object
	
	public Name(String theName,Date theDate)//constructor which takes two arguments.
	{
		
		name= theName;//set the name and date
		birthday = theDate;
		
	}
	
	public String toString()
	{
		
		return String.format("My name is %s,my birthday is %s",name,birthday);
	}
}
