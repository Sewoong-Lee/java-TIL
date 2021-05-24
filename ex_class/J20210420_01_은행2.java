package ex_class;

import java.util.Scanner;


public class J20210420_01_은행2 {
	public static void main(String[] args) {
//		Bank b1 = new Bank("무야호은행","11122");
//		b1.setBankno("1112587"); //계좌번호 바꿈
//		System.out.println(b1.getBankname() + " " + b1.getBankno() +" "+ b1.getBalance());
//		System.out.println(b1);
//		b1.ib(10000);  //입금
//		System.out.println(b1);
//		b1.chul(500);  //출금
//		System.out.println(b1);
		
//		Bank b2 = new Bank("무한은행","99-99-99",10000);
//		b2.setBankno("111-111-111");
//		System.out.println(b2.getBankname() + " " + b2.getBankno() +" "+ b2.getBalance());
//		System.out.println(b2);
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		Bank b1 = new Bank("","");
//		while(true) {
//			System.out.println("1. 계좌 계설");
//			System.out.println("2. 입금");
//			System.out.println("3. 출금");
//			System.out.println("9. 종료");
//			System.out.println("번호는?");
//			int no = sc.nextInt();
//			
//			if(no==1) {
//				System.out.println("1. 은행명을 입력하세요.");
//				String n1 = sc.next();
//				System.out.println("2. 계좌번호를 입력하세요.");
//				String n2 = sc.next();
//				b1.setBankname(n1);
//				b1.setBankno(n2);
////				Bank b1 = new Bank(n1,n2);
//			}else if (no==2) {
//				System.out.println("입금액을 입력");
//				int n1 = sc.nextInt();
//				b1.ib(n1);
//				
//			}else if (no==3) {
//				System.out.println("출금액을 입력");
//				int n1 = sc.nextInt();
//				b1.chul(n1);
//			}else if (no==9) {
//				System.out.println("종료");
//				break;
//			}
//		}
//		System.out.println(b1);
		
		//-------------------------------------------------------------------------------------------------------------------------
		
//		//해석
//		Scanner sc = new Scanner(System.in);
//		Bank b1 = null;
//		while(true) {
//			System.out.println("1. 계좌 계설");
//			System.out.println("2. 입금");
//			System.out.println("3. 출금");
//			System.out.println("9. 종료");
//			System.out.println("번호는?");
//			int no = sc.nextInt();
//			
//			if(no==1) {
//				System.out.println("1. 은행명을 입력하세요.");
//				sc.nextLine();
//				String n1 = sc.nextLine();
//				System.out.println("2. 계좌번호를 입력하세요.");
//				String n2 = sc.next();
//				b1 = new Bank(n1,n2);
//			}else if (no==2) {
//				if(b1==null) {
//					System.out.println("계좌를 먼저 개설하세요.");
//					continue;
//				}
//				System.out.println("입금액을 입력");
//				int n1 = sc.nextInt();
//				b1.ib(n1);
//				
//			}else if (no==3) {
//				if(b1==null) {
//					System.out.println("계좌를 먼저 개설하세요.");
//					continue;
//				}
//				System.out.println("출금액을 입력");
//				int n1 = sc.nextInt();
//				b1.chul(n1);
//			}else if (no==9) {
//				System.out.println("종료");
//				break;
//			}
//		}
//		System.out.println(b1);
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		// 배열에 넣어서 하기
		Scanner sc = new Scanner(System.in);
		
		Bank[] bank = new Bank[3];  //이제 b1이 아닌 배열로 사용  //Bank 객체의 공간 3개를 만듬, Bank가 3개가 아님
		int i;
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 계좌 계설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액");
			System.out.println("9. 종료");
			System.out.println("번호는?");
			int no = sc.nextInt();
			System.out.println("---------------------------------");
			System.out.println("고객의 번호는?");
			i = sc.nextInt();
			
			if(no==1) {
				System.out.println("1. 은행명을 입력하세요.");
				sc.nextLine();
				String n1 = sc.nextLine();
				System.out.println("2. 계좌번호를 입력하세요.");
				String n2 = sc.next();
				bank[i-1] = new Bank(n1,n2);
			}else if (no==2) {
				if(bank[i-1]==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.println("입금액을 입력");
				int n1 = sc.nextInt();
				bank[i-1].ib(n1);
				
			}else if (no==3) {
				if(bank[i-1]==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.println("출금액을 입력");
				int n1 = sc.nextInt();
				int r = bank[i-1].chul(n1);
				if (r==0) {
					System.out.println("출금 완료");
					System.out.println("잔액"+bank[i-1].getBankno());
				}else {
					System.out.println("출금 불가");
					System.out.println("잔액"+(bank[i-1].getBankno()+n1));
				}
			}else if (no==4) {
				System.out.println(bank[i-1].getBalance());
			}else if (no==9) {
				System.out.println("종료");
				break;
			}
		}
//		System.out.println(b1);
		System.out.println(bank[0]);
		System.out.println(bank[1]);
		System.out.println(bank[2]);

		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
