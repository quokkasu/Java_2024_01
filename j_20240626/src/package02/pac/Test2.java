package package02.pac;

public class Test2 {
	public static void main(String args[]) {
	//다른 package에 있는 test2 클래스에서
	//professor 클래스의 객체를 생성 못함
		//professor 클래스의 접근제한자는 default임
		// ㄴimprot 자체가 안됨
		//professor p1 = new Professor()
		//System.out.
		Professor p1 = new Professor();
		System.out.println("p1 : " + p1);
	}

}
