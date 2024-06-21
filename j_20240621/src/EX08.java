
public class EX08 {
	public static void main(String args[]) {
		// 68page 밑 부분에 short circuit 설명 나옴.
		//69 page
		// short circuit
		
	// && : 모두 true 일 때만 true
			System.out.println(true && true);
			System.out.println(true && false);
			System.out.println(false && true);
			System.out.println(false && false);
			System.out.println("\n============================");
			
			// || : 모두 false 일 때만 false
			//short cicruit : 이미 true 가 하나 나오면
			//									뒤 의 결과와 상관없이 true 이므로
			//								뒤의 값을 확인하지 않고 바로 true를 반환함
			System.out.println(true || true);
			System.out.println(true || false);
			System.out.println(false || true);
			System.out.println(false || false);
			System.out.println("\n============================");
			
			//^ : true가 홀수 개 일때 true
			//^ : true 가 짝수 개일 때 false
			//  : 서로 다를 때만 true
			
		// ^ : 모두 같을 때만 false
				System.out.println(true ^ true ^ true ^ true ^ true);
				System.out.println( true^ true^ true ^false ^ true);
				System.out.println(false^true^ false^ false ^ false);
				System.out.println(false ^ false ^ false ^ false ^ false);
				System.out.println("\n============================");
				System.out.println(true ^ false ^ false ^ false ^ false);
				System.out.println( true^ false^ false ^false ^ false);
				System.out.println(true^true^ false^ false ^ false);
				System.out.println(true ^ false ^ false ^ false ^ false);
		
				System.out.println("\n============================");
				
			//69 page
				// short circuit
				
				int a = 10;
				int b = 5;
				
				
				System.out.println("test() : " + test());
// &
				System.out.println(a == b & test());
				
			// &&
				System.out.println(a == b && test());
				//java 에서 논리 연산은 &&, ||만 사용해야 했으나
				//java 버전이 올라가면서 &,|도 허용함
				//피연산자가 boolean type 인 경우에는 &, |이 논리연산자로 실행됨
				System.out.println(true & true);
				System.out.println(true & false);
				System.out.println(false & true);
				System.out.println(false & false);
				
				System.out.println(true | true);
				System.out.println(true | false);
				System.out.println(false | true);
				System.out.println(false | false);
				System.out.println("\n============================");
				
				
//70page
	a = 10;
	b = 0;
	//false
	System.out.println(b > 0 && (a / b > 0));
	//Exception 발생
	System.out.println(b > 0 & (a / b > 0));
				
	System.out.println("\n============================");	
				
				
				
				
				
	} //main
		
	public static boolean test() {
		System.out.println("test() 메소드 실행됨");
		return true;
		
		
		
		
	}
}
