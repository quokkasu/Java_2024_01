import java.io.IOException;
import java.io.OutputStream;

public class EX22 {
	public static void main(String[] args) {
	//OutputStream out = null;
		//한글 처리 안 됨 : byte Stream 이라서...
		//                        
		Write out = null;
		
		try {
			//out = System.out;
			out = new OutputStreamWriter(System.out);{
			//console 창에 write 함
			out.write('a');
			out.write('b');
			out.write('c');
			out.write('1');
			out.write('2');
			out.write('3');
			out.write('가');
			out.write('나');
			out.write('다');
			out.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}fi
	}
}
