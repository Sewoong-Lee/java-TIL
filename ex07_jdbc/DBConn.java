package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//내가 한거
	// 컨넥션을 리턴하는 메소드
//	static Connection conn;
//	static Connection getConn() {
//		//드라이버 로딩
//		//컨넥션 객체 생성
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		if ( conn == null) 
//		
//		return null;
//		return conn;
//
//	}

	//해석
	//컨넥션을 리펀하는 메소드
	public static Connection getConn() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		//드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//컨넥션 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 실패");
			e.printStackTrace();
		}
		
		return conn;
	}



	
}
