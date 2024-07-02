import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EX12 {
	public static void main(String[] args) {
		
		//392 page
		try {
			 Properties pr = new Properties();
			 
			 FileInputStream reader = 
					 new FileInputStream("C:\\workspace\\java\\j_20240702\\src\\EX12.java");
			 
			 //reader 를 Properties 객체의 load() 메소드의 argument로 넣어줌
			 
			  pr.load(reader);
			  System.out.println("pr : " + pr);
			  System.out.println("이름 : " + pr.getProperty("name"));
			  
			  // Properties에 키,벨류 추가하기
			  pr.put("subject","자바"));
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
