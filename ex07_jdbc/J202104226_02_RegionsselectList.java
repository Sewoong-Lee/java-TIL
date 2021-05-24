package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J202104226_02_RegionsselectList {

	public static void main(String[] args) {
		//컨넥션 객체 얻기 (DBConn)
		Connection con = DBConn.getConn();
		List<RegionsDTO> list = new ArrayList<>();  //어레이 리스트 생성
		try {
			String sql = "SELECT*FROM REGIONS\r\n" + 
					"ORDER BY REGION_ID";  //셀렉트문의 뭘 할껀지
			Statement stmt = con.createStatement();  //오라클과 데이터를 주고받아주는 역할
			ResultSet rs = stmt.executeQuery(sql); //오라클 셀렉트를 사용할때 (행과 열로 받을때 사용)
			while (rs.next()) {  //rs에 다음으로 갔을때 데이터가 있으면 참이다.
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name"); //반복문으로 내용 가져옴
				RegionsDTO rdto = new RegionsDTO();  //밖에 뺴면 하나만 객체생성 되므로 반복문 안으로
				rdto.setRegion_id(region_id);
				rdto.setRegion_name(region_name);
				list.add(rdto);
			}
			
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		for(RegionsDTO dto : list ) {
			System.out.println(dto);
			System.out.println(dto.getRegion_id());
			System.out.println(dto.getRegion_name());
		}
		
	}

}
