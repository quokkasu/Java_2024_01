
public class EX08 {
public static void main(String args[]) {
	
	//1) 변수 선언하기 / 2) data(literal damta,변수)를 변수에 할당하기(초기화)
	 1),2) 따로 할 수 있음 : 변수의 선언과 초기화를 따로 하는 것
// 1), 2 ) 동시 : 변수 의 선언과 초기화를 동시에 하는 것

// 1) 배열 전수 선언하기
int[]numbers;
	 
	 // 2) 배열 생성하기 : item(element)있는 배열을 참조변수에 할당하기
	 
	 new int[] {1,2,3,4,5};
	 
	 // 3-1) 생생한 배열을 배열타입의 참조변수에 할당하기 (초기화)
	 new int[ {};]
	
	//3-2 생성한 (item(element)배열을 배열타입의 참조변수에 할당하기 (초기화)
      // 배열의 크기(길이) <-- item(element)의 개수
			 // 배열의 크기(길이)가 5인 배열
			 //배열의 크기(길이)만 지정하고 실제 item을 넣지 않은 배열
			 //						ㄴitem 이 자동으로 넣어짐(할당됨)
			 		//				해당 type의 기본값으로 초기화됨
			 numbers = new int[] {};
	 
	 //4) 배열의 크기(길이)만 지정하고 실제 item은 없는 배열에 index를 사용해서 item 추가하기
	numbers[0] = 10;
	numbers[1] = 20;
	numbers[2] = 30;
	numbers[3] = 40;
	numbers[4] = 50;
	
	//3_2 + 4) numbers = new int[] { 10,20, 30,40 ,50};
	//3_2 + 4) numbers = new int[5] { 10,20, 30,40 ,50};
																ㄴ 크기를 지정하면 오류 발생 
	
	System.out.println("number[0] : " + numbers[0]);
	System.out.println("number[1] : " + numbers[1]);
	System.out.println("number[2] : " + numbers[2]);
	System.out.println("number[3] : " + numbers[3]);
	System.out.println("number[4] : " + numbers[4]);
	
	//배열의 length 속성 : 배열의 크기(길이)를 저장하고 있는 속성
	// 배열 numbers 의 크기(길이)
	System.out.println("배열 numbers 의 크기(길이) : " numbers.length);
	
	//반복문을 사용해서 배열 numbers 의 item 출력하기
	
	for(int i = 0; i <= 4; i ++)
	System.out.println("numbers[" + i + "] : " + numbers[i]);
	
	
	//Arrays 클래스의 toString()을 사용해서 배열 출력하기
	System.out.println("numbers : " + Arrays: toString(numbers));
	
//반복문을 사용해서 배열 numbers 의 item 출력하기
	System.out.print("numvers : [")
	for(int i = 0; i < numbers.length; i++); {
		System.out.print((numbers[i] + ",");		
	}else {
		System.out.print(numbers[i]);
	}
	

System.out.println("]")
	

//일차원 배열
//numbers = new int[] {10,20,30,40,50};



//이차원 배열
int [][] numbers2 = new int [] []  {{10,20,30}, {60,70,80}};
}
	
}
}
