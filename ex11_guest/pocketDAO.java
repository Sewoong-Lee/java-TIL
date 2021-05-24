package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex07_jdbc.member.memberDTO;

public class pocketDAO {

	public int insert(pocketDTO pdto) {
		// 포켓몬 추가
			Connection conn = DBConn.getConn();  
			PreparedStatement pstmt = null;  
			String sql = "INSERT INTO MONE (MCODE,TCODE, MNAME)  VALUES (?,?,?)";
			int cnt = 0;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, pdto.getMcode());
				pstmt.setString(2, pdto.getTcode());
				pstmt.setString(3, pdto.getMname());
					
				cnt =  pstmt.executeUpdate();
				
					 
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			} finally {
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
	
	//포켓몬 수정
	public int updatetra(pocketDTO pdto) {
		int cnt = 0;
		pdto = new pocketDTO();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "UPDATE MONE\r\n" + 
				"SET MNAME = ? ,\r\n" + 
				"TCODE = ? \r\n" + 
				"WHERE MCODE = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pdto.getMname());
			pstmt.setString(2, pdto.getTcode());
			pstmt.setString(3, pdto.getMcode());
			
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
	
	//포켓몬 삭제
	public int deldtd(String mcode) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM MONE\r\n" + 
				"WHERE MCODE = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mcode);
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

	//포켓몬 하나 조회
		pocketDTO selectOne(String mname){
			Connection conn = DBConn.getConn();
			PreparedStatement pstmt = null;
			pocketDTO pdto = null;
			ResultSet rs= null;
			
			String sql = "SELECT M.MCODE, M.TCODE ,M.MNAME, P.TNAME\r\n" + 
					"FROM MONE M INNER JOIN PTYPE P ON (M.TCODE = P.TCODE)\r\n" + 
					"WHERE MNAME = ? ";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mname);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					String MCODE = rs.getString("MCODE");
					String TCODE = rs.getString("TCODE");
					String MNAME = rs.getString("MNAME");
					String TNAME = rs.getString("TNAME");
					
					
					
					pdto = new pocketDTO(MCODE,TCODE,MNAME,TNAME);
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
			
			return pdto;
		}
	

	//포켓몬별 전체 리스트
	public List<pocketDTO> selsctList() {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		List<pocketDTO> list = new ArrayList<>();
		pocketDTO pdto = null;
		ResultSet rs = null;
		String sql = "SELECT M.MCODE, M.TCODE ,M.MNAME, P.TNAME\r\n" + 
				"FROM MONE M INNER JOIN PTYPE P ON (M.TCODE = P.TCODE)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {   
				
				String mcode = rs.getString("mcode");
				String mname = rs.getString("mname");
				String tcode = rs.getString("tcode");
				String tname = rs.getString("tname");
				pdto = new pocketDTO(mcode,tcode,mname,tname);
				list.add(pdto);
				
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
		return list;
	}
	

	

	
	
}
