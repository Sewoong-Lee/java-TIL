package ex_class;

//계산기 클래스
class Cal{
	//속성 : 필드
	String maker = "로아계산기";
	//기능 : 메소드
	int add(int a, int b) { //더하기 기능 : 더한값을 리턴
		int r=a+b;
		return r;  //r은 지역변수
	}
	int bbe(int a, int b) { //빼기
		int r=a-b;
		return r;  
	}
	int gob(int a, int b) { //곱하기
		int r=a*b;
		return r;  
	}
	double nanu(int a, int b) { //나누기
		return (double)a/b;   //바로 리턴해도 된다.
	}
	
	
	
}

public class J20210419_01_cal {

	public static void main(String[] args) {
		Cal c1 = new Cal();
		System.out.println(c1.maker);
		int a=20, b=3;
		int c=c1.add(a, b);
		System.out.println(c);
		System.out.println(c1.bbe(a, b));
		System.out.println(c1.gob(a, b));
		System.out.println(c1.nanu(a, b));
		
		
		
		
		
		
		
		
		

	}

}
