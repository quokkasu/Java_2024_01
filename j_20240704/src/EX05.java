import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class EX05 {
	public static void main(String[]args) {
		Stream<String> stream = null;
		try {
			//Paths.get()사용
			Path path = Paths.get("C:/workspace/java/j_20240704/src/EX04.java");
			stream = Files.lines(path, Charset.defaultCharset());
			stream.forEach(str -> System.out.println(str));
			 System.out.println("\n===========================================");
			
			//BufferdeReader 의 lines() 메소드 사용
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferdeReader br = new BufferdeReader(fr);
			br.lines().forEach(str -> System.out.println(str));
			 System.out.println("\n===========================================");
			 
		}catch(Exception e) {
			
		}finally {
			if(br ! =)
			if(fr != null) {fr.close();}
			if(stream != null) {stream.close();}
		}
	}
}
