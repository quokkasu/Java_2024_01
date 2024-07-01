
public class EX13 {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		Class c1 = t1.getClass();
		System.out.println("c1.getName() : " + c1.getName());
		
		
		try {
			Class c2 = Class.forName("Tjoeun");
			System.out.println("c 2.getName() : " + c2.getName());
		}catch(ClassNotFoundException e) {
			 System.out.println("ClassNotFoundException 발생 !!!!");
			 System.out.println(e.getMessage());
		}
	}
}

class Test1{ }

class Tjoeun{ }

class BigData{ }