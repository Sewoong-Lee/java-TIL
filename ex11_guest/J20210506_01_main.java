package ex11_guest;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import ex07_jdbc.member.memberDTO;

public class J20210506_01_main {

	public static void main(String[] args) {
		// 1. 방명록 작성
		//2. 방명록 수정
		//3. 방명록 삭제
		//4. 방명록 전체조회
		//9. 종료
		int cc;
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력하시오");
			System.out.println("1. 방명록 작성");
			System.out.println("2. 방명록 수정");
			System.out.println("3. 방명록 삭제");
			System.out.println("4. 방명록 단일조회");
			System.out.println("5. 방명록 전체조회");
			System.out.println("9. 종료");
			cc = sc.nextInt();
			
			
			if (cc == 1) {
				//인서트
				GuestDAO gdao = new GuestDAOImpl();  //GuestDAOImpl를 부모형으로 선언
				System.out.println("이름을 입력하세요.");
				String name =  sc.next();
				System.out.println("이메일을 입력하세요.");
				String email =  sc.next();
				System.out.println("패스워드를 입력하세요.");
				String passwd =  sc.next();
				System.out.println("내용을 입력하세요.");
				String content =  sc.next();
				GuestDTO gdto = new GuestDTO(name,email,passwd,content);  //인서트 예정
				int cnt = gdao.insert(gdto);
				System.out.println(cnt + "건 추가");
			}
			else if (cc==2) {
				//업데이트
				GuestDAO gdao = new GuestDAOImpl(); 
				System.out.println("순번을 입력하세요.");
				int seq =  sc.nextInt();
				System.out.println("수정할 이름을 입력하세요.");
				String name =  sc.next();
				System.out.println("수정할 이메일을 입력하세요.");
				String email =  sc.next();
				System.out.println("수정할 패스워드를 입력하세요.");
				String passwd =  sc.next();
				System.out.println("수정할 내용을 입력하세요.");
				String content =  sc.next();
				GuestDTO gdto = new GuestDTO(seq,name,email,passwd,content);  
				int cnt = gdao.update(gdto);
				System.out.println(cnt + "건 수정");
			}
			else if (cc==3) {
				//삭제
				GuestDAO gdao = new GuestDAOImpl(); 
				GuestDTO gdto = new GuestDTO();  
				System.out.println("삭제할 순번을 입력하세요.");
				int seq =  sc.nextInt();
				int cnt = gdao.deldtd(seq);
				System.out.println(cnt + "건 삭제");
			}
			else if (cc==4) {
				//1건조회
				GuestDAO gdao = new GuestDAOImpl();  
				System.out.println("조회할 순번을 입력하세요.");
				int seq =  sc.nextInt();
				GuestDTO cnt = gdao.selectOne(seq);
				//System.out.println(cnt + "1건 조회");
				System.out.println(cnt);
			}
			else if (cc==5) {
				//전체조회
				System.out.println("전체조회");
				GuestDAO gdao = new GuestDAOImpl(); 
				GuestDTO gdto = new GuestDTO();  
				List<GuestDTO> list = gdao.selsctList();
			
				for (GuestDTO a : list) {
					System.out.println(a);
				}
			}
			else if(cc==9) {
				DBConn.dbClose();  //db 연결해제
				System.out.println("종료"); 
				break;
			}
		}
		
		

	}

}
