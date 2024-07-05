import java.io.File;

//5278 page
public class EX27 {
	public static void main(String[] args) {
		
		File file = new File("test4.txt");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.length());
	}
}
