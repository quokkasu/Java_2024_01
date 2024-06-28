
public class EX02 {
	public static void main(String args[]) {
		
		//instanceof 연산자
		//참조변수 intanceof 클래스 이름(type)
  	//자식 intanceof 자신클래스 이름(type) : true 
  	//자식 intanceof 부모클래스 이름(type) : true
		//부모 intanceof 자식클래스 이름(type) : true / false
		
		//Phone p2 = new SmartPhone();
		//p2 instanceof SmartPhone : ture
		
		//Phone p1 = new Phone();
		//p1 instanceof SmartPhone : false
		Object obj = new Object();
		GrandParent gp = new GrandParent;
		Parent p = new Parent();
		Child ch = new Child();
		
		System.out.println(gp instanceof Object);
		System.out.println(p instanceof Object);
		System.out.println(ch instanceof Object);
		System.out.println(p instanceof Object);
		System.out.println(ch instanceof Object);
		System.out.println(p instanceof Object);

		
		
		System.out.println("p instanceof GrandParent : " + (p instanceof GrandParent));
		System.out.println("ch instanceof GrandParent : " + ch instanceof GrandParent);
	}
}
class GrandParent{ }
class Parent extends GrandParent{ }
class Child extends Parent{ }

