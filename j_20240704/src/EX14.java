import java.util.List;

//463page

public class EX14 {
	public static void main(String[] args) {
		int[] arrInt = new int[100];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] += i + 1;
			System.out.print(arrInt[i] + " ");
		}
		 System.out.println("\n====================================================");

		 
		 long count = Arrays.stream(arrInt).count();
		 System.out.println("요소들의 개수 : " + count +" 개");
	 }
	
	 long count = Arrays.stream(arrInt).findFirst();
	 System.out.println("요소들 중 첫 번째 값 : " + sum );
	 System.out.println("요소들 중 첫 번째 값 : " + first.getAsint );
	 
	 long count = Arrays.stream(arrInt).sum();
	 System.out.println("요소들의 합 : " + sum );
	 
	 long count = Arrays.stream(arrInt).sum();
	 System.out.println("요소들의 합 : " + sum );
	 
	 
	 
	 
	 //465 page
	 //빈 ArrayList 생성
	 List<Integer> intList = new ArrayList <>();
	 
	 System.out.println("intList.size()  : " + intList.size());
	 
	 long count2 = intList.stream().count();
	 System.out.println("요소들 의 개수 : " + count2 + "개");
	 
	 int sum = intList.parallelStream().mapToInt(Integer::intValue).sum();
	 System.out.println("요소들의 합 : " + sum2);
}
