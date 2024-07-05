
public class EX03 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			System.out.println("프로그램 시작");
			@Override
			public void run() {
				int i = 1;
				while(true) {
					System.out.println("t1 - " + i);
					i++;
					if(Thread.interrupted()) {
						break;
					}
				}
				System.out.println("Thread 종료");
			}//run
		});
		
	t1.start();
	
	try {
		//main method 에서 호출함
		//  ㄴ main thread 가 실행함
		//main thread 의 실행이 10초 중지됨
		//다음에 나오는 code는 10초 이후에 실행됨
		Thread.sleep(3000);
	}catch(InterruptedException e) { }
	
	
	System.out.println("프로그램 종료");
	}
}
