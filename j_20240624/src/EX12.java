import java.util.Arrays;

public class EX12 {
	public static void main(String args[]) {
		
		//배열 복사하기 : System.arraycopy() 메소드
		// Java 에서 배열은 한 번 생성하면 크기(길이)를 변경할 수 없음
		
		// 기존의 배열보다 두 배 크기의 배열 생성하기
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[arr1.length * 2];
		
		System.out.println("arr1 의 크기 : " + arr1.length);
		System.out.println("arr2 의 크기 : " + arr2.length);
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// arr1에 1 ~ 5 저장하기
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// arr1의 값을 arr2에 복사하기
		System.out.println("arr2 : " + Arrays.toString(arr2));
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i] ;
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
	
		
		//arr2의 index 3, 4, 5, 6, 7에
		//arr1 의 값 복사하기
		for(int i = 3; i < arr2.length; i++) {
			arr2[i] = arr1[i - 3];
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		//System.arraycopy() 메소드 사용하기
		//배열 1에서 배열2로 복사하는 경우
		// System.arraycopy(배열1, 배열1시작index, 배열2, 배열2시작index, 복사할 개수)
		
		// arr1의 index 0 번부터 3 개 의 item을 복사해서 
		// arr2의 index 2번 부터 붙여넣기 
	// System.arraycopy(배열1, 배열1시작index, 배열2, 배열2시작index, 복사할 개수)
		char[] arrChar1 = new char [] {'T','J', 'O','E', 'U', 'N'};
	  char[] arrChar2 = new char [] {'0','1','2','3','4','5','6','7','8','9'};
	  
	  System.out.println("arrChar1 : " + Arrays.toString(arrChar1));
	  System.out.println("arrChar2 : " + Arrays.toString(arrChar2));
	  
	  //arrChar1의 index 0번부터 3개의 item을 복사해서
	  //arrChar2의 index 2번부터 붙여넣기
	  //System.arraycopy(배열1, 배열1시작index, 배열2, 배열2시작index, 복사할 개수)
	  
	  System.arraycopy(arrChar1, 0, arrChar2, 2, 3);
	  
	  System.out.println("---- System.arraycopy 후 ---");
	  System.out.println("arrChar1 : " + Arrays.toString(arrChar1));
	  System.out.println("arrChar2 : " + Arrays.toString(arrChar2));
	  
	  //arrChar1의 index 0 번부터 5 개의 item 을 복사하고
	  //arrChar2 의 index 0 번부터 10개의 item을 복사해서
	  //arrResult 배열에 붙여넣기
	  //  ㄴ TJOEUN0123465789	
	  char[] arrResult = new char[arrChar1.length + arrChar2.length];
	  
	  System.arraycopy(arrChar1.0 arrResult, 0,  arrChar2.length);
	  System.out.println("arrChar2 : 0, arrResult, arrChar);
	}
}
