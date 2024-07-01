//9장
//265page
interface Player{
	void paly();
}

class BaseBallPlayer implements Player{
	@Override
	public void play() {
		 System.out.println("야구선수가 야구를 합니다");
	}
}
class FootBallPlayer implements Player{
	@Override
	public void play() {
		 System.out.println("축구선수가 축구를 합니다");
}
}
//9장 4번
//266page
public class EX02 {
	public static void main(String[] args) {

	// Anonymous Class (익명 클래스)
		
		Tv tv1 = new Tv() {
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다");
			}
		};
		
		
		//3번
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		EX02.playGame(p1);
		playGame(p2);
	}
	public static void playGame(Player p) {
		p.play();
	}
}

