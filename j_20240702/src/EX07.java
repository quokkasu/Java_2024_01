import java.util.Arrays;
import java.util. HashSet;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class EX07 {
	//372 page
}
public static void main(String[] args) {
	
	//Object type의 배열 생성
	//  ㄴ 서로 다른 type의 data를 저장할 수 있음
	
	Object[] arrObj = new Object[] {"홍길동","이순신","홍길동","이순신",1,2,"1","2"};
	System.out.println("arrObj : " + Arrays.ToString(arrObj));
	
	//배열을 리스트로 변환하기 : Arrays.asList(배열);
	List list = Arrays.class asList(arrObj);
	System.out.println("list : " + list);
	
	//리스트를 Set으로 변환하기
	// 생성자의 argument 에 리스트를 넣어주면 됨
	
	Set setw = new HashSet();
	System.out.println("set1 : " + set1);
	
	//Set 객체의 배열의 모든 item 을 add 하기
	for (int i =0; i < arrObj.length; i++) {
		set2.add(arrObj[i]);
		System.out.println("set2 : " + set2);
		
		//373page
		Set set = new HashSet();
		
		set.add(new String("hello"));
		set.add(new String("hello"));
		
		System.out.println("set : " + set);
		
		set.add(new Student("더조은",21));
		set.add(NEW Student("더조은",21));
	}
}

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " : " + this.age;
	}
}