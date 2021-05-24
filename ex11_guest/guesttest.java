package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class guesttest {

	@Test
	void testInsert() {
		GuestDAO gdao = new GuestDAOImpl();  //GuestDAOImpl를 부모형으로 선언
		GuestDTO gdto = new GuestDTO("김남길","k@naver.com","1111","가입함");  //인서트 예정
		int cnt = gdao.insert(gdto);
		System.out.println(cnt + "건 추가");
	}

	@Test
	void testUpdate() {
		GuestDAO gdao = new GuestDAOImpl(); 
		GuestDTO gdto = new GuestDTO(2,"홍씨","h@naver.com","5555","확인임");  
		int cnt = gdao.update(gdto);
		System.out.println(cnt + "건 수정");
	}

	@Test
	void testDeldtd() {
		GuestDAO gdao = new GuestDAOImpl(); 
		int cnt = gdao.deldtd(3);
		System.out.println(cnt + "건 삭제");
	}

	@Test
	void testSelectOne() {
		GuestDAO gdao = new GuestDAOImpl();  
		GuestDTO cnt = gdao.selectOne(2);
		//System.out.println(cnt + "1건 조회");
		System.out.println(cnt);
	}

	@Test
	void testSelsctList() {
		GuestDAO gdao = new GuestDAOImpl(); 
		GuestDTO gdto = new GuestDTO();  
		List<GuestDTO> list = gdao.selsctList();
		
		for (GuestDTO a : list) {
			System.out.println(a);
		}
	}

}
