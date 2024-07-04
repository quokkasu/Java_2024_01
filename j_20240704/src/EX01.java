
public class EX01 {
public static Student[] studentArr = new Student[] {
												new Student("이순신",90,80,"컴공");
												new Student("강감찬",95,92,"통계");
												new Student("김유신",100,60,"빅데이터");
												new Student("안중근",86,92,"컴공");
												new Student("윤봉길",93,81,"통계");
												new Student("양만춘",100,100,"빅데이터");
}
}
public static void main(String[] args) {
	//컴공 학과 학생의 영어 평균 점수
	
	double averageEng = avgeng(t -> t.getMajor(). equals("통계"));
	System.out.println("컴공 학과 학생의 영어 평균 점수 : " + averageEng2 + "점");
	
	//통계 학과 학생의 영어 평균 점수
	
	double averageEng = avgeng(t -> t.getMajor(). equals("통계"));
	System.out.println("통계 학과 학생의 영어 평균 점수 : " + averageEng2 + "점");
	
	//빅데이터 학과 학생의 수학 평균 점수
	
	double averageEng = avgeng(t -> t.getMajor(). equals("빅데이터"));
	System.out.println("빅데이터 학과 학생의 영어 평균 점수 : " + averageMath + "점");
}
private static double avgMath(Predicate<Student> predicate) {
	int count = 0;
	int sum = 0;
	for(Student student : studentArr) {
		//equals() 비교
		if(predicate.)
	}
}