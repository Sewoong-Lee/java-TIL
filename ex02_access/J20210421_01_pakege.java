package ex02_access;

import ex_class.Bank;  //임포트로 클래스 호출 가능
//import java11.*; //이 안에있는 모든 클레스 호출

public class J20210421_01_pakege {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getA());
		
		//java11.Bank b1 = new java11.Bank("국제", "1111", 500);  //다른 패키지의 클레스 호출
		
		//접근제어자
		//public class Bank 뱅크 클래스 앞에 이름 바꿔야함
		//public : 모든 클래스가 접근 가능
		//privare : 자신의 클래스 내부에서만 접근 가능
		//default(접근제어자없음):같은 패키지만 접근 가능
		Bank b1 = new Bank("국제", "1111", 500);  
		
		
		
		
	}

}
