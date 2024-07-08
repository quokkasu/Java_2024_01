
//577 page

public class MemberMain {
	public static void main(String[] args) {
		
		MemberDTO dto;
		
		
		memberDAO dao = new MemberDAO();
		dto = dao.selectOne(1);
		
		//getter 를 호출하는 방법
		System.out.printf("%d - %s - %s%n", dto.getMemberNo(), dto.getId(), getName());
		
		
		
		//toString()을 호출하는 방법
		//System.out.println(dto.toString);
		System.out.println(dto);
		System.out.println(dao.selectOne(1));
		System.out.println(dao.selectOne(2));
		System.out.println(dao.selectOne(3));
		System.out.println(dao.selectOne(4));
		System.out.println(dao.selectOne(5));
		
	List<MemberDTO> memberList = dao.selectAll();
	
	for(MemberDTO dto2 : memberList) {
		System.out.println(dto2);
	}
		
	}
}
