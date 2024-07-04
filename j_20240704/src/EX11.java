import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EX11 {
	public static void main(String[] args) {
		String name = new String("더조은");
		List<String> nameList = Arrays.asList("이순신","유관순","강감찬","윤봉길");
		
		System.out.println("--기본 정렬 (오름차순) --");
		nameList.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("--내림차순 정렬 --");
		nameList.stream().sorted(Comparator.reverseOrder())
										 .forEach(System.out::println);
		System.out.println();
	}
}
