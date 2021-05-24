package ex04_generics;


//사각형 클래스
//필드 : 가로, 세로, 넓이(int) 
//제네릭 타입 : 객체(인스턴스)를 생성시 형을 결정 (T는 별로 상관 없음 ㅋ)
//T = 타입의 약자로 관례적으로 사용.
// T : Type, K:Key, V: Value 등등
class Rectangle<T>{ //괄호 앞에 <T> 붙이면 형에 상관없이 적용 가능 int -> T
	private T w;
	private T h;
	private double area;
	
	public Rectangle() {}
	public Rectangle(T w, T h) {
		super();
		this.w = w;
		this.h = h;
		// T 형이면 값이 뭔지 몰라서 안댐 area = w*h;  //넓이 자동계산 (객체가 생성이 될때 가로 세로를 입력 받으면 바로 계산)
		area = getArea(w,h);  // 생성자에서 계산하려면 메소드 호출
	}
	public T getW() {
		return w;
	}
	public T getH() {
		return h;
	}
	
	public double getArea(T h, T w) {  //제네릭은 연산이 안되서 이렇게 해야한당
		double result = 0;
		if (w instanceof Integer) { //width가 Integer형이라면
			result =(int)w * (int)h;
		}else if (w instanceof Double)
			result =(double)w * (double)h;
		
		return result;
	}
	
	public void setW(T w) {
		this.w = w;
	}
	public void setH(T h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + ", area=" + area + "]";
	}
	
	
	
}


public class J20210422_01_generics {

	public static void main(String[] args) {
		Rectangle<Integer> r1= new Rectangle<>(10,10); // 클래스 이름 뒤에 형을 지정 <Integer>  // 객체를 생성할때 형을 지정 //반드시 래퍼클래스
		//뒤에 중괄호는 내용 생략 가능
		System.out.println(r1);
		
		Rectangle<Double> r2= new Rectangle<Double>(10.5,10.5);  //더블형 추가.
		System.out.println(r2);
		
		
	}

}
