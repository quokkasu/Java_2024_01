//500 PAGE
class DeamonThread extends Thread{
	@Override
	publiv void run() {
			//System.out.println(Thread.currentTh);
			System.out.println(getName() +"시작");
			while(ture) {
				try {
					//Thread.sleep(500);
					sleep(500);
				}catch (InterruptedEx)
					 
		}
	}
}
public class EX10 {

	
	
	DeamonThread dt1 = new DeamonThread();
	DeamonThread dt2 = new DeamonThread();
	
	//start()를 호출하기 전에 반드시 	DeamonThread 로 설정해야함
	//main thread에서 dt1.setDaemon(true)를 호출하면
	//dr1 thread는 main thread의 daemon thread가 되어서
	//main thread가 종료할 때 dt1 thread도 자동으로 종료됨
	dt1.setDaemon(true);
	dt2.setDaemon(true);
	
	dt1.start();
	dt2.start();
	
	try { 
		Thread.sleep(5000 );
	}catch ( InterruptedEx)
}
