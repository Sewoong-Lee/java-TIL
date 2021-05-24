package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex07_jdbc.Countries;
import ex07_jdbc.DBConn;

public class J202104227_member_selectall {

	public static void main(String[] args) {
		Connection conn = DBConn.getConn();
		List<memberDTO> list = new ArrayList<>();
		memberDTO mdto = null;
		ResultSet rs = null;
		Statement stmt = null;
		String sql = "SELECT * FROM MEMBER";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
//				memberDTO mdto = new memberDTO(userid,passwd,birthyear,regdate);
				mdto = new memberDTO(userid,passwd,birthyear,regdate);
				list.add(mdto);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		for (memberDTO a : list) {
			System.out.println(a.getUserid() + " " + a.getPasswd() + " " + a.getBirthyear() + " "+ a.getRegdate());
		}
		
	}

}
