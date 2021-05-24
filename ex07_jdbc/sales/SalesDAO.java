package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBConn;

public class SalesDAO {
	
	//일일 상품 판매 리스트
	List<Map<String, Object>> dayItemSalesList(){
		List<Map<String, Object>> list = new ArrayList<>();
		//List<Map<ResultSet>> list = new ArrayList<>(); //ResultSet은 sql 소속이어서 추후 지원 불가
		
		// db connection 객체 생성
		Connection conn = DBConn.getConn();
		//pstmt
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
//		String sql = "SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT\r\n" + 
//				"FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE)";  //나중에 용량 과다
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");  
		sql.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) "); 

		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				
				//System.out.println(saledate+ seq+ itemcode+ itemname+ qty+ amount);
				
				//매출 한건 데이터 저장
				//ResultSet은 sql 소속이어서 추후 지원 불가 그래서 맵을 만듬
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				
				list.add(map);
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	//일일 상품별 집계 판매
	List<Map<String, Object>> daydayItemSalesList(){
		List<Map<String, Object>> list = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();
		sql.append("SELECT S.SALEDATE, S.ITEMCODE, MAX(I.ITEMNAME) ITEMNAME, SUM(S.QTY) QTY, SUM(S.AMOUNT) AMOUNT ");
		sql.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sql.append("GROUP BY S.SALEDATE, S.ITEMCODE ");
		sql.append("HAVING SUM(S.QTY)>3 ");
		sql.append("ORDER BY S.SALEDATE, S.ITEMCODE ");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String saledate = rs.getString("saledate");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				
				//System.out.println(saledate+ itemcode+ itemname+ qty+ amount);
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;

		
	}
	
	//기간별 상품 판매
	List<Map<String, Object>> dayItemSalesTotal(String saledate){
		//날짜를 받아야함 (키 스트링 상품값 나머지는 오브젝트)
		List<Map<String, Object>> list = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(S.AMOUNT,0) AMOUNT, REGDATE, NVL(I.BIGO,' ') BIGO ");
		sql.append("FROM ITEM I LEFT JOIN ");
		sql.append("(SELECT ITEMCODE, SUM(AMOUNT) AMOUNT ");
		sql.append("FROM SALES ");
		sql.append("WHERE SALEDATE = ? ");
		sql.append("GROUP BY ITEMCODE) S ");
		sql.append("ON (I.ITEMCODE = S.ITEMCODE) ");
		sql.append("ORDER BY I.ITEMCODE ");
				
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, saledate);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getString("price"));
				map.put("amount", rs.getString("amount"));
				map.put("bigo", rs.getString("bigo"));  
				map.put("regdate", rs.getString("regdate"));
				
				list.add(map);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	//내가 한부분
//	while(rs.next()){
//		String itemcode = rs.getString("itemcode");
//		String itemname = rs.getString("itemname");
//		int price = rs.getInt("price");
//		//String bigi = rs.getString("bigi");
//		int amount = rs.getInt("amount");
//		
//		Map<String, Object> map = new HashMap<>();
//		map.put("saledate", saledate);
//		map.put("itemcode", itemcode);
//		map.put("itemname", itemname);
//		map.put("price", price);
//		//map.put("bigi", bigi);
//		map.put("amount", amount);
//		
//		list.add(map);
	
	//VIEW를 이용해서 데이터 조회
	List<Map<String, Object>> viewSales(String saledate){
		List<Map<String, Object>> list = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
				sql.append("SELECT * FROM DAYITEM_SALES_VIEW ");
				sql.append("WHERE SALEDATE = ? ");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setNString(1, saledate);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getString("price"));
				map.put("amount", rs.getString("amount"));
				map.put("bigo", rs.getString("bigo"));  
				map.put("regdate", rs.getString("regdate"));
				
				list.add(map);

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	
	
}
