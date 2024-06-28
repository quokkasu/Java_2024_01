
public class EX06 {
	public static void main(String[]args) {
		Child ch = new Child();
		ch.method1();
		ch.method2();
		
		Inter4.staticMethod();
		Inter5.staticMethod();
	}
}

class Parent{
	public void method2(){
		System.out.println("Parent 클래스의 method2() 메소드");
	}
}//class Parent end



class Child extends Parent implements Inter4, Inter5{
@Override
public void method1() {
	System.out.println("Child 클래스의 method1() 메소드");
}
@Override
public void abstractMethod4() {
	System.out.println("Child 클래스의 abstractMethod4() 메소드");
}
@Override
public void abstractMethod5() {
	System.out.println("Child 클래스의 abstractMethod5() 메소드");
}


interface Inter4{
	public	void abstractMethod4();
}
   default void method1() {
  	  System.out.println("Inter4 인터페이스의 default 메소드 method1()");
   }
   default void method2() {
 	  System.out.println("Inter4 인터페이스의 default 메소드 method2()");
}
   default void staticMethod() {
  	  System.out.println("Inter4 인터페이스의 default 메소드 staticMethod()");
 }
}
interface Inter5{
	void abstractMethod5();
	default void method1() {
	  System.out.println("Inter5 인터페이스의 default 메소드 method1()");
	  
 }
	 default void staticMethod() {
 	  System.out.println("Inter5 인터페이스의 default 메소드 staticMethod()");
}
}//interface inter5 end
