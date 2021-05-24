package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import ex07_jdbc.DBConn;

class salestest {
	

	@Test
	void test() {
		List<Map<String, Object>> list1 = new ArrayList<>();
		SalesDAO sdao = new SalesDAO();
		list1 = sdao.dayItemSalesList();
		for (Map<String, Object> a : list1) {
			a.get("itemname");
			//System.out.println(a);
			System.out.println(a.get("saledate"));
			System.out.println(a.get("seq"));
			System.out.println(a.get("itemcode"));
			System.out.println(a.get("itemname"));
			System.out.println(a.get("qty"));
			System.out.println(a.get("amount"));
			System.out.println();
		}
		
	}
	
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		sdao.daydayItemSalesList();

		}
		

}
