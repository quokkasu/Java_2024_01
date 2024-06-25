
public class ex13 {
	public static void main(String args[]) {
		//169page
		System.out.println(divide(pow(add(3, 3))));
		
	}//main
	
	static int add(int x, int y) {
		return x + y;
	}//add
	
	static int pow(int x) {
		return x * x;
	}//pow
	
	static int divide(int x) {
		return x / 2;
	}//divide
	
	
}//class
