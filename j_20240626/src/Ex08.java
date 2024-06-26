/*
 final
 
 1) 변수에 사용하는 겨우 : 변수를 상수로 만듬 - 초기화 이후에는 값이 할당
 2) 메소드에 사용하는 경우 : overriding 이 안 됨
 3) 클래스에 사용하는 경우 : 다른 클래스의 부모 클래스가 될 수 없음
 															상속해 줄 수 없음
 */
class FinalTest{
	int number1;
	int number2 = 20;
	//final 을 사용해서 선언하면 상수가 됨
	//상수는 반드시 초기화해야 됨
	final int number3 = 30;
	
	final int number4;
	
	FinalTest(int number4){
		this.number4 = number4;
	}//FinalTest
}//class FinalTest
//2) 메소드에 사용하는 경우
class




//2) 메소드에 사용하는 경우 : 지식 클래스에서 overring 을 못함
class Child extends Parent{
	final public void method2() { }
}
class Child extends Parent{
/*
	@Override
public void method2() {
System.out.println("Cannot override the final method from Parent");
}
	*/
}
// 3) 클래스에 사용하는 경우 : 다른 클래스의 부모 클래스가 될 수 없음
class Parent1 { }
final class Parent2 { } 
class Child2 extends Parent1 { }
//The type Child3 cannot subclass the final class Parent2
//class Child3 extends Parent2{ }

public class Ex08 {
	static final double CARD_COMMISSION = 1.5;
	public static void main(String[] args) {
		
		//199~200 page
		//static final <-- static 이면서 final 인 변수
		System.out.println("Ex08.CARD_COMMISSION : " + Ex08.CARD_COMMISSION);
		System.out.println("원주율 : " + Math.PI);
	}//public static void main
}//public class Ex08

