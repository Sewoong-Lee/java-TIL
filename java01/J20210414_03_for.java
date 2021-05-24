package java01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		//반복문 for
//		for(int i = 0; i<10; i++) {
//			
//			
//			System.out.println();
//		}
		
		//1부터 10까지의 합을 구하여라
//		int a =0;
//		for(int i = 0; i<11; i++) {
//			a += i;
//		}
//		System.out.println(a);
		
		
		//실습) 업다운게임	
		//1) 랜덤으로 1부터 100 사이 수 중 한개를 랜덤추출 하여 변수 저장
		//2) 반복문(for)을 이용하여 사용자에게 정수 입력 받기
		//3) 랜덤수와 비교하여 업 또는 다운을 출력
		//3) 2~3을 5을 반복
		//5) 정답 입력하면 사용자의 승리
		// 내가 한거
//		Scanner sc = new Scanner(System.in);
//		int r = (int)(Math.random()*100+1);
//		System.out.print(r);
//		
//		for(int i = 0; i<5; i++) {
//			System.out.print("\n수는?\n");
//			int a = sc.nextInt();
//			if(a==r) {
//				System.out.print("정답!\n"); break;
//			}else if(a>r) {
//				System.out.print("다운\n"); 
//			}else if(a<r) {
//				System.out.print("업\n"); 
//			}
//			if(i==5) {
//				System.out.println("실패\n"); break;
//			}
//		}

		
		// 불린을 이용하여 실패 확인
//		Scanner sc = new Scanner(System.in);
//		int r = (int)(Math.random()*100+1);
//		System.out.print(r);
//		boolean win = false;  //성공여부
//		for(int i = 0; i<5; i++) {
//			System.out.print("\n수는?\n");
//			int a = sc.nextInt();
//			if(a==r) {
//				win = true;  //윈을 트루로 바꿔줌
//				System.out.print("정답!\n"); break;
//			}else if(a>r) {
//				System.out.print("다운\n"); 
//			}else if(a<r) {
//				System.out.print("업\n"); 
//			}
//		}
//		if(!win) { //브레이크를 못만나고 빠져 나오면 펄스로 변경되어 종료
//			System.out.println("실패");
//		}
		
		
		
		//와일로 내가 한거
//		Scanner sc = new Scanner(System.in);
//		int r = (int)(Math.random()*100+1);
//		System.out.print(r);
//		int a;
//		int c=0;
//		while(true) {
//			System.out.print("\n수는?\n");
//			a = sc.nextInt();
//			if(a==r) {
//				System.out.print("정답!\n"); break;
//			}else if(a>r) {
//				System.out.print("다운\n"); 
//			}else if(a<r) {
//				System.out.print("업\n"); 
//			}
//			c++;
//			if(c>4) {
//				System.out.println("실패\n"); break;
//			}			
//		}

		
		
		//설탕 배달
		//(3 ≤ N ≤ 5000)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("설탕 얼마나 살래?");
//		int s = sc.nextInt();
//		System.out.print("구매수량 : "+s);
////		int s =23;
//		int a =0;
//		while(true) {
//			if(s%5==0 ) {
//				System.out.println("\n설탕 5키로 : "+s/5+"봉지"); break;
//			}else if(s%5!=0) {
//				a = s%5;
////				System.out.println(a);break;
//				if(a%3==0) {
//				System.out.println("\n5키로"+s/5+"\n3키로"+a/3);break;
//				}else {
//					System.out.println("\n-1");break;
//				}
//			}else if(s%3==0) {
//				System.out.println("\n설탕 3키로 : "+s/3+"봉지"); break;
//			}else {
//				System.out.println("\n-1");break;
//			}
//		}
		
		
		
		//해석 (와일문에 잇음)
		//백준 2839번 설탕배달
		//5키로와 3키로의 봉지 몇개가 필요한지
		//가장 작은수의 봉지 구하기
		// 15키로 : 5키로3
		//18키로 : 5키로 3  3키로 1
		//11키로 : 5키로 1  3키로2
		//7키로 : -1
		//1키로 : -1
		
		int nkg, count5, count3, rest; //이동할 kg수, 5kg봉지수, 3kg봉지수, 나머지
		// 이동해야할 kg수 입력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 소수 구하기
		//1안)
//		int a = 7;
//		boolean b = true;  //소수 여부
//		for(int i = 2;i<a;i++) {
//			if(a%i==0) {
//				System.out.println("소수가 아닙니다."); 
//				b=false;
//				break;
//			}
//		}
//		if (b){
//			System.out.println("소수입니다."); 
//		}
		
		//2안)
//		int a = 7;
//		int i;
//		for(i = 2;i<a;i++) {
//			if(a%i==0) {
//				System.out.println("소수가 아닙니다."); 
//
//				break;
//			}
//		}
//		if (i>a){
//			System.out.println("소수입니다."); 
//		}
		
		
		
		//1~n까지중의 소수 구하기
//		boolean b; //소수 여부
//		for(int j=2;j<101;j++) {
//			b = true; //소수라고 가정 하고 시작
//			for(int i = 2;i<j;i++) {
//				if(j%i==0) {
//					//System.out.println(j+"소수가 아닙니다."); 
//					b=false;
//					break;
//				}
//			}
//			if (b){
//				System.out.print(j+"  "); 
//			}
//		}
			
	
		

		
		
		
		
		
		
		
		
		

	}

}
