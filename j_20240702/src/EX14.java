
public class EX14 {
	public static void main(String[] args) {
		
		//403 page
	
		
		System.out.println("list.size() : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("idx : %d, 이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n ", 
													i,
													((Member)list.get(i)).getName(),
													((Member)list.get(i)).getId(),
													((Member)list.get(i)).getPassword(),
													((Member)list.get(i)).getAge());
		}
	}
}

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	
	//setter : 멤버변수의 값을 설정(setting)함
	// set + 멤버변수이름
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String Id) {
		this.Id = Id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter : 멤버변수의 값을 반환함
	// get + 멤버변수이름
	
	public String getName() {
		return this.name;
	}
	
	
	public String getId() {
		return this.Id;
	}
	
	
	public String getPassword() {
		return this.Password;
	}
	
	
	public int getAge() {
		return this.Age;
	}
	
	
}
