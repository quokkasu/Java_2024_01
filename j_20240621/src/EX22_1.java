
public class EX22_1 {
	public static void main(String args[]) {
		
		//100 page : do ~ while 문
//		while 문은 조건식이 참일 때 부터 반복을 시작함
//												거짓일 때 반복을 종료함
//		do ~ while문
		
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i; // 조건식이 참이든 거짓이든 무조건 한 번 실행함
			i++;
		}while(i<=100);
		System.out.printf("1부터 %d까지의 합 : %d\n", i-1, sum);
		
		//101 page
		int num = 10;
		do {
			System.out.println("num : " + num);
		}while(num < 10);
		
		System.out.printf("================================\n");
		while(num < 10) {
			System.out.println("while문");
			System.out.println("num : " + num);
		}
		
		
		
		
		
	}
}
