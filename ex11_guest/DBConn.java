package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//싱글톤패턴 : 인스턴스(객체)를 하나만 생성해서 재사용 (파이널리에서 conn 크로즈 하면 안댐)
	private static Connection conn = null; //지역변수 이므로 항상 널 상태가 되므로 스테틱으로
	//프로그램 종료까지 연결 유지
	public static Connection getConn() {
		//컨넥션을 리턴하는 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		try {
			//만약 컨넥션 객체가 널이거나 컨넥션이 끊어졌다면 
			if (conn == null || conn.isClosed()) {  //널 또는 클로즈면 (순서대로이므로 널을 먼저)
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//컨넥션 객체 생성
				conn = DriverManager.getConnection(url, user, password);	
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 실패");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//컨넥션 접속 해재
	public static void dbClose() {
		try {
			//conn이 널이 아니고 클로즈가 아니라면
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB연결해제");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
	
	


	
}
