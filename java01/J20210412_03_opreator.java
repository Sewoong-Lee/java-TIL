package java01;

public class J20210412_03_opreator {

	public static void main(String[] args) {
		//연산자
		
		//삼항연산자
		//양수 또는 음수 출력
//		int a = 10;
//		String s1=(a>0)?"양수" : "음수";
//		System.out.println(s1);
		
		//실습 두수중 큰수를 출력
//		int a=100, b=110;
//		String s1=(a>b)?"a" : "b";
//		System.out.println(s1);
		
		//세 수중 제일 큰 수 출력
//		int a=20, b=5, c=50;
//		String s1=(a>b)?"a":"b" ;
//			String s2=(b>c)?"b":"c";
//		System.out.println(s2);	
//		
//		//해석)
//		int max = a>b? a:b;
//		max = max>c?max:c;
//		//int max = a>b?(a>c)?a:c:(b>c)?b:c;   //한줄로 하면
//		System.out.println(max);
		
		
		
		//실습) 짝홀수 출력하기
//		int odd =11;
//		String s3=(odd%2==0)?"짝":"홀";
//		System.out.println(s3);	
		
		//해석)
//		int odd =11;
//		String s = odd%2==0?"짝":"홀";
//		System.out.println(s);
		
		//실습) 세과목이 모두 60점이 넘으면 합격 아니면 불합격
//		int k=90, e=10, m=70;
//		String s5=(k>60)?"합":"불"; 
//			String s6=(e>60)?"합":"불";
//				String s7=(m>60)?"합":"불";
//		System.out.println(s7);	
		
		//해석)
//		int k=90, e=80, m=70;
//		String s = (k>=60 && e>=60 && m>= 60)?"합":"불";
//		System.out.println(s);
		//한줄로 하면 System.out.println((k>=60 && e>=60 && m>= 60)?"합":"불");

	}

}
