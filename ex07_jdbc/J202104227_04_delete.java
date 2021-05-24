package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J202104227_04_delete {

	public static void main(String[] args) {
		// 데이터 삭제 : delete
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		
		String itemcode = "8802";
		String sql = "DELETE FROM ITEM \r\n" + 
				"WHERE ITEMCODE = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
