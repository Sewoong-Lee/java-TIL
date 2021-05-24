package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J202104227_05_selecone {

	public static void main(String[] args) {
		// 한건만 조회
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ItemDTO idto = null;
		
		String itemcode = "8803";
		String sql = "SELECT * FROM ITEM\r\n" + 
				"WHERE ITEMCODE = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			
			rs = pstmt.executeQuery();  //실행키
			
			if (rs.next()) {  //읽기 위해  //데이터가 있다면
				String itemname = rs.getString("itemname");
				int price = rs.getInt("price");
				String bigo = rs.getString("bigo");
				Date regdate = rs.getDate("regdate");
				
				idto = new ItemDTO(itemcode,itemname,price,bigo,regdate);

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//아이템 출력
		System.out.println(idto);
		System.out.println(idto.getItemcode());
		System.out.println(idto.getItemname());
		System.out.println(idto.getPrice());
		System.out.println(idto.getBigo());
		System.out.println(idto.getRegdate());
	}

}
