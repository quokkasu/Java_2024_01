import java.util.Date;  

//306page
public class EX10 {
	public static void main(String[]args) {
		
		Date now = new Date();
		System.out.println("now :" + now);
		
		Person2 p = new Person2();
		System.out.println("p : " +p);
		
		String name = new String("안중근");
		System.out.println("이름 : " + name);
	}
}

class Person2{ }