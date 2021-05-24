package ex07_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J202104227_01_emp {

	public static void main(String[] args) {
		// 사원 테이블  년봉이 10000 이상인 사원 조회
		//EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE 조회 
		// 년봉의 내림차순
		
		Connection con = DBConn.getConn();  //통로
		Statement stmt = null;
		ResultSet rs = null;
		List<EMPLOYEES> list = new ArrayList<>();
		
		try {
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE\r\n" + 
					"FROM EMPLOYEES\r\n" + 
					"WHERE SALARY >= 10000\r\n" + 
					"ORDER BY SALARY";
			stmt = con.createStatement();  //sql문을 넘겨주고 결과값을 받을 수 있게 해쥼
			rs = stmt.executeQuery(sql);  //sql문을 넘겨주면 리스트형으로 줌
			while(rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				int salary = rs.getInt("salary");
				String hire_date = rs.getString("hire_date");
				//Date hire_date = rs.getDate("hire_date");  //데이트형으로 가능 , dto의 필드 형변환 해야댐
				EMPLOYEES rdto = new EMPLOYEES(); //클래스로 저장
				//EMPLOYEES rdto = new EMPLOYEES(employee_id,first_name,salary,hire_date); 이렇게 해도댐
				rdto.setEmployee_id(employee_id);
				rdto.setFirst_name(first_name);
				rdto.setSalary(salary);
				rdto.setHire_date(hire_date);  //위에 이름을 잘 만들면 자동 완성
				list.add(rdto);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {  //예외가 발행 하든지 안하든지 무조건 실행
			try {
				if (rs != null)rs.close();   //오라클 연결 3
				if (stmt != null)stmt.close();  //오라클 연결 2
				if (con != null)con.close();  //오라클 연결 1
				//변수가 널값일 경우 클로즈가 실행되지 않아 완벽한 처리를 위하여 if문 추가
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(EMPLOYEES rdto : list ) {
			System.out.println(rdto);
			System.out.println(rdto.getEmployee_id());
			System.out.println(rdto.getFirst_name());
			System.out.println(rdto.getSalary());
			System.out.println(rdto.getHire_date());
		}
		
	}

}
