
public class EX16 {
	public static void main(String[] args) {
		//319 page : StringBuffer, StringBuilder
		
		/*
		 거의 모든 programming 언어에서
		 문자열은 immutable type 으로 되어 있음
		 						ㄴ 메모리에 한 번 올린 문자여ㄹ을 변형할 수 없음
		 */
	String str1 = "안녕하세요";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1 + "이순신 님").hashCode());
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		String str2 = "안녕하세요";
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(str2 + "이순신 님").hashCode());
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		StringBuffer sb1 = new StringBuffer ("안녕하세요 ");
		System.out.println(sb1);
		sb1 = sb1.append("이순신 님");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		sb1.append("이순신 님").append("1234567890").append("asdfqwerzfcx")
	}
}
