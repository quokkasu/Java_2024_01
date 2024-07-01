
public class EX15 {
	public static void main(String[] args) {
		
		//316 page
		String str = "Java is the best p programming language";
		
		System.out.println("5번째 index에 있는 문자 : " + str.charAt(5));
		System.out.println("best 문자열의 index : " + str.indexOf("best"));
		System.out.println("b 문자열의 index : " + str.indexOf("b"));
		System.out.println("b 문자열의 index : " + str.indexOf("b"));
		
		//programming 만 추출해서 출력하세요
		//substring() 메소드 사용
		//substring(start,stop) - start 부터 stop-1 까지 추출함
		//start : indexOf("p")
		//stop : indexOf("p") + indexOf(lengthOfProgramming)
		int lengthOfProgramming = "programming".length();
		System.out.println(lengthOfProgramming);
		System.out.println(str.indexOf("p"));
		
		System.out.println(str.substring(str.indexOf("p"), str.indexOf("p" + str.indexOf(lengthOfProgramming))));
		//str.indexOf("p") + str.indexOf(lengthOfProgramming)
		System.out.println(str.substring(str.indexOf("p"), 28));
		
		//System.out.println(str.indexOf("p") + str.indexOf(lengthOfProgramming));
		//str.indexOf("p") : 17
		//str.indexOf(;emgtjPf[rpgramming) : -1
		//indexOf() : 메소드는 대상문자열에 없는 문자나 문자열을 넣어주면 -1을 반환함
		//start : indexOf("p")
		//stop : indexOf("p") + indexOf(lengthOfProgramming)
		System.out.println(str.substring(str.indexOf("p"), str.indexOf("p"),lengthOfProgramming));
		System.out.println(str.substring(17, 28));
		
		//programming language
		System.out.println(str.substring(str.indexOf("P")));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.to UpperCase());
		System.out.println(str.startWith("Java"));
		System.out.println(str.startWith("Hello"));
		System.out.println(str.startWith("language"));
		System.out.println(str.startWith("Hello"));
		
		System.out.println(str.replace("the best", "a good"));
		
		//문자 g를 q로 변경하기
		System.out.println(str.replace("g", "q"));
		System.out.println(str.replaceAll                                                                                                                                                                           ("g", "q"));
	}
}
