
public class EX02 {

	public static void main(String args[]) {
		
		//세 과목의 총점과 평균 출력하기
		int kor = 91;
		int math = 90;
		int eng = 90;
		
		int total = kor + math + eng;
		
		//int type 공간에서는 소숫점 이하 data를 표현하지 못함
	  //int average = total / 3;
		//double type 공간에서는 소숫점 이하 data를 표현함
		//int type 이하의 data type 들이 연산할 때
		// 모든 피연산자의 data type이 int type 으로 자동 형변환됨
		//int type 보다 큰 피연산자가 있는 경우에는
		// 모든 피연산자의 data type 이 가장 큰 data type으로 
		
		double average;
		//average = total / 3;
		average = (double)total / (double)3;
		average = (double)total / 3;
		average = total / (double)3;
		average = total / 3D;
		
		
		//double average = total / 3;
		System.out.println("총점 : " + total + "점, 평균 : " + average + " 점");
		
		
	System.out.printf("총점 : %d점, 평균 : %10.2f점 %n", total, average);
	System.out.printf("총점 : %d점, 평균 : %-10.2f점 %n", total, average);
		
		
	}
	
	
	
	
	
}
