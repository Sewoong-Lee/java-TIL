package java01;

import java.util.Scanner;

public class J20210414_01_swich {

	public static void main(String[] args) {
		// 스위치 조건문
		// 숫자값에 대한 영어 단어 출력
//		int a = 3;
//		switch(a){
//		case 1: 
//			System.out.println("one"); break;
//		case 2: 
//			System.out.println("t"); break;
//		case 3: 
//			System.out.println("w"); break;
//		default:
//			System.out.println("오류");
//		}
		
		
		//h=고등, m중학 e초등
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단어는?");
//		String c = sc.next();
////		char c = 'h';
//		switch(c){
//		case "h":   //스트링 = 문자열이므로 ""로 만들어야 비교 가능
//			System.out.println("고등"); break;
//		case "m": 
//			System.out.println("중학"); break;
//		case "e": 
//			System.out.println("초등"); break;
//		default:
//			System.out.println("오류");
//		}
		
		
		//문자열의 비교
//		String s1 ="java";
//		String s2 = new String ("java");  //상수풀을 쓰지않고 무조건 새로운 객채를 만들어라
//		String s3 = "java";
//		if (s1==s2) { //주소 비교
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		
		
		// 짝수인지 홀수 인지 확인
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단어는?");
//		int s = sc.nextInt();
//
//		switch(s%2) {
//		case 0:
//			System.out.println("짝수"); break;
//		case 1:
//			System.out.println("홀수"); break;
//		}
		
		
		//학점 매기기
		//100~90점 a, 89~80점 b 등등
		
		//내가한거
		Scanner sc = new Scanner(System.in);
		System.out.print("점수는?");
		int s = sc.nextInt();
		switch(s/10) {
		case 10:
		case 9:
			System.out.println("a"); break;
		case 8:
			System.out.println("b"); break;
		case 7:
			System.out.println("c"); break;
		case 6:
			System.out.println("d"); break;
		default:
			System.out.println("f");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
