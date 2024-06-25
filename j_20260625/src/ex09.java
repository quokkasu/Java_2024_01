 class Local {

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





public class ex09 {
	public static void main(String args[]) {
		
		//158 page
		Local local = new Local();
		System.out.println("local.name : " + local.name);
		
		local.process();
		System.out.println("local.name : " + local.name);
		
		local.printAge1();
		local.printAge2();
		
		for(int i = 0; i < 10; i++) {
		 int	temp = 0;
			temp += 1;
			System.out.println("temp : " + temp);
			
			//temp cannot be resolved to a variable
			//for 문 밖에서 int temp를 선언해서 해결함
			System.out.println("temp : " + temp);
		
	}
	}
}
