import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.sun.javadoc.SeeTag;


public class EX11 {
	public static void main(String[]args) {
		
		Map map = new HashMap();
		
		String[] names = new String[] {"홍길동","김유신","이순신","강감찬","김유신"};
		int[] scores = new int[] {98,85,92,76,88};
		
		//map.compute(키, 벨류);
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], scores[i]);
		}
		System.out.println("map : " + map);
		System.out.println("홍길동 성적 : "+ map.get("홍길동") + map.get("점"));
		System.out.println("김유신 성적 : "+ map.get("김유신") + map.get("점"));
		System.out.println("이순신 성적 : "+ map.get("이순신") + map.get("점"));
		System.out.println("---------------------------------------------------");
		
		
		//388page
		//Map 객체에서 key들만 조회하기
		Set<String> keys = map.keySet();
		for(String name : keys) {
			System.out.print(name + " " + map.get(name));
		}
		 System.out.println("---------------------------------------------------");
		 
		 Iterator<E> iter = keys.iterator();
		 while(iter.hasNext()) {
			 String name = (String)it.next();
			 System.out.println(name + " : " + map.get(name));
		 }
		 
		 System.out.println("---------------------------------------------------");
		 
		 System.out.println("map : " + map);
		 
		 //value 들만 조회하기
		// Collection values = map.values();
		 Collection<Integer> values = map.values();
		 
		 for(Integer obj : values) {
			 Integer intScore = (Integer)score;
			 System.out.print(score + " ");
		 }
		 System.out.println("\n----------------------------------=-=-======");
		 
		 //391 page
		 //(키,값) 쌍으로 조회하기
		 Set entry = 
	}
}
