
//DTO class
//Data Transfer Object
//데이터 전송 객체
//VO : Value Objcet
public class Member {
	private int memberNo;
	private String id;
	private String name;
	
	//getter
	public int getMemberNo() {
		return this.memberNo;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
	
	
	//setter
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setId(String id) {
		return this.id = id;
	}
	public void setName(String name) {
		return this.name = name;
	}
}
