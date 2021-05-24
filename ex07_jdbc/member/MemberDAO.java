package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex07_jdbc.DBConn;

//DAO : 데이터베이스 접근하는 메소드의 모음
public class MemberDAO {

	//전체 조회
	List<memberDTO> slectList(){
		List<memberDTO> mlist = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		String sql = "SELECT * FROM MEMBER\r\n" + 
				"ORDER BY USERID"; //쿼리문을 정렬해주면 출력때도 정렬!
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String userid = rs.getNString("userid");
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				//이제 한건한건을 맴버 dto에 넣음 그래야 리스트에 넣음
				memberDTO mdto = new memberDTO(userid,passwd,birthyear,regdate);
				//이제 리스트에 넣음
				mlist.add(mdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return mlist;
	}
	//한건조회
	memberDTO selectOne(String userid){
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		memberDTO mdto = null;
		ResultSet rs= null;
		
		String sql = "SELECT * FROM MEMBER\r\n" + 
				"WHERE USERID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
//				String userid = rs.getString("userid"); // 이미 있으므로 안읽어와도댐
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				
				Date regdate = rs.getDate("regdate");  //날짜만
				//Date regdate = rs.getTimestamp("regdate"); //날짜 시간
				//Date regdate = rs.getTime("regdate");  //시간만
				
				//System.out.println(rs.getString("regdate"));// 스트링으로 가져오기
				
				mdto = new memberDTO(userid,passwd,birthyear,regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return mdto;
	}
	
	//추가
	int insert(memberDTO mdto){
		int cnt=0;
		//DB접속
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
//		String userid = mdto.getUserid();
//		String passwd = mdto.getPasswd();
//		int birthtear = mdto.getBirthyear();
		
		String sql = "INSERT INTO MEMBER (USERID,PASSWD,BIRTHYEAR) VALUES(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPasswd());
			pstmt.setInt(3, mdto.getBirthyear());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return cnt;
	}
	
	
	//수정
	int update(memberDTO mdto) {
		int cnt =0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
//		String sql = "UPDATE MEMBER\r\n" + 
//				"SET PASSWD = ?,\r\n" + 
//				"BIRTHYEAR = ?\r\n" + 
//				"WHERE USERID = ?";  //이렇게 쓰다보면 나중에 길어지면 느려짐
		//그래서 아래처럼 대체
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE MEMBER ");  //기존에 내용에 추가 가능 (속도 빨라짐)
		sql.append("SET PASSWD = ?, "); //이렇게 뒤에 한칸씩 뛰어야댐
		sql.append("BIRTHYEAR = ? ");
		sql.append("WHERE USERID = ? ");
		
		//System.out.println(sql);
		
		try {
			pstmt = conn.prepareStatement(sql.toString());  //얘는 투스트링을 자동실행이 안되서 뒤에 추가.
			//pstmt = conn.prepareStatement(sql); //String sql 일경우
			pstmt.setString(1,mdto.getPasswd());
			pstmt.setInt(2, mdto.getBirthyear());
			pstmt.setString(3,mdto.getUserid());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
		return cnt;

	}
	//삭제
	int delete (String userid) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBER \r\n" + 
				"WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,userid);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return cnt;
	}
	
	
	

	
}
