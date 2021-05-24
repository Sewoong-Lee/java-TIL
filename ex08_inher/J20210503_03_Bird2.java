package ex08_inher;
//이름넣기 2
//부모 클래스
class Bird{
	protected String name;
	
	public Bird(String name) {
		super();
		this.name = name;
	}
	void born() {
		System.out.println(name +"알을 낳음");
	}
	void fly() {
		System.out.println(name + "난다");
	}
}

class Srerrow extends Bird {

	Srerrow(String name){
		super(name); //부모의 생성자 실행
		//super : 내 클래스의 name를 부모에 셋팅해라
	}
}

class Ostrich extends Bird{

	Ostrich(String name){
		super(name); //부모의 생성자 실행 
	}

	//오버라이딩
	@Override  //얘가 있으면 오타나도 잡아줌
	void fly() {  //부모클래스의 메소드를 재정의 수정 (오버라이딩)
		System.out.println(name + "날수 없다.");  //자식 메소드에 같은게 있으면 자식 우선 //우클릭 소스 오버라이드 임프리먼트 누르면 자동 완성
	}
	
}


public class J20210503_03_Bird2 {

	public static void main(String[] args) {
		Srerrow s1 = new Srerrow("참새");
		
		s1.born();
		s1.fly();
		
		Ostrich o1 = new Ostrich("타조");
		o1.born();
		o1.fly();
		
		Bird o2 = new Ostrich("타조");  //부모형으로도 선언 가능 (부모는 자식을 다 나타낼 수 있음)
		
		
		Object o3 = new Ostrich("타조");  //업캐스팅 (자식형을 부모형으로) (자동)
		Ostrich o4 = (Ostrich)o3;  //다운캐스팅 (부모형을 자식형으로) (수동)
		o4.fly();
		
		
		

	}

}
