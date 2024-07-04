import java.util.Arrays;
import java.util.List;

public class EX09 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("동해물과","백두산이","마르고 닳도록");
		System.out.println("list1 : " + list1);
		
		System.out.println("함수적 인터페이스 방식");
		list1.stream().mapToInt(str -> str.length())
									.forEach(len -> System.out.print(len + " "));
		 System.out.println("\n====================================================");
		System.out.println("메소드 참조 방식  - : 연산자 사용");
		list1.stream().mapToInt(len -> len.length())
									.forEach(len -> System.out.print(len +  " "));
									 System.out.println("\n====================================================");

	}
	/*
	private int func(String len) {
		String str = len;
		return str.length();
	}*/
	//mapToInt(len -> { String str = len; str.length(); });
	
}
