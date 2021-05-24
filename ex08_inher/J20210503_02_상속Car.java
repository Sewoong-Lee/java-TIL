package ex08_inher;
//부모 클래스
//사칙 연산

class Cal{
	private String color;
	//부모 클래스의 생성자를 자식 클래스에서 실행
	public Cal(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	//같은 패키지와 자식 클래스에서 접근 가능
	protected double result;  //protected 로 자식에서 접근 가능하게 만듬
	
	
	public double getResult() {
		return result;
	}
	
	double add (double a,double b) {
		double c;
		c = a+b;
		return c;
	}
	double bbe (double a,double b) {
		double c;
		c = a-b;
		return c;
	}
	double gob (double a,double b) {
		double c;
		c = a*b;
		return c;
	}
	double na (double a,double b) {
		double c;
		c = a/b;
		return c;
	}
}

//자식 클래스
//나머지, 제곱 추가
class NewCal extends Cal {
	private double result;  //자식에도 같은 변수가 있으면 자식 변수 우선
	public NewCal(String color) {
		super(color);  //부모 클래스의 생성자를 실행합니다.
	}
	
	double add(double a) {  //부모의 result 사용중
		result +=a;
		return result;
	}
	
	
	double muji(double a, double b){
		double c;
		c = a%b;
		return c;
	}
	
	
	
	
}





public class J20210503_02_상속Car {

	public static void main(String[] args) {
		NewCal nc = new NewCal("빨강");
		
		System.out.println(nc.getColor());
		System.out.println(nc.add(10, 10));
		System.out.println("나머지" + nc.muji(10, 3));
		System.out.println(nc.add(15));
		System.out.println(nc.add(15));
		System.out.println(nc.add(20));
		System.out.println(nc.add(90));
		//System.out.println(nc.result);
		System.out.println(nc.getResult());
		//오브젝트 메소드 사용 가능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
