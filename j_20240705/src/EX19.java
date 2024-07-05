import java.io.FileReader;
import java.io.BufferedReader;
//518page : BufferedReader
public class EX19 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:/workspace/java/j_20240705/test01.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader 클래스의 readLine() 메소드 : 문자열을 한 줄 단위로 읽어옴
			txt = br.readLine();
			 while(true) {
				 System.out.println(txt);
				 if(txt == null) {
					 break;
				 }
			 }
		}catch(IONxception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {br. close(); }
			if (fr != null) {fr.close(); }
		}catch(IONxception e) {
	}
}
