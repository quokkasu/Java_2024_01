
public class EX10 {
	
	public static void main(String[] args) {
		
		//Outer2 클래스의 객체 생성
		Outer2 outer = new Outer2();
		
		//Outer2 클래스의 instance 내부 클래스
		//Inner 클래스의 객체 생성
		//외부클래스타입.내부클래스타입
		Outer2.Inner inner = outer.new Inner();
		
		//in
	}
}	
	
class Outer2{
	//외부 클래스의 멤버변수
	int value = 10;
	
	//instance 내부 클래스
	class Inner{
		//내부 클래스의 멤버변수
		int value = 20;
		
		//내부 클래스의  instance 메소드
		void mathod1() {
			 		//내부 클래스의 지역 변수
			int value = 30;
			
			System.out.println("value(내부 클래스의 지역 변수) : " + value);
			System.out.println("value(내부 클래스의 멤버 변수) : " + this.value);
			System.out.println("value(외부 클래스의 멤버 변수) : " + Outer2.this.value);
		}
	}
}
