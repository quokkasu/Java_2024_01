
public class EX10 {
	public static void main(String args[]) {
	
  	//122~123 page
  	//lotto 배열 생성하기
  	int[] lotto = new int[6];
  	
  	//lotto 배열에 값 저장하기
  	//1부터 45까지의 
  	
  	
  	int idx = 0;
  	while(true) {
  		// 1부터 ~ 45까지의 정수 중에서 임의의 정수 발생시키기
  		int number = (int)(Math.random()* 45) + 1;
  		
  		boolean insert = true;
  		for(int i = 0; i <= idx; i++) {
  			// 중복된 값은 저장하지 않기
  			// lotto[i] : 이미 저장된 값
  			//number : 새로 얻은 값(Math.random())
  			if(lotto[i] == number) {
  				insert = false;
  				break;
  				
  			} //if
  		} // for
  		
  		if(insert == true) {
  			lotto[idx] = number;
  			idx++; 
  		} //if
  		
  	
  		if(idx == 6) { break; }
  		
  	} //while 반복문 빠져나가기
  	
  
  
	
    //lotto 번호 출력하기
    System.out.println("= lotto 번호 출력하기 =");
    //length 속성을 이용한 for 문
    for(int i = 0; i < lotto.length; i++) {
    	System.out.print(lotto[i] + " ");
    } 
    System.out.print("\n=================");
	
	
	}
}
