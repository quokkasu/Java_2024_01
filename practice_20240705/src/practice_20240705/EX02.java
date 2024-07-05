package practice_20240705;

public class EX02 {
	 public static void main(String[] args) {
		 
		 System.out.println("프로그램 시작");
		 //485page
		 Thread t1 = new Thread(new Runnable(){
			 @Override
			 public void run() {
				 System.out.println("Thread 시작");
				 
				 Thread t1 = new Thread(new Runnable() {
					 @Override
					 public void run() {
						 try {
							 int i = 1;
							 while(true) {
								 System.out.println("t1 - " : i);
								 
								 Thread.sleep(1000);
								 i++;
							 }
							 }
				 })
						 try {
							 
						 }catch(InterruptedException e) { }
			 }//for
				 System.out.println("Thread 종료");
		 }//run
		
	 }//익명클래스
t1.start();
System.out.println("프로그램 종료");

