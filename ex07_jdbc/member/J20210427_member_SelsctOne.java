package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import ex07_jdbc.DBConn;
import ex07_jdbc.ItemDTO;

public class J20210427_member_SelsctOne {

	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		memberDTO mdto = null;
		
		String userid = "SSSS";
		String sql = "SELECT * FROM MEMBER\r\n" + 
				"WHERE USERID = ?";

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					String passwd = rs.getString("passwd");
					int birthyear = rs.getInt("birthyear");
					Date regdate = rs.getDate("regdate");
					
					mdto = new memberDTO(userid,passwd,birthyear,regdate);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(mdto);

	}

}
