
public class Ex03 {
	public static void main(String args[]) {
		
		System.out.println("프로그램 시작");
		// 181page
		//this : 생성된 객체의 주소를 저장하고 있는 참조변수
		//this() <-- 생성자 내부에서 다른 생성자를 호출하는 code
		//						생성자 내부에서 다른 생성자를 호출하는 code는
		//						생성자 내부에서 맨 첫 째 줄에 작성해야 됨
		
		//기본생성자를 호출해서 객체 생성함
		new Student3();
		
	
	System.out.println("프로그램 종료");
	}//main
}//public class Ex03

class Student3{
//Field = 멤버변수
String name;
int grade;
String department;
	
//기본 생성자
	Student3(){
	this("안중근");
	System.out.println("Student3()");
	return;
}

//parameter가 있는 생성자 1
Student3(String name){
	this("안중근",1);
	System.out.println("Student3(String name)");
	this.name = name;
	return;
	}//Student3(String name)

//parameter가 있는 생성자 2
Student3(String name, int grade){
	this("안중근", 1, "경제학과");
	System.out.println("Student3(String name, int grade, String department )");
	this.name = name;
	this.grade = grade;
	
	return;
	}//Student3(String name, int grade)

//parameter가 있는 생성자 3
Student3(String name, int grade, String department){
	
	System.out.println("Student3(String name, int grade, String department)");
	this.name = name;
	this.grade = grade;
	this.department = department;
	return;
	}//Student3(String name, int grade, String department)

//toString() 메소드 overriding 하기
//toString() 메소드 : 멤버변수의 값 확인하기
//										멤버변수의 값을 문자열로 return 해줌

public String toString() {
	//return (this.name + "은(는)" + this.grade + "학년이고" + this.department + "학과입니다");
	
	return String.format("%s 은(는) %d 학년이고 %s 학과입니다",
												this.name, this.grade, this.department);
}//public String toString
}//class Student3
