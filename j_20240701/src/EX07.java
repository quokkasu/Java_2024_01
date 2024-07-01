import java.util.Objects;

public class EX07 {
//299 page
//Object 클래스의 equals() 메소드
//기본적으로 객체의 주솟값을 비교해서
//같은지 다른지 알아보는 메소드
//주솟값이 아니고, 객체의 값을 비교하는 형태로
//overriding 해서 사용하는 경우가 많음

	public static void main(String[]args) {
		String name1 = new String("더조은");
		String name2 = new String("더조은");
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		
		//String class 에 있는 equals() 메소드는
		//최상위 클래스인 Object로부터 상속받아서
		//주솟값이 아니라, 내용을 비교하도록
		//이미 overriding이 되어있음
		System.out.println("name1 == name2 : " + (name1 == name2));
		System.out.println("name1.equals(name2) : " + name1.equals(name2));
		
		Name name3 = new Name("Tom", "Cruise");
		Name name4 = new Name("Tom", "Cruise");
		
		System.out.println( "name3 == name4 : " + (name3 == name4));
		System.out.println("name3.equals(name4) : " + name3.equals(name4));
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		System.out.println(name3.identityHashCode(name3));
		System.out.println(name3.identityHashCode(name4));
	}
	
	}






	class Name{
		String firstName;
		String lastName;
		Name(){ }
		Name(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		//주솟값을 비교하지 않고
		//멤버변수의 값을 비교하도록 overriding 함
		//this 는 equals() 메소드를 실행하는 객체의 주소
		//object obj의 obj는 비교의 대상 객체의 주소
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Name) {
				Name name = (Name)obj;
			}
			return this.firstName == name.firstName &&
						 this.lastName == name.lestName;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		//return super 썼었다가 왜 Object로 바꾸셨을까?
		return Objects.hash(firstName) + Objects.hash(lastName);

	}