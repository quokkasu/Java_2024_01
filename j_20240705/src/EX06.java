
public class EX06 {
	public static void main(String[] args) {
		//게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame();
		
		//player1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1. setSmartPhoneGame(game);
		p1. start();
		
		//player2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2. setSmartPhoneGame(game);
		p2. start();
	
		}
	}
			
	//스마트폰게임 클래스
class SmartPhoneGame{
	private int level; //레벨
	public int getLevel1() {
		return this.level;p
	}			
		public void increaseLeve1() {
			while(true) {
				this.level++; //레벨 1씩 증가
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {}
				//현재 스레드의 이름과 레벨 출력
				System.out.println(Thread .currentThread(). getName()+
													" Level : " this.level
;			}
			
			
			
			
			
			
			
			
			
			
			
			//Player Thread
			class Player1 extends Thread{
				private SmartPhoneGame game;
				private void setSmartPhoneGame(SmartPhoneGame) {
			}
		}
		
	}
}
