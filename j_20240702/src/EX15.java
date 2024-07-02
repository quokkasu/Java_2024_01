import java.util.List;

public class EX15 {
	public static void main(String[] args) {
		
		//type parameter (generic으로 지정할 type)
		Generic2<String, Integer> gen1 = new Generic2<String,Integer>();
		gen1.set("홍길동", 1111);
		System.out.println("name : " + gen1.getName());
		System.out.println("Id : " + gen1.getId());
		
		Generic2<String,String> gen2 = new Generic2<String,String>();
		gen2.set("이순신", "3333");
		System.out.println("name : " + gen2.getName());
		System.out.println("Id : " + gen2.getId());
		
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Boolean> list3 = new ArrayList<>();
		List<Character> list4 = new ArrayList<>();
		
		//list1.add(new.Integer(100));
		list1.add(100);
		list1.add(200);
		//list1.add("300");
		
//		list2.add(100);
//		list2.add(200);
		list2.add("300");
		
//	list3.add(new Boolean(false));
		list3.add(false);
		list3.add(true);
//	list3.add("300");
		
		list4.add(new Character('A'));
		list4.add(new Character('F'));
		list4.add(new Character('I'));
	list3.add("300");
		
	}
}


//Generic 을 두 개 지정한 클래스
class Generic2<K,V>{
	K name;
	V id;
	
}
