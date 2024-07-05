import java.io.FileReader;
import java.io.IOException;

//515page : 문자 기반 입력 시스템
public class EX17 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\workspace\\java\\j_20240705\\EX18.txt");
			while((data = fr.ready()) != -1) {
				System.out.print(data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null)
		}
		
	}
}
