package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDAOImpl implements GuestDAO {
	//Connection conn = DBConn.getConn();   //싱글톤 패턴으로 커넥션을 올려도댐 (그러나 변수상황이 있을 수 있으나 하지마셈)
	
	@Override
	public int insert(GuestDTO gdto) {
		// 추가
		Connection conn = DBConn.getConn();  //얘를 위에 빼면 객체 생성될때 한번 맺어지고 인서트나 등등을 하고 끊어지면 안되기때문에 할때마다 생성
		PreparedStatement pstmt = null;  
		String sql = "INSERT INTO GUEST(SEQ, NAME, EMAIL, PASSWD, CONTENT) VALUES (G_SEQ.NEXTVAL, ?, ?, ?, ?)"; //seq는 알아서 만들어지니 만지지마
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			
			cnt = pstmt.executeUpdate();  //실행키 (실행해라라구 명령)
			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "UPDATE GUEST \r\n" + 
				"SET NAME = ?,\r\n" + 
				"EMAIL = ?,\r\n" + 
				"PASSWD = ?,\r\n" + 
				"CONTENT = ?\r\n" + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deldtd(int seq) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM GUEST\r\n" + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestDTO gdto = null;
		
		String sql = "SELECT * FROM  GUEST\r\n" + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String passwd = rs.getString("passwd");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");
				
				gdto = new GuestDTO (seq,name,passwd,email,content,regdate);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gdto;
	}

	@Override
	public List<GuestDTO> selsctList() {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		List<GuestDTO> list = new ArrayList<>();
		ResultSet rs = null;
		String sql = "SELECT * FROM  GUEST\r\n" + 
				"ORDER BY SEQ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {   //방법 2
				GuestDTO gdto = new GuestDTO();
				gdto.setSeq(rs.getInt("seq"));
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPasswd(rs.getString("passwd"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getString("regdate"));
				
				list.add(gdto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}



}
