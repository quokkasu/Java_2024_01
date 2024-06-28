
public class Local {

	String name;
//멤버변수
	void process() {
		name = "더조은";
	}
	//멤버변수
	void printAge1() {
		int age = 20;
		System.out.println("age in printAge1() : " + age);
		
		//지역변수
		void printAge2() {
			int age = 30;
			System.out.println("age in printAge2() : " + age);
	}
}
