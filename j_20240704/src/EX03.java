import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EX03 {
	
	//436page : 배열을 이용해서 stream 생성하기
public static void main(String[] args) {
	String[] nameArr = new String[] {"이순신","강감찬","안중근","유관순"};
	
	Stream<String> nameStream = Arrays.stream(nameArr);
	nameStream.forEach(name -> System.out.print(name + " "));
	System.out.println("\n===========================================");
	
	Stream<String> nameStream2 = Arrays.stream(nameArr,1,3);
	nameStream2.forEach(name -> System.out.print(name + " "));
	System.out.println("\n===========================================");
	
	//437 page : Collection 객체를 이용해서 stream 생성하기
	
	Arrays.asList(nameArr);
	List<String> nameList = Arrays.asList("이순신","강감찬","안중근","유관순");
	Arrays.asList(new String[] {"이순신","강감찬","안중근","유관순"});
	nameList.parallelStream().forEach(name -> System.out.print(name + " "));
	
	//438 page : build() 메소드
	Stream stream = Stream.builder().add("이순신")
																	.add("강감찬")
																	.add("안중근")
																	.add("유관순")
																	.build();
	stream.forEach(name -> System.out.print(name + " "));
	System.out.println("\n===========================================");
	
	//439 page : generate() 메소드 사용
	Stream<String> stream2 = Stream.generate(() -> "이순신").limit(10);
	stream2.forEach(name -> System.out.print(name + " "));
	System.out.println("\n===========================================");
	
	
//iterate() 메소드 사용
	Stream<Integer> stream3 = Stream.iterate(1,num -> num + 1).limit(5);
	stream3.forEach(name -> System.out.print(name + " "));
	System.out.println("\n===========================================");
	

	
	
	}
}
