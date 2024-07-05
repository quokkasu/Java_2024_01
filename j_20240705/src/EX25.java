import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class EX25 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		//try-with-resources 구문으로 변경하세요
		
		try {
			FileWriter	fos = new FileOutputStream("test3.txt", true);
			BufferedWriter ps = new PrintStream(fw);
			
			ps.println("더조은");
			ps.println("1111");
			ps.println("true");
			ps.println("3.14");
			ps.flush
		}
		
		try {
			fw = new BufferedWriter("test3.txt");
			
			//BufferedWriter 기능 추가
			
			bw.write('A');
			
			 char[] buf = new char[] {'B','C','D','E','F'};
			 fw.write(buf);
			 fw.write(buf,2,3);
			 fw.write("여기는 더조은 학원입니다");
			 
			 fw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
	
	}
}
