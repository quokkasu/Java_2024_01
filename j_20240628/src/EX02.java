
public class EX02 {
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println("잉크 : " + Complexer.INK);
		System.out.println("팩스번호 :  " + Complexer.FAX_NUMBER);
		
		com.print1();
		com.scan();
		com.send("02-8754-5421");
		com.receive("02-1234-5678");
	}
}

// 246 page
interface Printer {
	
	int INK = 100;
	void print1();
}

 interface Scnner{
	 
	 void scan();
 }

 interface Fax{
	 String FAX_NUMBER = "02-1234-5678";
	 void scan( String tel);
	 void receive(String tel);
 }
	 
 class Complexer implements Printer, Scanner, Fax{
	 @Override
	  public void print1() {
		 String tel;
		System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 전송");
	 }
	 @Override
	 void scan() {
	 System.out.println(FAX_NUMBER + "스캔 실행");
	 }
	 @Override
	 void send(String tel) {
	 System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 수신");
	 }
	 
	 @Override
	 void receive(String tel) {
		 System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 수신");
	 }
	 @Override
	 public void print() {
		 System.out.println(FAX_NUMBER + "출력 실행");         
	 }
	 }
	
	 