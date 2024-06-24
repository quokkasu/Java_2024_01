
public class EX06 {
public static void main(String args[]) {
	
	// 각 단에 3 까지만 곱하는 구구단을 출력하세요
	// dan에 대한 조건인지
	//number 에 대한 조건인지 파악함
	
	for(int dan = 2; dan <= 9; dan++) {
		for(int number = 1; number <= 9; number++) {
			System.out.printf("%d X %d = %d\\n", dan, number, dan*number);
			if (number == 3) {break;}
		}
	  System.out.println();
	}
	// 5단까지만 출력하는 구구단을 작성하세요
	for(int dan = 2; dan <= 9; dan++) {
		for(int number = 1; number <= 9; number++) {
			System.out.printf("%d X %d = %d\n", dan, number, dan*number);
			if (dan == 5) { break; }
		
		
		System.out.println();
		
	//108 page - label이 있는 break
		target : 
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int number = 1; number <= 9; number++) {
				System.out.printf("%d X %d = %d\n", dan, number, dan*number);
				if (dan == 5) { break target; }

