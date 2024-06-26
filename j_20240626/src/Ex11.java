//*******************************
//java에서는 생성자는 상속되지 않음
//멤버변수와 멤버메소드만 상속되고
//생성자와 초기화블럭은 상속 안됨 
//************************************

public class Ex11 {
	public static void main(String[] args) {
		
	}
}

}

/*
 JAVA 에서 모든 생성자의 첫 번째 줄에는
 부모 클래스의 기본 생성자를 호출하는 code가 있음
 (생략 가능함)
 */
class Calc5 extends Calc4{
	
	public Calc5() {
		super(); 
	}
		public Calc5(int number1, int number2) {
			super(number1, number2);
	}
	pubilc double modNum() {
		result = number1 % number2;
		return result;
	}
class Calc4{
	int number1;
	int number2;
	int result;
	public static void main(String[] args) {
		
		Calc4 c1 = new Calc4(10,8);
		System.out.println("덧셈결과 : " + c1.addNum());
		System.out.println("뺄셈결과 : " + c1.subNum());
		System.out.println("곱셈결과 : " + c1.multiNum());
		System.out.println("나눗셈결과 : " + c1.divideNum());
		
		Calc4 c2 = new Calc4(12,7);
		System.out.println("덧셈결과 : " + c2.addNum());
		System.out.println("뺄셈결과 : " + c2.subNum());
		System.out.println("곱셈결과 : " + c2.multiNum());
		System.out.println("나눗셈결과 : " + c2.divideNum());
		
		Calc4 c3 = new Calc4(8,3);
		System.out.println("덧셈결과 : " + c3.addNum());
		System.out.println("뺄셈결과 : " + c3.subNum());
		System.out.println("곱셈결과 : " + c3.multiNum());
		System.out.println("나눗셈결과 : " + c3.divideNum());
		
		Calc4 c51 = new Calc4(8,3);
		System.out.println("덧셈결과 : " + c51.addNum());
		System.out.println("뺄셈결과 : " + c51.subNum());
		System.out.println("곱셈결과 : " + c51.multiNum());
		System.out.println("나눗셈결과 : " + c51.divideNum());
	}
	}
//object 클래스 : 모든 클래스의 최상위 클래스
//extends object 을 생략해서 작성함
//class A extends object { }
class A { }

A() {
super();
	
	
	Calc4 c1 = new Calc4() { }
	Calc4 c1 = new Calc4(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	public double addNum() {
		result = number1 + number2;
		return result;
	}
	
	public double subNum() {
		result = number1 + number2;
		return result;
	}
	
	public double multiNum() {
		result = number1 + number2;
		return result;
	}
	
	public double addNum() {
		result = number1 + number2;
		return result;
	}
	public double addNum() {
		result = number1 + number2;
		return result;
	}
}