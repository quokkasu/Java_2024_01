//*******************************
//java에서는 생성자는 상속되지 않음
//멤버변수와 멤버메소드만 상속되고
//생성자와 초기화블럭은 상속 안됨 
//부모클래스에 있는 private 멤버변수에는 
//자식클래스에서 접근 못함
//************************************

public class Ex12 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		//The field Parent.id is not visible
		//System.out.printf("아이디 : %d, p1.id);
	//	System.out.print("아이디 : %d, 이름 : %s%n", p1.id, p1.name);
		Child ch1 = new Child();
		ch1.displayMember();
		
	}
}
class Parent{
	static int age = 21;
	private int id = 1234; 
	String name = "더조은";
	
}
class Child extends Parent{
	

//	private int id = 1234; 
//	String name = "더조은";
	
	private void diplayMember() {
		//부모클래스에 있는 private 멤버변수에는 접근 못함
		//System.out.print("아이디 : %d%n, this.id);
		System.out.printf("이름 : %s%n", this.name);
		System.out.printf("나이 : %s%n", age);
	}
	//static 메소드는 상속이 안 되지만
	//자식 클래스의 객체에서 접근은 가능함
	
	@Override
	public static void method1() {
		System.out.println("자녀클래스에서 oberride한 static 메소드 : method1() ");
		
		@Override
		public static void method1() {
			System.out.println("자녀클래스에서 정의한 instance 메소드 : method2() ");
	@Override
	public static void method1() {
		System.out.println("부모클래스에서 override 한 ");
	}
}