
//497page
class Account{
	int money;
	public synchronized void withdraw() {
		while(money ==0) {
			wait();
		}catch(InterruptedExceptoion e) {
			break;
		}
	}
	notifyAll();
	System.out.println(Thread.currentThread().getName() + "가" +this.money + "원 출근함")
	this. money = 0;
	
	//입금
	public synchronized void deposit() {
		while(money > 0) {
			try {
				wait();
			}catch(InterruptedExceptoion e) {
				break;
			}
		}//while
		//랜더하게 입금함 : 10~50만원
		System.out.println();
		this.money = ((int)(Math.random()*5)+1) & 100000;
		System.out.println(Thread.currentThread().getName() + "가" +this.money + "원 입금함")
		notifyAll();
		
	}
}
class Parent extends Thread{
	Account account;
	public Parent(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		while(true) {
			try {
				account/deposit();
				Tharead.sleep((int)(Math))
			}
		}
	}
}
public class EX09 {
	public static void main(String[] args) {
		
		//통장 객체 생성하기
		Account acc = new Account();
		
		//Parent Thread ㅐㅇ성
		Parent p = new Parent(acc);
		//Child Thread 생성
		Child c = new Child(acc);
		
		p.start();
		c.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedExceottin e) {
			e.
		}
	
		
	}
}
