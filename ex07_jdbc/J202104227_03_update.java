package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J202104227_03_update {

	public static void main(String[] args) {
		// 수정 : update
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		String itemname = "칠성스";
		String itemcode = "8801";
		
		String sql = "UPDATE ITEM \r\n" + 
				"SET ITEMNAME = ?\r\n" + 
				"WHERE ITEMCODE = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemname);
			pstmt.setString(2, itemcode);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "수정");
					
		} catch (SQLException e) {
			// 
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
