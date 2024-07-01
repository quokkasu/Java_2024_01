
public class EX03 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		 
		Outer.Inner inner = outer.new Inner();
		System.out.println("이름 : " + inner.name);
	}
}
// 10장 2번 문제 : 596 page
class Outer{
	class Inner{
		String name = "자바";
	}
}
