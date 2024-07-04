
public class EX20 {
	
	//483 page : 스레드 우선 순위
	public static void main(String[] args) {
		
	Thread t1 = new Thread(() -> {
                  		System.out.println("t1 Thread 시작");
                  		for(int i = 0; i < 50; i++) {
                  			System.out.println( "t1 - " + i);
                  			});
	Thread t1 = new Thread(() -> {
	System.out.println("t2 Thread 시작");
	for(int i = 0; i < 50; i++) {
		System.out.println( "t2 - " + i);
	});
	/*
	t1.setPriority(7);
	t2.setPriority(3);
	*/
	
	t1.setPriority(Thread.MAX_PRIORITY); //10
	t2.setPriority(Thread.NORM_PRIORITY);//5
	
	//t2.setPriority(Thread.MIN_PRIORITY);//1
	
		t1.start();
		t2.start();
	
		
		
	}
}
