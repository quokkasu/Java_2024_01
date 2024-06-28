
public class EX11 {
	public static void main(String [] args) {
		Outer3 outer = new Outer3();
		
		outer.setInnerInter(new InnerInterImpl1());
		outer.outerMethod1();
		outer.setInnerInter(new InnerInterImpl2());
		outer.outerMethod2();
	}
}

// Outer3 크래스의 내부 인터페이스 InnerInter 를 
// implements 하는 클래스
class InnerInterImpl1 implements Outer3.InnerInter{
	@Override
	public void method1() {
		System.out.println("InnerInter 클래스의 method1() 매소드");
	}
}

class InnerInterImp2 implements Outer3.InnerInter{
	@Override
	public void method1() {
		System.out.println("InnerInter2 클래스의 method1() 매소드");
	}
}

class Outer3{
	
	interface InnerInter{
		void method1();
	}
	
	InnerInter ii;
	
	void setInnerInter(InnerInter ii) {
		this.ii = ii;
	}
	
	void outerMethod1() {
		ii.method1();
	}
	


}