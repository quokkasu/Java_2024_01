
public class EX05 {
public static void main(String arge[]) {
	
	//1234 -> 1200
	// 123 -> 100
	// 일의 자릿수 구하기 : number % 10
	// 십의 자릿수 구하기 : number % 100
	// 백의 자릿수 구하기 : number % 1000
	// 1234 /100 <-- 12
//(1234 /100) * 100 <-- 1200
	
	int number = 1234;
	int result = (number / 100) * 100;
	System.out.println("result " + result);
	
	number = 1234;
	result = number - (number % 100);
	System.out.println("result " + result);

	number = 1234;
	result = number - (number % 1000);
	System.out.println("result " + result);
	
	
}
}
