import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//574 page
//DAO class
//Database Access Object
//ORACLE JDBS 설정 값
//"jdbc:oracle:thin:@localhost:1521:xe";


public class memberDAO {
	//데이터베이스 접속 객체
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String id = "tjoeun";
	String name = "학원";

	
	//생성자에서 database에 접속함
	// ㄴ MemberDAO	객체를 생성하면 자동으로 DATABASE  에 접속함
	public MemberDAO() {
		try {
			 //Oracle database 드라이버 로드
			Class.forName(driver);
			
			//Oracle database 접속
			conn = DriverManager.getConnection(url, id, pw);
			
			
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}// 생성자
	
	//data 조회하기 : select
	public MemberDTO selectOne(int memberNo) {
		
		 List<MemberDTO> memberList= new ArrayList<>();
		
		try {
		//sql 문을 String 으로 저장해서 활용함
		String sql = "SELECT * FROM MEMBER";
		//PreparedStatement 객체 생성
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			MemberDTO dto = new MemberDTO();
			dto.set
		}
		
		if(rs.next()) {
			dto.setMemberNo(rs.getInt("memberNo"));
			dto.setID(rs.getString("id"));
			dto.setName(rs.getString("name"));
		}
		
		
		
		}catch(SQLEception e) {
			System.out.println(e.getMessage());
		}
	}
}
