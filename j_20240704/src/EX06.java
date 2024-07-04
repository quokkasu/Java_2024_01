
public class EX06 {
	public static void main(String[] args) {
		
		
		
		//distinct()메서드로 중복 제거 후 내부 반복자로 출력
		System.out.println("--distinct--");
		namelist.stream().distinct().forEach(name -> System.out.print(name + ""));
		System.out.println("\n===============================");
		
		//"안"으로 시작하는 문자열 filtering하기
		System.out.println("--filter--");
		nameList.parallelStream().filter(name -> name.startsWith("안"))
																		.forEach(name -> System.out.print(name + " "));
		
		System.out.println("\n===============================");
		
		//중복을 제거하고
		//"안"으로 시작하는 문자열 filtering하기
		System.out.println("--dustubct + filter-- ");
		nameList.parallelStream().distinct()
														 .filter(name -> name.startsWith("안"))
														 .forEach(name -> System.out.print(name + " "));
		System.out.println("\n===============================");
		
	}
}
