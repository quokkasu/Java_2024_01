
public class EX01 {

}


//9
class Exercise{
	
	private static Exercise exercise = null;
	
	private Exercise();
}


//11번
class Mathematics{
	
	public static void main(String [] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length; i++) {
			
		}
		int maxNumber = max(nums);
		System.out.println("최댓값 : " + maxNumber);
		int minNumber = min(nums);
		System.out.println("최솟값 : " + minNumber);
 	}
	
	 public static int max(int[] numbers){
		 int max = 0;
		 for(int i = 0; i < numbers.length; i++){
			 min = numbers[i];
		 }else{
			 if (min >= numbers[i]){
				 min  = numbers[i];
			 }
		 }
	 }
	 return min;
}