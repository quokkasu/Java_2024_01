
public class EX08 {
	public static void main(String[]args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		/*
		 String 클래스에서는
		 hashCode()를 문자열로 생성하도록 overriding 했기 때문에
		 문자열이 같으면 같은 hashCode 를 반환함
		 System 클래스의 static 메소드인
		 indentityHashCode()로 hashCode를 출력하면
		 주솟값으로 hashCode를 생성하기 때문에
		 같은 문자열이라고 주소가 다르면 서로 다른 hashCode를 반환함
		 */
		
		System.out.println("st1.hashCode() : " + str1.hashCode());
		System.out.println("st2.hashCode() : " + str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
