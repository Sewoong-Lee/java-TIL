package java01;

import java.util.Scanner;  //2번쨰 스캐너 임포트

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		//사용자에게 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수는?  ");
//		int a = sc.nextInt();
//		System.out.println("입력받은값은  "+a);
		
		//반지름을 입력받아 원의 넓이 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반지름은?  ");
//		double a = sc.nextDouble();
//		System.out.printf("원의 넓이는 %.2f\n",a*a*Math.PI);  //정확히 하고싶으면 Math.pi를 3.14 대신 씀
		
		
		//문자열의 입력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름은?");
//		String n = sc.next();
//		System.out.println("나의 이름은 "+n);
		
		//한줄을 읽어드리는 메소드 (공백 포함, 엔터값 기준)
//		Scanner qq = new Scanner(System.in);
//		System.out.print("이름은?");
//		String n = qq.nextLine();
//		System.out.print(n);
		
		//나이와 이메일, 이름을 입력받아 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("나이?");
//		int m = sc.nextInt();  //정수 입력
//		System.out.print("메일?");
//		String c = sc.next();  //문자 출력
//		sc.nextLine(); //엔터 처리 (버퍼를 비우기 위해)
//		System.out.println("이름은?");
//		String n=sc.nextLine();  //문자열 출력 (위에 엔터값이 남아있어서 그냥 넘어감)
//		System.out.println("나이"+m+"메일"+c+n);
		
		
		//실습) 반, 이름, 파이썬, 씨, 자바 점수를 입력받아
		//반,이름, 과목의 총점과 평균을 구하여 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반은?");
//		int a = sc.nextInt();
//		System.out.println("이름은?");
//		String b = sc.next();
//		System.out.println("파,씨,자의 점수는?");
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		int e = sc.nextInt();
//		int f = c+d+e;
//		System.out.printf(a+"반 "+b+"  "+f+"  "+"%.2f",(double)f/3);
		
		
		
		//해석)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반 이름은?");
//		String a = sc.next();
//		String n = sc.next();
//		System.out.println("파,씨,자의 점수는?");
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		int e = sc.nextInt();
//		System.out.println("-----------------------------");
//		System.out.println("반  "+a);
//		System.out.println("이름  "+n);
//		int sum = c+d+e;
//		double avg = sum / 3.;
//		System.out.println("총점 "+sum);
//		System.out.println("평균 "+avg);
//		System.out.println("평균 "+(double)sum/3);
//		// 소수점 다른 방법
//		System.out.println("평균 "+avg*100);  //1단계
//		System.out.println("평균 "+Math.round(avg*100)); //2단계
//		System.out.println("평균 "+(double)Math.round(avg*100)/100); //3단계
		
		//포맷 메소드
//		System.out.println("포맷 메소드"+String.format("%.2f", avg));
		
	}

}
