package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;

//단위테스트
class membertest {
	MemberDAO mdao = new MemberDAO();  //객체 생성
	@Test
	void testSlectList() {
		List<memberDTO> mlist = mdao.slectList(); //mdao 메소드 불러옴
		
		for(memberDTO a: mlist) {  //리스트 출력하기 위해 반복문 출력
			System.out.println(a);
		}
		
		assertNotEquals(0, mlist.size());//성공여부 확인  //리스트의 사이즈가 0과 같지 않으면 성공
	}    //데이터가 없으면 실패

	@Test
	void testSelectOne() {
		String userid = "SSSS";
		memberDTO mdto = mdao.selectOne(userid);
		
		System.out.println(mdto);
		assertNotNull(mdto); //성공여부 확인 (값이 없어도 성공이라 떠서 값이 없으면 실패로 뜨게 만듬)
	}

	@Test
	void testInsert() {
		String userid = "aasqq";
		String passwd = "zzzz";
		int birthyear = 0505;
		memberDTO mdto = new memberDTO(userid, passwd, birthyear);
		int cnt = mdao.insert(mdto);
		
		//cnt가 0이 아니면 성공 이라는 뜻
		//assertNotEquals(0, cnt); //이 문장으로 실패가 생김
		                         //실패와 에러는 다름 에러는 문장실행이 불가
		
		assertEquals(1, cnt); //cnt가 1이면 성공
	}

		

	@Test
	void testUpdate() {
		String userid = "SSSS";
		String passwd = "ㅊㅊㅊㅊ";
		int birthyear = 5555;
		memberDTO mdto = new memberDTO(userid, passwd, birthyear);
		int  cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		String userid = "java";
		int cnt = mdao.delete(userid);
		assertEquals(1, cnt);
	}
	
	//날짜 문자열 포멧
	@Test
	void test() {
		String str = "2021-04-28 15:09:26";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			System.out.println(sdf.format(sdf.parse(str)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
