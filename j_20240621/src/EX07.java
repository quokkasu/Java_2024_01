
public class EX07 {
	public static void main(String args[]) {
		
		//66page - 논리연산자 ( &&, ||,^(배타적 논리)!(not의 의미))
		
		// && : 모두 true 일 때만 true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("\n============================");
		
		// || : 모두 false 일 때만 false
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
		
			
			
		
		
		
	}
}
