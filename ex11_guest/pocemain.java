package ex11_guest;

import java.util.List;
import java.util.Scanner;

import ex07_jdbc.member.MemberDAO;
import ex07_jdbc.member.memberDTO;

public class pocemain {

	public static void main(String[] args) {
		
		pocketDAO pdao = new pocketDAO();  
		pocketDTO pdto = new pocketDTO(); 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("포켓몬 조회 시스템 v1.0");
			System.out.println("--------------------------------");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.신규 포켓몬 추가");
			System.out.println("2.포켓몬 수정");
			System.out.println("3.포켓몬 삭제");
			System.out.println("4.포켓몬 단일 조회");
			System.out.println("5.포켓몬 전체 조회");
			System.out.println("6.전체 트레이너 조회");
			System.out.println("9.종료");
			System.out.println("--------------------------------");
			System.out.println("번호는?");
			int no = sc.nextInt();
			if(no==5) { //전체조회
				List<pocketDTO> list = pdao.selsctList(); 
				
				System.out.println("-----------------------------");
				System.out.println("포켓몬 리스트");
				System.out.println("-----------------------------");
				
				for(pocketDTO a : list) {  
					System.out.println(a.getMcode() + a.getMname() + a.getTcode() + a.getTname());
				}
						
			}else if (no==4) { //포켓몬 한건 조회
				List<pocketDTO> plist = pdao.selsctList();
				System.out.println("-----------------------------");
				System.out.println("등록된 포켓몬 이름");
				System.out.println("-----------------------------");
				for(pocketDTO a: plist) {
					System.out.print(a.getMname() + "  ");
				}
				System.out.println("조회할 포켓몬은?");
				String userid = sc.next();
				pocketDTO pdto1 = pdao.selectOne(userid);
				
				System.out.println(pdto1.getMcode()+" "+pdto1.getMname()+" "+pdto1.getTcode()+" "+pdto1.getTname());
				
			}else if(no==1) { //추가
				
				String mname;
				while(true){
					System.out.println("추가할 포켓몬 이름는?");
					mname = sc.next();
					//중복체크
					pocketDTO mdto = pdao.selectOne(mname);
					if(mdto != null) {  
						System.out.println("중복된 포켓몬");
					}else break; 
				}
				sc.nextLine();
				List<pocketDTO> plist = pdao.selsctList();
				System.out.println("-----------------------------");
				System.out.println("등록된 포켓몬 코드");
				System.out.println("-----------------------------");
				for(pocketDTO a: plist) {
					System.out.print(a.getMcode()+a.getMname()+ "  ");
					System.out.println("");
				}
				System.out.println("추가할 포켓몬코드");
				String mcode = sc.next();
				sc.nextLine();
				plist = pdao.selsctList();
				System.out.println("-----------------------------");
				System.out.println("등록된 타입");
				System.out.println("-----------------------------");
				for(pocketDTO a: plist) {
					System.out.print(a.getTcode()+a.getTname()+ "  ");
					System.out.println("");
				}
				System.out.println("타입코드 설정");
				String tcode = sc.next();
				pdto = new pocketDTO(mcode, tcode, mname);
				int cnt = pdao.insert(pdto);
				
				if (cnt > 0) {
					System.out.println("포켓몬 등록 완료");
				}else {
					System.out.println("포켓몬 등록 실패");
				}
			}else if(no==2) {//수정
				System.out.println("수정할 포켓몬은?");
				String mname2 = sc.next();
				//기존 정보 내용
				pdto = pdao.selectOne(mname2);
				String mcode;  
				String tcode;
				System.out.println(pdto);
				
				System.out.println("변경 이름");
				String mname = sc.next();
				sc.nextLine(); //버퍼처리
				List<pocketDTO> plist = pdao.selsctList();
				System.out.println("-----------------------------");
				System.out.println("등록된 타입");
				System.out.println("-----------------------------");
				for(pocketDTO a: plist) {
					System.out.print(a.getTcode()+a.getTname()+ "  ");
					System.out.println("");
				}
				System.out.println("변경 타입");
				tcode = sc.next();
				System.out.println("포켓몬 코드");
				mcode = sc.next();
				pocketDTO pdto2 = new pocketDTO(mcode, tcode, mname);
				int  cnt = pdao.updatetra(pdto2);
				if (cnt > 0) {
					System.out.println("수정 완료");
					System.out.println(pdto);
				}else {
					System.out.println("수정 실패");
				}
				
			}else if(no==3) { //삭제
				List<pocketDTO> list = pdao.selsctList(); 
				
				System.out.println("-----------------------------");
				System.out.println("포켓몬 리스트");
				System.out.println("-----------------------------");
				
				for(pocketDTO a : list) {  
					System.out.println(a);
				}
				System.out.println("삭제할 포켓몬 코드는?");
				String mcode = sc.next();
				int cnt = pdao.deldtd(mcode);
				if (cnt > 0) {
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제 실패");
				}
				
			}else if(no==9) {
				System.out.println("종료");
				System.out.println("포켓몬은 언제나 함께합니다");
				break;
			}
		
			
		}
	}
			
}
