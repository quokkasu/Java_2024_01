import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Ex13 {
	public static void main(String args[]) {
		
		//Arrays 클래스의 메소드
		
		// Arrays.copyof(원본배열, 복사할 개수)
		
		int[] arr1 = new int[] {1,93,19,96,39,24,96,56,84};
		/*
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 100) + 1;
		}
		*/
		System.out.println(Arrays.toString(arr1));
		
		// arr1의 값을 arr2에 복사하기
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		// 일부만 복사하기
		int[] arr3 = Arrays.copyOf(arr1, 4);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		//Arrays.copyOfRange(원본, start, stop+1)
		//Index 3 부터 7까지 복사하기
		int[] arr4 = Arrays.copyOfRange(arr1, 3, 8);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		arr1 = new int[] {1,93,19,96,39,24,96,56,84};
		// 정렬하기 : Arrays.sort(배열) <오름차순>
		Arrays.sort(arr1);
		System.out.println("arr1 : " + Arrays.toString(arr1));

		Integer[] arr5 = new Integer[] {1,93,19,96,39,24,96,56,84};
	// 정렬하기 : Arrays.sort(배열) <오름차순>
		
		Arrays.parallelSort(arr5);
		System.out.println("arr5 : " + Arrays.deepToString(arr5));
		
		// 정렬하기 : Arrays.sort(배열) <내림차순>
		Arrays.sort(arr5, Collections.reverseOrder());
		System.out.println("arr5 : " + Arrays.deepToString(arr5));
		// 배열의 중복 제거
		arr5 = new Integer[] {1,93,19,96,39,24,96,56,84};
		
		// 배열을 List 로 변환하기 : Arrays.asList(배열)
		// List는 중복을 허용함
		 List<Integer> listInt = Arrays.asList(arr5);

		 // List 출력하기
		 System.out.println("listInt : " + listInt);
		 
		 //Set 은 중복을 허용하지 않음
		 //List 를 Set으로 변환하면 중복이 제거됨
		 // 	ㄴ List에 저장된 item(element) 을 Set에 저장함
		 // 	ㄴ Set 객체를 생성하면서 List를 argument으로 넣어줌
		 // 1) List -> Set
		 new HashSet<>(listInt);
		 HashSet<Integer> setInt1 = new HashSet<>(listInt);
		 System.out.println("setInt1 : " + setInt1);
		 
	// 2) List -> Set
		 Set<Integer> setInt2 = Set.copyOf(listInt);
		 
		 System.out.println("setInt2 : " + setInt);
		
		 // Set -> List
		 
		 ArrayList<Integer> arrList1 = newArrayList<>(setInt1);
		 System.out.println("arrList1 : " + arrList1);
		 
		 //List -> array
		 Integer[] resulint = arrList1.toArray(new Integer[arrList1.size()]);
		 
		 //중복이 제거된 array(배열)
		 System.out.println("arrlist1 : " + Arrays.toString(resultint));
		
	}
}
