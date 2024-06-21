
public class EX22 {
 public static void main(String args[]) {
	
	//96 page : for 반복문
	
	//초기화식 > (종료)조건식 > 실행문 > 증감식
	//(종료)조건식 > 실행문 > 증감식
	//(종료)조건식 > 실행문 > 증감식
//	(종료)조건식 > 실행문 > 증감식
//	(종료)조건식 > 실행문 > 증감식
//	..............................
//	(종료) 조건식이 false 가 되는 순간 반복을 종료함

// 98 page
	int sum = 0;
	int i;
	for (i = 1; i <= 100; i++) {
		
		// sum = sum + i;
		sum += i;
		
		System.out.printf("%d 회차 >>>>>>>>>>>>>>>>>> i : %d, sum : %d%n", i, i, sum);
	}
		System.out.println("======================================");
		System.out.println("1 부터 10까지의 합계 : " + sum);
		System.out.printf("1 부터 %d까지의 합계 : %d%n" , i, sum);
		
		/*
		 int sum = 0;
	int i;
	for (i = 1; i <= 100; i++) {
		 */
		System.out.println("===============while 반복문 99 page=================");
		aum = 0;
		int num = 1;
		while (i <= 100)
			sum += i;
		i++;
		
	}
	
	
	
	
	
	
	
	
}
}
