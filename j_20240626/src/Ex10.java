import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		//142page :6장 연습문제
		
		int[] score= {90,80,60,100};
		
		int totalScore = 0;
		double average = 0;
		
		for(int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		average = totalScore / (double)score.length;
		System.out.printf("총점 : %d점, 평균 : %.2f 점", totalScore, average);
		// 4과목의 성적인 경우
		//과목 수 보다 하나 더 큰 배열을 생성해서
		// 총점은 마지막 index에 저장하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과목의 수를 입력하세요 : ");
		int subject = sc.nextInt();
		
		int[] scroe2 = new int[subject+1];
		average = 0;
		
		for(int i = 0; i < score2.length-1; i++) {
			System.out.printf("%d 번째 성적을 입력하세요 : ", i+1);
			score2[i] = sc.nextInt();
			Score2 [score2.length-1] += score2[i];
		}
		average = totalScore / (double)score.length;
		System.out.printf("총점 : %d점, 평균 : %.2f 점", totalScore, average);
		
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = new int[10];
		//num1 출력
		for(int i=0; i< num2.length; i++) {
			num2[i] = num1[i] * num[i];
			//num1 출력
			for(int i=0; i< num2.length; i++) {
				System.out.println(num2[i] + " ");
				
		}
	}
}
