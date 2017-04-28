package loops;

public class ForEach {

	public static  void returnLoopSimple(){
		
		int [] arr= {0,1,4,5,7,8};
		
		for(int i :arr){
			System.out.print(i);
		}
	}

		
	public static void returnLoop(){
		
		int [] arr = new int[]{1,3,5,6,7};
		for(int i = 0;i<arr.length;i++){
			
			int el = arr[i];
			
			
					
					System.out.println(el);
		}
		}
		public static void main(String[] args) {
			
		ForEach.returnLoop();
		
		ForEach.returnLoopSimple();
	}

}
