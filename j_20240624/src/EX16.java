
public class EX16 {
	public static void main(String args[]) {
		
		// int [3][] : 3행이면서 각 열의 크기를 정해져있지 않음
			int[][] arrInt = new int [3][];
			
			arrInt[0] = new int[] {1};
			arrInt[1] = new int[] {2, 3};
			arrInt[2] = new int[] {4, 5, 6};
			
			for(int row = 0; row < arrInt.length; row++) {
				 for(int column = 0; column < arrInt[row].length; column++) {
					 System.out.printf("%d ", arrInt[row][column]);
			}
				 System.out.println();
			}
	}
}
