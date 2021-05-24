package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ex07_jdbc.DBConn;

public class J202104227_member_update {

	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		String passwd = "코카스콜라";
		String userid = "SSSS";
		
		String sql = "UPDATE MEMBER\r\n" + 
				"SET PASSWD = ?\r\n" + 
				"WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,passwd);
			pstmt.setString(2,userid);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
