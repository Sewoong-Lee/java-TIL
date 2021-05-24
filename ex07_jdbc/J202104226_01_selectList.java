package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J202104226_01_selectList {
	static Connection conn;  //필드로 올릴 경우 자동 초키화
	
	public static void main(String[] args) {
		
		// 오라클 db연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //접속할 길이 열림
			System.out.println("드라이버 로딩 완료");
			//컨넥션형 변수 선언
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); //오라클연결1
			//url 고정, 로컬 호스트는 다른 컴퓨터에 오라클이 존재하면 그 컴퓨터의 ip
			System.out.println("접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 존재하지 않습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		} 
		
		if (conn==null) return;  //커넥션 실패시 이후의 작업을 하게 하지 않게 하기 위해
		
		//db 정보 slect
		List<Countries> list = new ArrayList<>();
		ResultSet rs = null;
		Statement stmt = null;
		try {  //제일 중요
			stmt =  conn.createStatement();  //오라클 연결 2
			String sql = "SELECT * FROM COUNTRIES";
			rs = stmt.executeQuery(sql); //조회  //오라클연결 3
			while (rs.next()) {  //다음 내용이 있는지 확인 없으면 자동 펄스
				String country_id = rs.getString("country_id");
				String country_name = rs.getString("country_id");
				int region_id = rs.getInt("region_id");
				Countries cot = new Countries(country_id, country_id, region_id);
				list.add(cot);
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}finally {  //예외가 발행 하든지 안하든지 무조건 실행
			try {
				if (rs != null)rs.close();   //오라클 연결 3
				if (stmt != null)stmt.close();  //오라클 연결 2
				if (conn != null)conn.close();  //오라클 연결 1
				//변수가 널값일 경우 클로즈가 실행되지 않아 완벽한 처리를 위하여 if문 추가
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//출력 하는 구문과 읽어오는 구문을 따로 둠
		//출력
		System.out.println(list);
		for (int i =0 ; i<list.size();i++) {
			Countries c = list.get(i);
			System.out.println(c.getCountry_id() + " " + c.getCountry_name() + " " + c.getRegion_id());
			
		}
		
		for (Countries a : list) {
			System.out.println(a.getCountry_id() + " " + a.getCountry_name() + " " + a.getRegion_id());
		}
		
		for (Countries a : list) {
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
	}

}
