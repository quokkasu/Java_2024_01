import java.util.Objects;

class Student{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}





public class EX09 {
	public static void main(String[]args) {
		Student s1 = new Student("이순신",46);
		Student s2 = new Student("이순신",46);
		
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.hashCode() == s2.hashCode() : " + s1.hashCode() == s2.hashCode());
		@Override
		//1. boolean은 처음 override 할때 쓰는 단어인지?
		//2. 
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student)obj;
			
			return this.name == s.name && this.age == s.age;
			}else {
				return false;
			}
		}
		@Override
		public int hashCode() {
			return Objects.hashCode(this.name) + Objects.hashCode(this.age);
		}
	}
}
