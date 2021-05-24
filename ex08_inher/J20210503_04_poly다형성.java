package ex08_inher;

//모양 클래스
//부모 클래스
class Shap {
//	private int hei;
//	private int wid;
	//다형성을 위해서 메소드를 작성
	void printShap() {
		System.out.println("다각형");
	}
}

//자식 클래스
//사각형 클래스
class Rect extends Shap{
	//오버라이딩
	@Override
	void printShap() {
		// TODO Auto-generated method stub
		System.out.println("사각형");
	}
}
//삼각형 클래스
class Tra extends Shap{

	//오버라이딩
	@Override
	void printShap() {
		// TODO Auto-generated method stub
		System.out.println("삼각형");
	}

}


public class J20210503_04_poly다형성 {

	public static void main(String[] args) {
		//다형성
		//다형성을 이용하여 메소드릴 실행 하려면 반드시 오버라이딩이 되어 있어야한다.
		//런타임시 자식 메소드 실행, 그러나 문법적인 에러로 부모 클래스 메소드에 빈 값이라도 넣어야한다.
		Shap r1 = new Rect();   //부모형으로도 Rect를 저장 가능
		r1.printShap();         //만약 Shap에 프린트 등의 기능이 없을경우 컴파일에러
		
		Tra t1 = new Tra();
		
		t1.printShap();
		

	}

}
