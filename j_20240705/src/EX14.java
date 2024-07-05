import java.io.FileInputStream;
import java.io.IOException;

public class EX14 {
	public static void main(String[] args) {
		
		int data = 0;
		
		try (FileInputStream fis = new FileInputStream)
		{
			FileInputStream fis = new FileInputStream("C:\\workspace\\java\\j_20240705\\test01.txt");
					byte[] buf = new byte[fis.available()];
			while((data=fis.read(buf)) != -1) {
				String strData = new String(buf,0,data);
				System.out.print(strData);
			}
		//try
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {fis.close();};
		
	}
	}
