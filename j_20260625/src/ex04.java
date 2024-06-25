
public class ex04 {
	public static void main(String args[]) {
		//Car 클래스의 객체 생성하기
		//new 클래스이름();
		Car tico = new Car();
		Car pride = new Car();
		
		tico.name ="티코";
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		pride.name ="프라이드"
				pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";
		
		tico.go();
		tico.back();
		
		pride.go();
		pride.back();

		System.out.println(tico.name + "의 이름 : " + tico.name);
		System.out.println(tico.name + "의 색상 : " + tico.name);
		System.out.println(tico.name + "의 회사 : " + tico.name);
		System.out.println(tico.name + "의 타입 : " + tico.name);
		
		System.out.println(tico.name + "의 이름 : " + tico.name);
		System.out.println(tico.name + "의 색상 : " + tico.name);
		System.out.println(tico.name + "의 회사 : " + tico.name);
		System.out.println(tico.name + "의 타입 : " + tico.name);
		
		System.out.println(pride.name + "의 이름 : " + pride.name);
		System.out.println(pride.name + "의 색상 : " + pride.name);
		System.out.println(pride.name + "의 회사 : " + pride.name);
		System.out.println(pride.name + "의 타입 : " + pride.name);
		
		System.out.println(pride.name + "의 이름 : " + pride.name);
		System.out.println(pride.name + "의 색상 : " + pride.name);
		System.out.println(pride.name + "의 회사 : " + pride.name);
		System.out.println(pride.name + "의 타입 : " + pride.name);
	}
}
//152page
class Car{
	//클래스 = 멤버변서 + 멤버메소드
	//필드 (멤버변수)
	String color;
	String company;
	String type;
	
	//멤버메소드
	public void go() {
		System.out.println(name + " 전진하다");
	}
	public void back() {
		System.out.println(name + " 후진하다");
	}
}
