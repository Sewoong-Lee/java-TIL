package java01;

import java.math.BigDecimal;

public class J20210412_02_variable {

	public static void main(String[] args) {
		//정수형 변수
//		int a = 10, b=20;
//		System.out.println(a+"+"+b+"="+(a+b));
//		System.out.println(a+"-"+b+"="+(a-b));
//		System.out.println(a+"/"+b+"="+((double)a/b));  //더블로 형변환
//		System.out.println(a+"*"+b+"="+(a*b));
//		System.out.printf("%d / %d = %.2f", a, b, (double)a/b);
		
//		byte a = 10;
//		System.out.println(a);
		
		// 실수형
//		float f = 3.14f;  //4바이트  f붙여주셈 (float)를 앞에 붙여도댐 
//		double d = 3.14;  //8바이트
//		
//		System.out.println(d);
//		System.out.println(f);
		
		//부동 소수점의 오차
//		double d = 608.4, d2 = 206.2;
//		System.out.println(d+d2);
//		System.out.printf("%.2f\n ",d+d2);
		
		//돈계산같은 정확성이 필요시
		//참조형 생성 
//		BigDecimal b1 = new BigDecimal("608.1");
//		BigDecimal b2 = new BigDecimal("206.1");
//		
//		BigDecimal result = b1.add(b2);
//		System.out.println(result);
		
		//문자형
//		char c = 'a';
//		System.out.println(c);
//		char c2 = '가';
//		System.out.println(c2);  //유니코드
//		System.out.println(c2+0);  //편법으로 유니코드 보는법 (코드화) 유니코드값 출력
		
		
		//논리형
//		boolean b = true;
//		System.out.println(b);
		
		
		//문자열 : 참조형
		//문자열은 형이 없다.
		//1)
//		String s1 = new String("자바");
//		System.out.println(s1);
//		//2)
//		String s2 = "자바";
//		System.out.println(s2);
		
		//형변환
		//자동 형변환 : (작은형이 큰형으로 자동형변환)
		//명시적 형변환 이 있다
//		byte b = 10;
//		int a = b; // 1바이트 안에 4바이트가 들어가는건 에러가 안남 (자동 형변환)
		
//		byte c = (byte)a; //명시적인 형변환 (큰형이 작은형으로 변환)
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		
		//상수
//		final float PI = 3.14f;
		//PI = 5.15f; //상수는 변경 불가능
//		System.out.println(PI);
		

		
	}

}
