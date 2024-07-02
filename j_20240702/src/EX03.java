import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class EX03 {
	public static void main(String[] args) {
		
		
		// 344PAGE
		String[] arrNames = new String[] {"홍길동","이순신","강감찬","김유신"};
		Arrays.fill(arrNames, "임꺽정");
		for(String name : arrNames) System.out.print(name + ",");
		System.out.println();
		Arrays.fill(arrNames, 1,3,"X");
		for(String name : arrNames) System.out.print(name + ",");
		 System.out.println();
		 
		 
		 //345
		  DecimalFormat df1 = new DecimalFormat("###,###,###");
		  DecimalFormat df2 = new DecimalFormat("000,000");
		  
		  System.out.println(df1.format(5500));
		  System.out.println(df2.format(5500));
		  
		 //346
		 double[] scores = new double[] {90,555,80,666,7,07777,60,666666,50,5};
		  DecimalFormat df = new DecimalFormat("#,###.00");
		  
		  for(int i = 0; i < scores.length i++) {
		  	System.out.println(df.format(scores[i]));
		  	
		  	//347page
		  	
		  	Date now = new Date();
		  	System.out.println(now);
		  	SimpleDateFormat sf = new SimpleDateFormat("yyyy mm dd HH:mm:ss E a");
		  	 System.out.println(sf.format(now));
		  	 
		  	 //348
		  	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		  	 String strDate = "2020-06-13";
		  	 
		  	 Date d = null;
		  	 try {
		  		 d = sdf.parse(strDate);
		  	 }catch(Exception e) {
		  		 e.printStackTrace();
		  	 }
		  	 System.out.println(d);
		  	 
		  	 SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-mm-dd E요일");
		  	 System.out.println(sf2.format(d));
		  }
	}
}
