package loops;

public class Date {
	
	private int month;// three variable which are private
	private int date;
	private int year;
	
	public Date(int m,int d,int y)//constructor which takes three arguements for month,day and year..can be anything you want.
	{
		month = m;//set to whatever we passed in for m
		date = d;
		year = y;
		
		System.out.printf("The constructor for this is  %s \n", this);//this is the reference to whatever object we built when we built 
		//the class
		//printf- print format..%s is for string \n for new line.
		//anytime we need a string representation of the object we use toString method.
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d",month,date,year);//return whichever format we want.
		
	}

}
