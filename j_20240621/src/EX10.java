
public class EX10 {
public static void main(String args[]) {
	
	//72page
	// Integer.toBinaryString(3) : 10진수를 2진수로 바꿔서 문자

	System.out.println(Integer.toBinaryString(3));
	System.out.println(Integer.toBinaryString(64));
	System.out.println(Integer.toBinaryString(10));
	System.out.println(Integer.toBinaryString(5));
	
	int num1 = 10;
	result = num1 ^ num2;
	//^ : 1이 하나 있을때 1
	System.out.println("result : " + result);
	
	result = num1 ^ num2;
	//^ : 1이 하나 있을때 1
	System.out.println("result : " + result)
	
	result = ~num1 & num2;
	//^ : 1이 하나 있을때 1
	System.out.println("result : " + result)
	
	//3에 ~비트연산자와 사용한 경우
	System.out.println("~3" : + ~3);

	Ststem.out.println(Integer.toBinaryString(3));
	Ststem.out.println(Integer.toBinaryString(~3));
	Ststem.out.println(Integer.toBinaryString(3).length());
	Ststem.out.println(Integer.toBinaryString(~3).length());
	
	//2147483647
	Ststem.out.println(Integer.MAX_VALUE);
	//-2147483648
	Ststem.out.println(Integer.MIN_VALUE);
	//2147483646
	Ststem.out.println(Integer.MAX_VALUE - 1);
	
	//Integer.parserInt(문자열) : 문자열을 정수(Integer)로 변환함
	
	System.out.println(Integer.parseInt("1111111111111111111111111111100",2)-Integer.MAX_VALUE-1);
	
	//Integer.parseInt(문자열) : 문자열을 정수(Integer)로 변환함
	
	// 2진수 1100을 10진수로 변환함
	System.out.println(Integer.parseInt("1100",2));
	System.out.println(Integer.parseInt("1010",2));
	System.out.println(Integer.parseInt("0010",2));
	System.out.println(Integer.parseInt("0101",2));
	
	// 16진수 A를 10진수로 변환함
	System.out.println(Integer.parseInt("A",16));
// 8진수 12를 10진수로 변환함
	System.out.println(Integer.parseInt("12",8));
	

	
	
	
	
	
}
}
