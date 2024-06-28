
public class EX01 {
	public static void main(String args[]) {
		SmartPhone sp1 = new SmartPhone();
		sp1.name = "갤럭시";
		sp1.color  = "white";
		sp1.company = "삼성";
				
				sp1.call();
				sp1.receive();
				sp1.installApp();
System.out.println("================================================");	

				SmartPhone sp2 = new SmartPhone();
				sp2.name = "아이폰";
				sp2.color  = "black";
				sp2.company = "애플";
						
						sp2.call();
						sp2.receive();
						sp2.installApp();
System.out.println("================================================");		
						
						//부모 객체 생성
						//부모 클래스의 정보로만 생성된 객체에는
						//
						Phone p1 = new Phone();
						p1.name = "모토로라";
						p1.color = "pink";
						
						p1.company = "모토로라회사";
						p1.call();
						p1.receive();
				  	//The method installApp() is undefined for the type Phone
						//자신의 클래스에서 작성한 메소드에만 접근할 수 있음
						//부모객체에서는 자식객체에서 작성된 메소드에 접근하지 못함
						//(자식객체에서는 부모객체에서 작성된 메소드에 접근함 : 상속받음)
						//p1.installApp();
						
						/*
						 * Smartphone type
						 sp1, sp2 가 저장하고 있는 주소지에는 부모 객체도 있음
						 (자식 객체) <-- sp1, sp2로는 자식 클래스에서 추가한 data에 접근할 수 있음
						 															부모 클래스에 원래 있던 data에도 접근할 수 있음
						 
						 phone type
						 p1 이 저장하고 있는 주소지에는 부모 객체만 있음
						 (부모 객체) <-- p1으로는 자식 클래스에서 추가한 data에 접근할 수 없음
						 													부모 클래스에 원래 있던 data에만 접근할 수 있음
						 													
						 	class = type = 접근권한	
						 	Phone type 의 참조변수는
						 	Phone class 에 작성한 내용대로 메모리에 올라가 있는 data 에 접근할 수 있음
						 												
						 */
						
						//Phone p1 = new Phone();
						//Phone p2  = p1;
						//p1에는 부모 객체가 할당됨
						//p2에는 부모 객체가 할당되지 않음
						//   ㄴ p2에서는 문제
						Phone p2 = p1;
						
						//SmartPhone sp1 = new SmartPhone();
						//SmartPhone sp2 = new SmartPhone();
						Phone p3 = sp1;
						Phone p4 = sp2;
						
						//참조형 변수의 형변환(상속 관계에서만 가능함)
						//sp1, sp2는 자식 type
						//p1, p2는 부모 type
						//자식 type 의 참조변수가 저장한 주소를
						//부모 type 의 참조변수에 할당할 때는
						//형변환 연산자를 생략할 수 있음
						p2 = (Phone)sp1;
						p2 = (Phone)sp2;
						
					//자식 type 의 참조변수가 저장한 주소를
					//부모 type 의 참조변수에 할당할 때는
					//형변환 연산자를 생략할 수 없음
					//p2는 Phone type으로 선언만 됐지
					//Phone 객체의 주소를 할당받지 않은 상태
						sp1 = (SmartPhone)p2;
						//ClassCastException : ClassCast(참조형 변수의 형변환)
						//sq1 은 SmartPhone type이므로
						//실제로 주소를 할당 받을 때는
						//SmartPhone class에서 작성한 내용의 data가 
						//모두 있는 주소를
						
						//SmartPhone class에서 작성한 내용의 data는 없기 때문에..
						
						
						
						
						
						
						
						//sp1 = Exception 이 발생함
						if(p1.instanceof(SmartPhone) ) {
							sp1 = (SmartPhone)p1;
						}
						
						
						sp1 = (SmartPhone)p1;
						sp2 = (SmartPhone)p2;
						sp2 = (SmartPhone)p1;
	System.out.println("================================================");		
	
	}
	
}

class Phone{
	String name;
	String color;
	String company;
	
	Phone( ) { }
	
	//접근제한자가 default 로 되어 있음
	//public > protected > default > private
	void call() {
		System.out.println(this.name + "(으)로 전화를 건다");
	}
	void receive() {
		System.out.println(this.name + "(으)로 전화를 받다");
	}
}//class phone
/*
 * overriding
 부모에서 정의한 메소드를 상속받아서 <-- 선언부를 똑같이 작성해야 됨
 													     return type,메소드이름, Parameter(type,개수,순서)
 													     자식클래스의 메소드의 접근제한자의 범위는
 													     부모클래스의 메소드의 접근제한자의 범위와 같거나 더 넓혀야 됨
 자식에게 맞는 내용으로 해당 메소드의 body 를 변경하는 것
 
 overriding 한 자식객체의 메소드를 실행하면
 자식클래스에서 변경한(재정의한) 내용이 실행됨
 */
class SmartPhone extends Phone{
	SmartPhone(){
		super();
	}
	@Override
	void call() {
		System.out.println(this.name + " 스마트폰으로 전화를 건다");
	}
	@Override
	void receive() {
		System.out.println(this.name + " 스마트폰으로 전화를 받다");
	}
	void installApp() {
		System.out.println(this.name + "(으)로 앱을 설치함");
	}
}//class SmartPhone extends Phone