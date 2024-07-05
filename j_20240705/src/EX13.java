import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX13 {
	public static void main(String [] args) {
		int data= 0;
		
		try {
//			FileInputStream fis = new FileInputStream("C:\\workspace\\java\\j_20240705\\test01.txt");
			//byte기반이라서 한국말이 깨짐
//			FileInputStream fis = new FileInputStream("C:\\workspace\\java\\j_20240705\\src\\EX12.java");
			while((data = fis1.read()) != -1) {
				System.out.println(data);
			}
	}catch (IOException e) {
		e.printStackTrace();
	}
}
}
