package ex03_leng;

public class J20210421_01_wrapper {

	public static void main(String[] args) {
		//래퍼클래스
		int a = 10;
		System.out.println(String.valueOf(a)+100); //a가 문자가 되었다.
		
		String s ="10";  //문자열(String)는 기본형이 아닌 객체여서 형변환 연산자가 안됨
		System.out.println(Integer.parseInt(s)+100); //s가 숫자가 되었다.  //이렇게 감싸는애들을 래퍼 클래스라고함.  //이걸 제일 많이 씀
		
		double b = 1.5; //기본형은 형변환 연산자 가능
		int aa = (int)b;
		
		System.out.println(Integer.valueOf(s)+100);  //래퍼클래스로 돌려줌 (기본형이랑 호환 가능)
		
		Integer c =10; //래퍼클래스로 선언해도 상관 없음 (객체) (c. 가능 (객체이기떄문에))
		//int e= 10; // 기본형 선언 (f. 사용 불가)
		int f= c;  //이거도 자동 형변환으로 사용 가능.  //자동형변환 : 오토박싱, 언박싱
		System.out.println(c+f);
		
		Integer j =new Integer(10);  //이렇게 그어진건 나중에 호환성문제의 가능성이 있으므로 사용하지마셈
		System.out.println(j);
		
//		//2진수 변환
//		int g = 255;
//		System.out.println(Integer.toBinaryString(g));
//		
//		//Boolean 클래스
//		String h = "TRUE";
//		System.out.println(Boolean.parseBoolean(h)); //스트링 넣으면 불린형으로
		
		
		
		

	}

}
