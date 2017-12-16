
public class MainClass {

	public static void main(String[] args) {
	
		boolean[] arr = getArray(100);
		
		switchButtons(arr);
		
		printAnswer(arr); 

	}
	
	private static boolean[] getArray(int arrLength) {
		
		boolean[] arr = new boolean[arrLength];
		
		for(boolean el : arr){
			
			el = false;
		}
		
		return arr;
	}
	
	private static void switchButtons(boolean[] arr) {
		
		byte counter = 1;
						
				while(counter < arr.length) {
				 
					for(int i = 1;i < arr.length;i++) {
									
						if(((i % counter) == 0) || i == 1) {					
						
						  if(arr[i] == false)arr[i] = true;
										
						  else arr[i] = false;
					}
				}
				
				counter++;
			}			
		}
	
	private static void printAnswer(boolean[] arr) {
		int counter = 0;
		
		for(boolean el : arr) {
			
			if(el == true) System.out.println(String.format("(%d) switch is turned on.",counter));
			
			counter++;
		}
	}

}
