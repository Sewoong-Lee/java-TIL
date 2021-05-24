package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

public class J20210428_01_member {

	public static void main(String[] args) {
		//로그인된 아이디 정보만 수정 가능
		//기존 정보 조회 후 수정정보와 같이 전달
		
		boolean logincheck = false;  //로그인 여부 저장
		String userid1 = ""; //로그인된 아이디
		//member 데이터 추가
		MemberDAO mdao = new MemberDAO();  //객체 생성 (여기있는 메소드 사용 위해)
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("현재 사용자"+"[" + userid1 + "]");
			System.out.println("0.로그인");
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.회원한명조회");
			System.out.println("5.회원전체조회");
			System.out.println("9.종료");
			System.out.println("--------------------------------");
			System.out.println("번호는?");
			int no = sc.nextInt();
//			int no = 1;
			if(no==0) {
				//유저 아이디와 패스워드 입력받기
				//DB에서 일치하는지 확인
				//존재하지 않는 아이디, 틀린 비밀번호 분리
				//userid 체크
				while (true) {
					System.out.println("로그인할 아이디는?");
					String userid = sc.next();
					memberDTO mdto = mdao.selectOne(userid);  //이미 여기서 mdto에 값이 전체 다 들어가있음
					if(mdto == null) {  //중복된 데이터가 없다면
						System.out.println("존재하지 않는 아이디"); 
						logincheck = false;
						userid1 = "";
					}else 
						//패스워드 체크
						//db의 패스워드와 입력한 패스워드가 일치 한다면 로그인 성공
						System.out.println("비밀번호는?");
					String passwd = sc.next();
					if (passwd.equals(mdto.getPasswd())) {
						System.out.println("패스워드 일치"); 
						logincheck = true; 
						userid1 = userid; break;
					}else {
						System.out.println("패스워드 불일치"); 
						logincheck = false; 
						userid1 = "";
					}
				}
				//passwd 체크 (게터 이용)

				
				
				
				
			}else if(no==5) { //전체조회
				if (!logincheck) {  //로그인 한 사람만 사용가능하게 제약
					System.out.println("로그인 후 사용 가능");
					continue; //와일문 처음으로 되돌림
				}
				List<memberDTO> mlist = mdao.slectList(); //mdao 메소드 불러옴
				
				System.out.println("-----------------------------");
				System.out.println("회원 리스트");
				System.out.println("-----------------------------");
				
				for(memberDTO a: mlist) {  //리스트 출력하기 위해 반복문 출력
					System.out.println(a);
				}
						
			}else if (no==4) { //한건조회
				if (!logincheck) {  //로그인 한 사람만 사용가능하게 제약
					System.out.println("로그인 후 사용 가능");
					continue; //와일문 처음으로 되돌림
				}
				List<memberDTO> mlist = mdao.slectList(); 
				System.out.println("-----------------------------");
				System.out.println("등록된 아이디");
				System.out.println("-----------------------------");
				for(memberDTO a: mlist) {
					System.out.println(a.getUserid());
				}
				System.out.println("조회할 아이디는?");
				String userid = sc.next();
				memberDTO mdto = mdao.selectOne(userid);
				
				System.out.println(mdto);
				//mdao.selectOne(mdto);
				
			}else if(no==1) { //추가
				
				String userid;
				while(true){
					System.out.println("추가할 아이디는?");
					userid = sc.next();
					//아이디 중복체크
					memberDTO mdto = mdao.selectOne(userid);
					if(mdto != null) {  //중복된 데이터가 있다면
						System.out.println("중복된 아이디");
					}else break; //널이면 브레이크
				}
				System.out.println("추가할 비밀번호?");
				String passwd = sc.next();
				System.out.println("추가할 생일은?");
				int birthyear = sc.nextInt();
				memberDTO mdto = new memberDTO(userid, passwd, birthyear);
				int cnt = mdao.insert(mdto);
				
				if (cnt > 0) {
					System.out.println("회원가입 완료");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if(no==2) {//수정
				if (!logincheck) {  //로그인 한 사람만 사용가능하게 제약
					System.out.println("로그인 후 사용 가능");
					continue; //와일문 처음으로 되돌림
				}
				System.out.println("수정할 아이디는?");
				String userid = sc.next();
				//자기 아이디만 가능하도록
				if (!userid.equals(userid1)) {
					System.out.println("자신의 아이디만 수정할 수 있습니다.");
					continue;
				}
				//기존 정보 내용 뿌려주기
				memberDTO mdto = mdao.selectOne(userid);
				String passwd;  //기존 내용 저장 안바꿔도 기존내용 들어가게끔
				int birthyear;
				System.out.println(mdto);
				
				System.out.println("수정할 비밀번호는?");
				passwd = sc.next();
				sc.nextLine(); //버퍼처리
				System.out.println("수정할 생일은?");
				String birthyearS = sc.nextLine();  //안바꾸고싶을수도
				birthyear = 0;
				if (!birthyearS.equals("")) //입력 했다면
					birthyear = Integer.parseInt(birthyearS); //문자를 숫자로 변환
				mdto = new memberDTO(userid, passwd, birthyear);
				int  cnt = mdao.update(mdto);
				if (cnt > 0) {
					System.out.println("수정 완료");
					//수정 정보 내용 뿌려주기
					mdto = mdao.selectOne(userid);
					System.out.println(mdto);
				}else {
					System.out.println("수정 실패");
				}
				
			}else if(no==3) { //삭제
				if (!logincheck) {  //로그인 한 사람만 사용가능하게 제약
					System.out.println("로그인 후 사용 가능");
					continue; //와일문 처음으로 되돌림
				}
				System.out.println("삭제할 아이디는?");
				String userid = sc.next();
				if (!userid.equals(userid1)) {
					System.out.println("자신의 아이디만 수정할 수 있습니다.");
					continue;
				}
				int cnt = mdao.delete(userid);
				if (cnt > 0) {
					System.out.println("삭제 완료");
					userid1 = "";
				}else {
					System.out.println("삭제 실패");
				}
				
			}else if(no==9) {
				System.out.println("종료");
				break;
			}
			
			
			
			
			
		}
		
		

	}

}
