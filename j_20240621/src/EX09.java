
public class EX09 {
public static void main (String args[]) {
	
	//71 page
	// 비트 연산자 : &&(&) / |(||) / ^ (Xor)/ ~(not)
	
	// 1 0 1 0 (2)
	int num1 = 10;
	
//0 1 0 1 (2)
	int num2 = 5;
	
	
	int result = num1 & num2;
	// & : 모두 1일 때만 1
	System.out.println("result : " + result);
	
	int result = num1 | num2;
	// & : 모두 1일 때만 1
	System.out.println("result : " + result);
	
	int result = num1 ^ num2;
	// ^ : 1이 하나 있을 때
	System.out.println("result : " + result);
	
	int result = num1 & num2;
	// & : 모두 1일 때만 1
	System.out.println("result : " + result);
	//|| : 모두 0일 때만 0
	
	
	//&& : 모두 1일 때만 1
	
	
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false &&false);
	
	
	// || : 모두 0일 때만 0
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	System.out.println("\n============================");
	
	
	
	
	
	
	
	
	
}
}
