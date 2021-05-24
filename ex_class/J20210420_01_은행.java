//package ex_class;
//
//import java.util.Scanner;
//
////은행 : Bank
////필드: 은행명, 계좌번호, 계좌의 잔액
////생성자, 게터, 세터
//
//public class Bank{
//	private String bankname;
//	private String bankno;
//	private int balance;
//	//생성자 : 오버로딩
//	Bank(String bankname, String bankno){
//		this.bankname = bankname;
//		this.bankno = bankno;
////		this.balance = balance; //잔액은 안만들어도댐(어짜피 0원일테니까)
//	}
//	public Bank(String bankname, String bankno, int balance) {
//		this.bankname = bankname;
//		this.bankno = bankno;
//		this.balance = balance;
//	}
//
//
//	void setBankname(String bankname) {  //이건 바뀌면 안되니까 안만들어도댐
//		this.bankname = bankname;
//	}
//	void setBankno(String bankno) {
//		this.bankno = bankno;
//	}
////	void setBalance(int balance) {  //맘대로 바뀌면 안되니까 만들지마셈
////		this.balance = balance;
////	}
//	
//	String getBankname() {
//		 return bankname;
//	}
//	String getBankno() {
//		 return bankno;
//	}
//	int getBalance() {
//		 return balance;
//	}
//	
//	//입금 메소드
//	void ib(int a) {
//		balance +=a;
//	}
////	//출금 메소드
////	void chul(int a) {
////		if(balance-a<0) {
////			System.out.println("출금 불가");
////		}else {
////			balance -=a;
////		}
////	}
//	
//	//출금 메소드 2
//	int chul(int a) {
//		if(balance-a<0) {
//			return -1;   //출금 불가
//		}
//			return 0;  //출금 가능
//	}
//	
//	
//	//어노테이션, 어떤 기능을 하는지 알려줌
//	//오버라이딩 : 부모 클래스의 메소드를 재정의
//	@Override 
//	public String toString() {
//		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
//	}	
//}





