package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class daydayItemSalesList_tset {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list1 = sdao.daydayItemSalesList();
		
		for (Map<String, Object> a : list1) {
			System.out.println(a);
			System.out.println(a.get("saledate"));
			System.out.println(a.get("itemcode"));
			System.out.println(a.get("itemname"));
			System.out.println(a.get("qty"));
			System.out.println(a.get("amount"));
				
		}
//		for (int i=0;i < list1.size();i++) { //포문으로 하면
//			
//			System.out.println(list1.get(i).get("saledate"));
//		}
	}

}
