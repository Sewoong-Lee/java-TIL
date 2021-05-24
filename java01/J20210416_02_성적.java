package java01;

import java.util.Scanner;

public class J20210416_02_성적 {

	public static void main(String[] args) {  //스위치 문으로
		Scanner sc = new Scanner(System.in);
		String[] su = {"국어","영어","수학"};
		int[][] s = new int [2][3];
		while(true) { 
		//타이틀 만들기
			System.out.println("성적 출력 프로그램 V1.0.0");
			System.out.println("-------------------------");
			System.out.println("1.성적 등록");
			System.out.println("2.학생별 합계 평균");
			System.out.println("3.과목별 합게 평균");
			System.out.println("9.종료");
			System.out.println("-------------------------");
			System.out.println("번호를 선택하세요.");
			int no = sc.nextInt();
			sc.nextLine();
			//점수 입력 받기
			switch(no) {
			case 1:
				for(int i=0;i<s.length;i++) {
					System.out.println(i+1+" 번 과목 점수.");
					for(int j=0;j<s[i].length;j++) {
						System.out.printf("%s ?",su[j]);
						s[i][j] = sc.nextInt();
					}
				}
			case 2:
				for(int i=0;i<s.length;i++) {
					int sum = 0;  //한명 하고 초기화
					for(int j=0;j<s[i].length;j++) {
						sum += s[i][j];
					}
					System.out.println("합계"+sum);
				}	
			case 3:
				for(int j=0;j<s[0].length;j++) {  //i가 없으므로 0번에 랭스해도댐
					int sum = 0;  
					for(int i=0;i<s.length;i++) {
						sum += s[i][j];
					}
					System.out.printf("%s 합계"+sum+"\n",su[j]);
					System.out.printf("%s 평균"+(double)sum/s.length+"\n",su[j]);
				}
				break; //이거 왜 쓰는지 궁금
			case 9:
				System.out.println("종료"); //break;
				System.exit(0);  //0은 정상 종료  브레이크 대신
			default:
				System.out.println("잘못된 번호입니다.");
			}	
			// 메뉴 이후 홀딩
			sc.nextLine();  //기존 버퍼 비우기
			System.out.println("엔터 누르세요");
			sc.nextLine();  // 홀딩
		}
	}
	
}
