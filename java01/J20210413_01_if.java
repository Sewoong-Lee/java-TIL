package java01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
		//조건문 :if
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두수를 입력");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a>b) {
//			System.out.println("a가 크가");
//		} else { 
//			System.out.println("b가 크다");
//		}
		
		//점수를 입력받고 입력 받은 점수에 따라 등급을 출력 받으시오
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력");
//		int a = sc.nextInt();
//		
//		if(a>=90){
//			System.out.println("A");
//		}else if(a>=80) {
//			System.out.println("B");
//		}else if(a>=70) {
//			System.out.println("C");
//		}else if(a>=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		//실습 조건문
		//등수와 전체인원수를 입력 받아
		// 상위 15%는 a
		// 35% b 50% c
//		int a = 20;
//		
//		if(a<=(double)90*0.15) {
//			System.out.println("a");
//		}else if(a<=(double)90*0.35) {
//			System.out.println("b");
//		}else if(a<=(double)90*0.5) {
//			System.out.println("c");
//		}else {
//			System.out.println("나머지");
//		}
//		
//
//		//해석)
//		int a = 20, b=100;
//		
//		if(a<=b*0.15) {
//			System.out.println("a");
//		}else if(a<=b*0.35) {
//			System.out.println("b");
//		}else if(a<=b*0.5) {
//			System.out.println("c");
//		}else {
//			System.out.println("나머지");
//		}
		
		
		//실습)화씨(F) <=> 섭씨(C)오 바꾸기
		//공식 1) 화씨온도 섭씨온도로
						//섭씨온도 = (화씨온도-32) * 5/9
		//공식 2) 섭씨온도 화씨온도로
						//화씨온도 = 섭씨온도 * 9/5 + 32					
		//입력한 온도가 화씨인지 섭씨인지 구분
//		Scanner sc = new Scanner(System.in);
//		System.out.println("온도를 입력하라");
//		int a = sc.nextInt();
//		String b = sc.next();
//		
//		if(b=="f") {
//			System.out.println(a * 9/5 + 32);
//		}else {
//			System.out.println((a-32) * 5/9);
//		}
		
		
		//해석)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("온도를 입력하라");
//		int t = sc.nextInt();
//		String s = sc.next();
//		//문자열 비교시 equals 메소드를 이용하여 비교.
//		if(s.equals("c")) {  //s는 참조변수 즉 주소를 가지고 있으므로 그냥은 비교가 불가
//		System.out.println("화씨는"+(t * (double)9/5 + 32));
//		}else if(s.equals("f")){
//		System.out.println("섭씨는"+((t-32) * (double)5/9));
//		}else {
//			System.out.println("잘못");
//		}
		
		
		//실습) 계산기
		//ex) 10 + 20 = 30
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계산식은?");
//		int a = sc.nextInt();
//		String s = sc.next();
//		int b = sc.nextInt();
//		if(s.equals("+")) {
//			System.out.println(a+"+"+b+"="+(a+b));
//		}else if(s.equals("-")) {
//			System.out.println(a+"-"+b+"="+(a-b));
//		}else if(s.equals("/")) {
//			System.out.println(a+"/"+b+"="+(double)a/b);
//		}else if(s.equals("*")) {
//			System.out.println(a+"*"+b+"="+(a*b));
//		}else {
//			System.out.println("잘못");
//		}
		
		//해석 (인트 오타가 나면)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계산식은?");
//		try {
//			int a = sc.nextInt();
//			String s = sc.next();
//			int b = sc.nextInt();
//			if(s.equals("+")) {
//				System.out.println(a+"+"+b+"="+(a+b));
//			}else if(s.equals("-")) {
//				System.out.println(a+"-"+b+"="+(a-b));
//			}else if(s.equals("/")) {
//				System.out.println(a+"/"+b+"="+(double)a/b);
//			}else if(s.equals("*")) {
//				System.out.println(a+"*"+b+"="+(a*b));
//			}else {
//				System.out.println("잘못");
//			}
//			
//		}catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해 주세요");
//		}

		//계산기 2 (입력값 확인)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자값은?");
////		System.out.println("숫자?" + sc.hasNextInt());    //인트인지 확인 (트루 펄스 나옴)
//		if(sc.hasNextInt()) { //숫자라면?    //코드인스펙션 : 규율
//			                  //(sc.hasNextInt() == ture) 로도 가능 근데 나중에 코드인스펙션에서 걸림.
//			int a = sc.nextInt();
//			System.out.println(a);
//		}else {
//			System.out.println("숫자를 입력하세요");
//		}
		
		//잘못 먼저 체크
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자값은?");
//		if(!sc.hasNextInt()) {  //반대로 바꿔버림 //숫자가 아니라면
//			System.out.println("숫자를 입력하세요");
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}
		
		//실습)중첩 조건문
		//아이디와 패스워드를 입력 받아 로그린 성공여부를 결정짓는 프로그램을 만드셈
		//ex) 아이디 입력 :java
		//    아이디 일치
		//    패스워드 입력 : 1234
		//    패스워드 일치 
		//    로그인 성공
//		Scanner sc = new Scanner(System.in);
//		String id = "java";
//		String pw = "1234";
//
//		System.out.println("아이디는?");
//		String a = sc.next();
//		if(a.equals(id)) {  
//			System.out.println("아이디 일치");
//			System.out.println("비밀번호는?");
//			String b = sc.next();
//			if(b.equals(pw)) {
//				System.out.println("패스워드 일치");
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("패스워드 불일치");
//				System.out.println("로그인 실패");
//			}
//		}else {
//			System.out.println("아이디 불일치");
//			System.out.println("로그인 실패");
//		}
		
		

		

		
		
		//실습) 년을 입력받고 윤년인지 아닌지 확인하시오
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("년도는?");
//		int a = sc.nextInt();
//		
//		if (a%4==0 && a%100!=0 || a%400==0) {
//			System.out.println("윤년"); 
//		}else {
//			System.out.println("윤년아님");
//		}
		
		//해석  : 어렵게 하면
		//윤년의 조건 : 4의 배수, 100의 배수이면 안된다., 400면은 윤년
//		int y = 100;
//		if(y%4==0) {
//			if(y%100==0) {
//				if(y%400==0) {
//					System.out.println("윤년");
//				}else {
//						System.out.println("윤년아님");
//					}
//				}
//			}else {
//				System.out.println("윤년");
//			}
//			
//		}else {
//			System.out.println("윤년아님");
//		}
		//해석 쉽게
//		if (a%4==0 && a%4!=100 || a%400==0) {
//			System.out.println("윤년"); 
//		}else {
//			System.out.println("윤년아님");
//		}
		
		
		
		//전기요금 구하기
		//300와트 이하 사용 기본 910  전력 88.3
		//와트 301~450  기본 1600  전력 182.9
		//450와트 초과  기본 7300  전력 275.6
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("몇와트?");
//		int a = sc.nextInt();
//		double b = a*83.3;   //동계
//		double c = (200*83.3)+(a-200)*182.9;
//		double d = c+(a-400)*275.6;
//		
//		double e = a*83.3;   //하계
//		double f = (200*83.3)+(a-200)*182.9;
//		double g = c+(a-400)*275.6;
//		
//		if(a<200) {
//			System.out.println("기본요금 910원,  전력량요금"+b);
//		}else if(a<400) {
//			System.out.println("기본요금 1600원,  전력량요금"+c);
//		}else if(a>400) {
//			System.out.println("기본요금 7300원,  전력량요금"+d);
//		}
		
		//해석
//		double won;
//		int use=455; //사용량
//		double eleuse1 = 88.3; //1단계 전력량요금
//		double eleuse2 = 18.9; //2단계 전력량요금
//		double eleuse3 = 275.6; //3단계 전력량요금
//		int base;//기본요금
//		if (use <= 200) {  //1단계
//			base = 910;
//			won = base + use *eleuse1;
//		}else if (use<=400) {  //2단계
//			base = 1600;
//			won = base + (200 *eleuse1) + ((use-200) *eleuse2);
//		}else {  //3단계
//			base = 7300;
//			won = base + (200 *eleuse1) + (200 *eleuse2) + ((use-400) *eleuse3);
//		}
//		
//		System.out.println("사용요금" +  (int)won);
		
//		won = Double.parseDouble( String.format("%.2f", won)); 소수점처리
//		System.out.println(Math.floor(won));  //버림
//		System.out.println(Math.ceil(won));  //올림
//		System.out.println(Math.round(won));  //반올림
		
		
		//랜덤 (무작위 수 추출)
		// 0<= 랜덤값 <1
		//r* (마지막-스타트+1)+스타트
//		double r = Math.random();
//		System.out.println(r);
//		System.out.println((int)(r*6+1)); //인트로 바꿈, 0이 나오면 안된까 1 더함. //1~6
		//내가한거
//		System.out.println((int)(r*6+5));  //5~10
//		System.out.println((int)(r*11+10));  //11~20
//		
//		//해석
//		System.out.println((int)(r*(10-5+1)+5)); //5~10  (마지막-시작값+1)
//		System.out.println((int)(r*(20-11+1)+11)); //11~20  (마지막-시작값+1)
		
		
		//주사위 게임
//		int a = (int)(Math.random()*6+1);
//		int b = (int)(Math.random()*6+1);
//		System.out.println("A : "+a);
//		System.out.println("B : "+b);
//		if(a>b) {
//			System.out.println("A승");
//		}else if {
//			System.out.println("B승");
//		}else {
//			System.out.println("무승부");
//		}
		
		
		
		

	}

}
