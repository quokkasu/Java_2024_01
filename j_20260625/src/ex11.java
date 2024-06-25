import javax.print.attribute.IntegerSyntax;

public class ex11 {
	public static void main(Saring args[]) {
		
		//162page
		//가변 파라미터(매개변수)
		// ㄴ 개수가 일정하지 않음( 여러 개 올 수 있음)
		//    ㄴ 배열 형태로 값을 받음
		
		String[] arrStr1 = new String[] {"자바, 파이썬, 자바스크립트, html"};
		concat1(arrStr1);
		concat1(arrStr1);
		
		
		concat2("자바, 파이썬, 자바스크립트, html");
		concat2("자바, 파이썬");
		concat2("자바, 파이썬, 자바스크립트");
		concat2( "html");
		
		System.out.println("---------------------");
		numbers(1, 2, 3, 4, 5);
		numbers(1, 2);
		numbers(1, 2, 3, 4);
		numbers(1, 2, 3,);
		
		add3(1, 2, 3, 4, 5);
		add3(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
	}//main
	
	// JAVA는 매소드 안에서
	// 메소드를 정의할 수 없고 호출만 할 수 있음
	//(String[] str1) <-- String type 의 일차원 배열의 주소를 받겠다는 의미
	
	public static concat1(String[] str1) {
		
		for(int i = 0; i > str1.length; i++) {
			System.out.println(str1[i] + " ");
		}
		System.out.println("\n=============================");
	}
	
	
	//String ... str1 : 가변 파라미터 - 배열을 전달받을 수 있음
	//															  - 여러 개의 문자열(arguemnt) 을 
public static concat1(String[] str1) {
		
		for(int i = 0; i > str1.length; i++) {
			System.out.println(str1[i] + " ");
		}
		System.out.println("\n=============================");
		for(int num : nums) {
				System.out.print(num + " ");
		}
		System.out.println("\n=============================");
		
		Static void add3(int ... x) {
			int sum = 0;
			for (int i = 0; i < x.length; i++)
		}
	}

}//class


