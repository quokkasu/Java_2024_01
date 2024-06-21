
public class EX18 {
public static void main(String args[]) {
	
	// switch 문
	
	int score = 80;
	char grade =' ';
	
	
	if(0 <= score && score <= 100) {
	switch(score/10) {
	case 10: case 9:
	grade = 'A';
	break;
	case 8:
		grade = 'B';
		break;
	case 7:
		grade = 'C';
		break;
	case 6:
		grade = 'D';
		break;
    default:
    	grade = 'F';
	
	}
	
	System.out.printf("당신은 %c 학점입니다%n", grade);
	
	}else {
		System.out.printf("성적을 올바르게 입력해 주세요");
	}
	
	
	
	
	
	
	
}
}
