import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//510~511 page
// 한글을 입력받기 위해서 InputStreamReader를 사용함
//InputStreamReader 의 조상 클래스는 Reader
public class EX12 {
public static void main(String[] args) {
	
	int data = 0;
	
	try {
		Reader in = new InputStreamReader(System.in);
		System.out.print("문자 하나를 입력하세요 ( 종료:q) : ");
		
		while (true) {
			data = in.read();
			if (data == 13 || data == 10) {
				continue;
			}
			
//			//정수인 ASCII CODE 를 출력함
			//System.out.println(data);
//			//입력한 문자를 출력함
			 System.out.print((char)data);
			 
			 if(data == 113) {
				 System.out.println("입력을 종료합니다");
			 }
				System.out.print("문자를 입력하세요  ( 종료:q) : ");
		}
	}catch(IOException e) {
		
	}
}
}
