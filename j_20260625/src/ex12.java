
public class ex12 {
	public static void main(String args[]) {
		System.out.println("프로그램의 시작");
		one();
		System.out.println("프로그램의 종료");
		return;
		
		
	}//main
	
	public static void one() {
		one();
		System.out.println("one() 메소드");
		return;
			}
	
		public static void two() {
			two();
			System.out.println("two() 메소드");
			return;
		}
			
			public static void three() {
				three();
				System.out.println("three() 메소드");
				return;
				}
}
