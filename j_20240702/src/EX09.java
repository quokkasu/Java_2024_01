import java.util.Iterator;
import java.util.List;

public class EX09 {
	public static void main(String[] args) {
		
//380
		 List<E> fruits = new 
				 fruits.add("포도");
		 fruits.add("배");
		 fruits.add("망고");
		 fruits.add("복숭아");
		 fruits.add("키위");
		 fruits.add("수박");
		 fruits.add("자두");
		  
		  System.out.println("fruits : " + fruits);
		  
		  for(int i = 0; i < fruits.size(); i++) {
		  	System.out.println(fruits.get(i) + " ");
		  }
		 System.out.println("\n===========================================");
		 
		 for( Object obj : fruits) {
			 String fruit = (String)obj;
			 System.out.println(fruit + " ");
		 }
		 System.out.println("\n===========================================");
		 
		 //Iterator 객체는 list 에서 iterator()를 호출해서 생성함
		 Iterator<E> iter = fruits.iterator();
		 while(iter.hasNext()) {
			 System.out.println(iter.next() + " ");
		 }
		 
		 //Iterator 객체를 일회용이라서 한 번 생성해서 사용하고나서
		 // 또다시 사용하려면 iterator() 메소드를 다시 호출해야 됨
		 iter = fruits.iterator();
		  while(iter.hasNext()) {
		  	System.out.print(iter.next() + " ");
		  	iter.remove();
		  }
		  
		  
	}
	
	
}
