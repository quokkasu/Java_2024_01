import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//523
public class EX23 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		//try-with-resources
	}try  {
		fos = new FileOutputStream("print.txt", true);
		ps = new PrintStream(fos);
		
		ps.println("더조은");
		ps.println("1111");
		ps.println("true");
		ps.println("3.14");
		ps.flush();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(pf != null) {as.close();}
			if(fos != null) {fos.close();}
		}
	}
}
