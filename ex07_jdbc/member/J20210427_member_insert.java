package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import ex07_jdbc.DBConn;

public class J20210427_member_insert {

	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		memberDTO mdto = null;
		
		String userid = "vvvv";
		String passwd = "1212";
		int birthyear = 1825;
		
		
		String sql = "INSERT INTO MEMBER (USERID,PASSWD,BIRTHYEAR) VALUES(?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,userid );
			pstmt.setString(2,passwd );
			pstmt.setInt(3,birthyear);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
