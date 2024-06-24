//79~80 page
public class EX01 {
 public static void main(String args[]) {
	 int colorPen = 5 * 12;
	 int studentCount = 27;
	 
	 //학생 당 나눠가지는 색연필 수 
	 int divColorPen = colorPen / studentCount;
	 
	 //똑같이 나눠가지는 색연필 수
	 int remainColorPen = colorPen % studentCount;
	 
	 System.out.println("학생 당 나눠가지는 색연필 수 : " + divColorPen);
		 System.out.println("똑같이 나눠가지는 색연필 수 : " + remainColorPen);
	 
	 
 }
}
