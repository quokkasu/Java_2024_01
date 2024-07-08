import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import com.sun.org.apache.bcel.internal.generic.RETURN;

//연습문제 풀이 : 11장 ~ 17장
public class EX01 {

		
		/*Override
		  public String toString(){
		  return this.name;
		  }
		  
		  12장 3번
		  
		  int num1 = Integer.parseInt(num1);
		  int num2 = Integer.parseInt(num2);
		  
		  System.out.println(num1 + num2);
		  System.out.println(result);
		  
		 */

public static void main(String[] args) {
	 
	//12장 4번
	String[] member = {"hong, 홍길동, 30","lee, 이순신, 40","kim, 김유신, 50 "};
	
	//이름 출력
	for(int i = 0; i < member.length; i++) {
		System.out.println(member[i].split(",")[1]);
	}//for
		
		//평균 나이 출력
		int ageSum = 0;
		for(int i = 0; i <member.length; i++) {
			ageSum += Integer.parseInt(member[i].split(",")[2]);
		}
		System.out.println("평균나이 : " + (double)ageSum/member.length);
		
		//13장 3번
		
		 MemberEx me1 = new MemberEx("hong","홍길동",30);
		 MemberEx me2 = new MemberEx("lee","이순신",40);
		 MemberEx me3 = new MemberEx("kim","김유신",50);
		
		List<MemberEx> memberList = new ArrayList<>();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);
		
		//전체 회원 출력 - getter 호출
		for(int i = 0; i < memberList.size(); i++) {
			//Generice(Type Parameter)를 지정하지 않은 경우에는 형변환 필수
			//MemberEx me = (memberList)
			MemberEx me = memberList.get(i);
			System.out.println(me.getId() + "," + me.getName() + "<" + me.getAge());
		}
		
		//전체 회원 출력2 - toString() 활용
		for(int i = 0; i <memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		
		//16장 2번
		String[] arr = new String[] {"a","b","c","d","e","f"};
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n=======================================");
		
		for(String alphabet : arr) {
			System.out.print(alphabet + " ");
		}
		System.out.println("\n=======================================");
		
		Stream<String> streamStr = Arrays.stream(arr);
		streamStr.forEach(alphabet -> System.out.print(alphabet + " "));
		System.out.println("\n=======================================");
		
		// String[] arr = new String[] {"a","b","c","d","e","f"};
		//arr
		// parallelStream() - 병렬처리 Stream
		//										CPU core 가 1개인 경우, stream()이 더 빠름
		streamStr = Arrays.as List(arr).parallelStream();
		streamStr.forEach(alphabet -> System.out.print(alphabet + " "));
		System.out.println("\n=======================================");

	}//main


}

//13장 3번
class MemberEx{
	String id;
	String name;
	int age;
	
	MemberEx(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
//getter
public String getId() {
	return this.id;
}
public String getName() {
	return this.name;
}

public String getAge() {
	return this.age;
}


//setter

public String setId() {
	return this.id;
}
public String setName() {
	return this.name;
}

public String setAge() {
	return this.age;
}

// 15장 2번
Interfacelambda il = new Interfacelambda() {
              	@Override
              	public int sum(int x, int y) {
              		return x + y;
              	}
              };

   Interfacelambda il2 = (int x, int y) -> { return x + y; };
   Interfacelambda il3 = (int x, int y) ->  x + y;
   
System.out.println(il1.sum(1, 2));
System.out.println(il2.sum(1, 2));

	
	
}

//15장 2번
@FunctionalInterface
interface Interfacelambda{
public abstract int sum(int x, int y);
/*
public int sum4(int x, int y);
abstract int sum2(int x, int y);
int sum3(int x, int y);
*/