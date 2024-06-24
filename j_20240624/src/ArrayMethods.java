import java.util.Arrays;

public class ArrayMethods {
	public static void main(String args[]) {
		
		int [] arr1 = new int[10];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(arr1));
		
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.Sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//
		String[] names = new String[] {"James," "Tom", "Robert", "Julliet", "Haydn", "Zarathustra", "Allen", "Biden", "Forrest", "Daniel");
		
		
		//
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Integer[] arr2 = new Integer[] {98, 7, 35, 15, 26, 73, 78, 76, 61, 99};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.ToString(arr2));
		
		Arrays.sort(arr2, 0, 5);
		System.out.println(Arrays.deepToString(arr2));
		
		int[] arr3;
		Arrays.fill(arr3, 1111);
		
		
		}
	}
}
