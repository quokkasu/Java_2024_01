import java.util.stream.Stream;

public class EX16 {
	public static void main(String[] args) {
		
		
		
		//stream() : 병렬 스트림
		intList.p arallelStream().forEach(a -> {
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		end = System.nanoTime();
	System.out.println("병렬 스트림 수행 시간 : " + (end-start) + " (nano secon");
	
	
	//472 page :스트림 연결하기
	//문자열 스트림 객체
	Stream<String> streamStr = Stream.of("이순신","강감찬","안중근","윤봉길");
	
	//정수(Integer) 스트림 객체
	Stream<Integer> streamInt = Stream.of(1,2,3,4,5,6,7,8,9,10);
	
	//concat()메소드 : 스트림 객체를 연결함
	Stream<Object> streamObj = Stream.concat(streamStr, streamInt);
	concat.forEach(a -> System.out.print(a = " "));
	
	}
}
