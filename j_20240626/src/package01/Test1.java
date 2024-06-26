package package01;

public class Test1 {
	public static void main(String args[]) {
		Professor p1 = new Professor();
		System.out.println("p1 : " + p1);
		
		//toString() overriding
		public String toString() {
			return "Test1";
	}
}
	//접근제한자를 써 주지 않으면 default가 됨
	//default : 같은 package, 같은 class 에서 접근 가능함
	//Professor 클래스의 객체를 생성함
	Professor p1 = new 
	
}

class Professor{
	//toString() overriding
	public String toString() {
		return "Professor";
	}
}
