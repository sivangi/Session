package keyword;

public class Final {

	private int sum;//hold the sum of our numbers that we add up
	
	private final int NUMBER;
	
	public Final(int x){
		
		NUMBER= x;
		
	}
	
	public void add(){
		
		sum += NUMBER;
	}
	
	public String toString(){
		
		return String.format("sum = %d\n", sum);
	}
}
