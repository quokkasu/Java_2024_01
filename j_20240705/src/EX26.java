import java.io.FileWriter;
import java.io.IOException;

public class EX26 {
	public static void main(String[] args) {
		
		BufferedWriter fw = null;
		
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
		} finally {
			if(bw != null) {bw.close();}
			if(fw != null) {fw.close();}
		}catch(IOException e) {
			e.printStackTrace();
	}
}
