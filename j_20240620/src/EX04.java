
public class EX04 {

	public static void main(String args[]) {
		//44 page
		char a = 'A';
		
		System.out.println("a :" +a);
		
		int b = a;
		System.out.println("b :" +b);
		
		char c = 66;
		System.out.println("d : "+ c);
		
		/* int type이하의 값들이 
		 * 연산을 하게 되면 
		 * 모두 int type으로 자동으로 형변환 되어서 연산됨
		 * 
		 * 피연산자에 int type 보다
		 * 큰 자료형의 값이 섞여있으면
		 * 모두 가장 큰 type으로 자동으로
		 * 형변환되어서 연산됨
		 */
		
		int d = a+b; //65+65
		System.out.println("d :"+ d);
	}
}
