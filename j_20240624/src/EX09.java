
public class EX09 {
public static void main(String args[]) {
	
	//121 page
	int[] numbers = new int [100];
	//numbers 배열에 저장된 item 출력하기
	for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i]+ " ");
		System.out.println("\n============================");
		
		//numbers 배열에 1부터 100까지 저장과 동시에 지정하기
		for(int i = 0; 5 < numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.println("\n============================");
			
			for(int i = 0; 5 < numbers.length; i++) {
				System.out.print(numbers[5]);
				System.out.println("\n============================");
				
				/*
				 크기가 20인 int 일차원 배열을 생성하고
				 21~40까지 저장하고 출력하세요
				 */
				int[] nums = new int[20];
				int count = 21;
				for(int i = 0; i < nums.length; i++) {
					nums[i] = count + i;
					System.out.print(nums[i] + " ");
				}
				System.out.println("\n============================");
				
				//122 page
				// Math.random : 0부터 1 미만의 실수를 반환함
				
				/*
				 Math.random()을 사용해서 1부터 10까지의 임의의 정수를
				 출력하기 
				 
				0 ~ 0.99999.....
				
				 0 <= Math.random() < 1
				 
				 
				 0 ~ 0.999...
				 0 * 10<= Math.random() * 10 < 1 * 10
				 
				 0~ 9
				(int)(0 * 10) <= (int)(Math.random() * 10) + 1 < (int)(1*10)+1
				
				
				1~10
			  (int)(0 * 10)+1 <= (int)(Math.random() * 10 < (int)(1*10)
			  
			  
			  // 1에서 ~ 10까지의 정수 중에서 임의의 정수 출력하기
			   System.out.println((int)(Math.random() * 10) + 1);
			   
			   System.out.println((int)(Math.random() * 10) + 1);
			   
			   System.out.println((int)(Math.random() * 10) + 1);
			  
				 */
				
				int[] lotto = new int[6];
				
				int idx = 0;
				while(true) {
					// 1부터 ~ 45까지의 정수 중에서 임의의 정수 발생시키기
					int number = (int)(Math.random()* 45) + 1;
					
					boolean insert = true;
					for(int i = 0; i <= idx; i++) {
						// 중복된 값은 저장하지 않기
						//lotto[i] : 이미 저장된 값
						//number : 새로 얻은 값(Math.random())
						if(lotto[i] == number) {
							insert = false;
							break;
							
						} //if
					} // for
					
					if(insert == true) {
						lotto[idx] = number;
						idx++; 
					} //if
					
					if(idx == 6) { break; }
					
				} //while
				
				
				
				
				
		}
	}
}
}
}
