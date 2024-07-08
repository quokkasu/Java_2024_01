import java.net.URL;
import java.net.URLConnection;

public class EX04 {
	public static void main(String[] args) {
		URL url = null;
		String address = "http://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUstInteraction() : " + conn.getAllowUstInteraction);
			System.out.println("getConnectionTimeout() : " + conn.getConnectionTimeout);
			System.out.println("getContent() " + conn.getContentEncoding());
			System.out.println("getContentEncoding() " + conn.getConnectEncoding());
			System.out.println("getContentLength h() " + conn.getContentLength());
			System.out.println("getContentType() : " + conn.getContentType);
			System.out.println("getDate() " + conn.getDate);
			System.out.println("getDefaultAllowUserInteraction() + " conn.getDefaultAllowUserInteraction);
			System.out.println("getDefaultUseCaches() + " conn.getDefaultUseCaches);
			System.out.println("getDoInput() + " conn.getDefaultAllowUserInteraction);
			System.out.println("getDoOutput() + " conn.getDoInput);
			System.out.println("getExpiration() + " conn.getExpiration);
			System.out.println("getHeaderFields() + " conn.getHeaderFields);
			System.out.println("getIfModifiedSince() + " conn.getIfModifiedSince);
			System.out.println("getLastModifiedSince() + " conn.getLastModifiedSince);
			System.out.println("getURL() + " conn.getURL);
			System.out.println("getUstCaches() + " conn.getUstCaches);
		}
	}
}
