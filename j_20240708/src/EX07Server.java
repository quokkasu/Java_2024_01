import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EX07Server {
	public static void main(String[] args) {
		try {
			DatagramSocket = Socket = new DatagramSocket(9500);
			DatagramSocket inPacket;
			byte[] messages = null;
			while(true) {
				// data 수신용 byte 배열
				messages = new byte[1024];
				//DatagramPacket 객체 생성
				inPacket = new DatagramPacket(messages1, messages1.length);
				//packet data 수신
				Socket.receive(inPacket);
				//문자열로 저장하기
				String message = new String(messages, 0, inPacket.getLength());
				System.out.println("Client Message : " + message);
				
				//Client IP
				InetAddress address = inPacket.getAddress();
				System.out.println("Client ip address : " + address);
				//Client Port
				System.out.println("Client port number : " + port);
			}
		}catch(Exception e) {
			
		}
	}
}
