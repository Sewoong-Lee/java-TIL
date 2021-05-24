package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class dayItemSalesTotal_test {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		//문자열 가공
		String saledate = "20210429";
		saledate = saledate.substring(0,4)+"-"
					+ saledate.substring(4,6)+"-"
					+ saledate.substring(6);
		System.out.println(saledate);
		
		List<Map<String, Object>> list1 = sdao.dayItemSalesTotal("saledate");
		
		for (Map<String, Object> a : list1) {
			//System.out.println(a);
			System.out.println(a.get("saledate"));
			System.out.println(a.get("itemcode"));
			System.out.println(a.get("itemname"));
			System.out.println(a.get("price"));
			System.out.println(a.get("amount"));
			System.out.println(a.get("bigo"));
			System.out.println(a.get("regdate"));
			System.out.println("---------------------------");
				
		}
	}
	@Test
	void test1() {
		SalesDAO sdao = new SalesDAO();
		//문자열 가공
		String saledate = "2021-04-30";
		List<Map<String, Object>> list1 =  sdao.viewSales(saledate);
		
		for (Map<String, Object> a : list1) {
			//System.out.println(a);
			System.out.println(a.get("saledate"));
			System.out.println(a.get("itemcode"));
			System.out.println(a.get("itemname"));
			System.out.println(a.get("price"));
			System.out.println(a.get("amount"));
			System.out.println(a.get("bigo"));
			System.out.println(a.get("regdate"));
			System.out.println("---------------------------");
		}
	}
	

}
