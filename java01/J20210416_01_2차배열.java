package java01;

import java.util.Scanner;

public class J20210416_01_2차배열 {

	public static void main(String[] args) {
		// 2차원 배열
//		int[][] arr = new int[3][4];
//		int[][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //선언과 동시에 초기화
//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};  //생략 가능
//		System.out.println(arr[1][2]);  //7
		
//		for(int i=0;i<3;i++) {  //반복문을 사용하여 값 전체 출력
//			for(int j=0;j<4;j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		
//		for(int i=0;i<arr.length;i++) {  //반복문을 사용하여 값 전체 출력
//			for(int j=0;j<arr[i].length;j++) { //랭스 활용
//				System.out.print(arr[i][j]);
//			}System.out.println(); //1행 끝나고 줄바꿈
//		}
		
		
		//for each
//		for(int[] a :arr) {
//			for(int b :a) {
//				System.out.println(b);
//			}
//		}
		
		
		//1~12 대입 :반복문을 이용하여 
//		int[][] arr = new int [3][4];
//		int a=0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i][0]=i;
//			for(int j=0;j<arr[i].length;j++) {
//				a++;
//				arr[i][j]=a;
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//해석
		//1)
//		int[][] arr = new int [3][4];
//		int a=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=++a;
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//2)
//		int[][] arr = new int [3][4];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=(i*arr[i].length)+(j+1);
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
		//두명의 학생의 국영수 점수를 입력 받아 배열에 저장하고 각자의 합계와 평균을 구하는 
		//프로그램을 작성해 봅시다.
//		Scanner sc = new Scanner(System.in);
//		int[][] s = new int [2][3];
//		int sum = 0;
//		int sum1 = 0;
//		for(int i=0;i<s.length;i++) {
//			System.out.print((i+1)+" 번 과목 점수.");
//			for(int j=0;j<s[i].length;j++) {
//				s[i][j] = sc.nextInt();
//			}
//		}
//			
//		for(int i=0;i<s.length;i++) {
//			for(int j=0;j<s[i].length;j++) {
//				sum += s[0][j];
//				sum1 += s[1][j];
//			}
//			System.out.println(sum+sum1);
//		}
		//왜 나눌수가 없을까나............ sum 초기화 안하고 있었네
		
		
		//해석
		Scanner sc = new Scanner(System.in);
		String[] su = {"국어","영어","수학"};
		int[][] s = new int [2][3];
		
		//타이틀 만들기
		while(true) {
			System.out.println("성적 출력 프로그램 V1.0.0");
			System.out.println("-------------------------");
			System.out.println("1.성적 등록");
			System.out.println("2.학생별 합계 평균");
			System.out.println("3.과목별 합게 평균");
			System.out.println("4.종료");
			System.out.println("-------------------------");
			System.out.println("번호를 선택하세요.");
			int no = sc.nextInt();
			//점수 입력 받기
			if(no==1) {
				for(int i=0;i<s.length;i++) {
					System.out.println(i+1+" 번 과목 점수.");
					for(int j=0;j<s[i].length;j++) {
						System.out.printf("%s ?",su[j]);
						s[i][j] = sc.nextInt();
					}
				}
			}else if(no==2) {//학생별 합계 평균
				for(int i=0;i<s.length;i++) {
					int sum = 0;  //한명 하고 초기화
					for(int j=0;j<s[i].length;j++) {
						sum += s[i][j];
					}
					System.out.println("합계"+sum);
				}	
			}else if(no==3) {//국어 영어 수학의 평균
				for(int j=0;j<s[0].length;j++) {  //i가 없으므로 0번에 랭스해도댐
					int sum = 0;  
					for(int i=0;i<s.length;i++) {
						sum += s[i][j];
					}
					System.out.printf("%s 합계"+sum+"\n",su[j]);
					System.out.printf("%s 평균"+(double)sum/s.length+"\n",su[j]);
				}
			}else if(no==4) {
				System.out.println("종료");break;
			}else {
				System.out.println("잘못된 번호입니다.");
			}
			// 메뉴 이후 홀딩
			sc.nextLine();  //기존 버퍼 비우기
			System.out.println("엔터 누르세요");
			sc.nextLine();  // 홀딩
		}
		
		//int, float, double, byte, short, boolean //기본형 주소없이 값만 가지고있음
		//int[][] a 배열은 참조변수  //String 등등
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
