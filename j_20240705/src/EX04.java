
/488 p age : join*()
class Sum extends Thread{
	int sum = 0;
	@Override
	public void run() {
}
public class EX04 {
	public statci void main(String[] args) {
		Sum t1 = new Suml();
		Sum t2 = new Suml();
		
		t1.start();
		t2.start();
		
		System.out.println("두 스레드의 합계 : " + (t1.sum))
	}
}
