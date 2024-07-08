import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//544 page
public class EX06 {
	public static void main(String[] args) {
		
		//서버 소켓 생성하기 : 클라이언트로부터 접속이 들어오는지 관찰함
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9999);
			
			// 클라이언트로부터 접속이 들어오는지 관찰하면서 대기함
			while(true) {
				System.out.println("서버가 클라이언트의 접속을 기다림");
				System.out.println("..대기 하다가 클라이언트가 (서버가 열어놓은 port로 접속해오면");
				System.out.println("server socket()이 accept() 메소드를 호출해서 client의 접속을 허용함");
				Socket sSocket = server.accept();
				System.out.println("Thread 생성");
				HttpThread ht = new HttpThread(sSoket);
			}
		}catch(Exception e) {
			
		}
		
	}//main
}//class

class HttpThread extands Thread{
	private Socket cSocket;
	BufferedReader br;
	PrintWriter pw;
	HttpThread(Socket cSocket){
		this.cSocket = cSocket;
		try {
			br = new BufferdeReader(new InputStreamReader(cSocket.getInputStream()));
			pw = new PirntWriter(cSocket.getOutputStream());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void run() {
		BufferedReader fbr = null;
		DataOutputStream outToClient = null;
		try {
			String line = br.readLine(); 
			System.out.println("Http Header : " + line);
			int start = line.indexOf("/") - 1;
			int end = line.lastIndexOf("HTTP") -1;
			String fileNmae = line.slubstring(start, end);
			if(fileName.contentEquals("")) {
				fileName = "index.html";
			}
			System.out.println("사용자 요청 파일 : " + fileName);
			fbr = new BufferedReader(new FileReader(fileName));
			String fileLine = null;
			pw.println("HTTP/1.0 200 Document Follows \r\n");
			while((fileLine = fbr.readLine()) != null) {
				pw.println(fileLine);
				pw.flush();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage())
		}finally {
			                                                      
		}
	}
}
