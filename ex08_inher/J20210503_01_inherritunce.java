package ex08_inher;

//부모 클래스
//final class Person{ //클래스에도 파이널 붙이면 상속 불가
class Person{
	protected String name;
	//protected : 자식 클래스만 접근 가능
	void breath() {
		System.out.println(name + "숨쉬기");
	}
//	final void eat() { //파이널 붙이면 재정의(오버라이딩) 불가
//		System.out.println(name + "먹기");
//	}
	void eat() {
		System.out.println(name + "먹기");
	}
}

//자식 클래스
class Stundent extends Person {
	private String name = "학생";
	Stundent(){
		super.name = this.name;  //부모에서 자식 데이터 이용
		//super : 내 클래스의 name를 부모에 셋팅해라
	}
	void learn() {
	System.out.println(name + "배우다");
	}
}

class Teacher extends Person {
	private String name = "선생님";
	Teacher(){
		super.name = this.name;  //부모에서 자식 데이터 이용
		//super : 내 클래스의 name를 부모에 셋팅해라
	}
	void teac() {
		System.out.println(name + "가르치다");
		}
}

public class J20210503_01_inherritunce {

	public static void main(String[] args) {

		Stundent s1 = new Stundent();
		s1.breath();
		s1.eat();
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.breath();
		t1.eat();
		t1.teac();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
