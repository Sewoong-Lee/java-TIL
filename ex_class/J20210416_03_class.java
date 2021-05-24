package ex_class;


//객체를 만들어 내기 위한 틀
//클래스
class Dog{  //클레스 이름은 대문자로
	//속성 : 필드 : 자동 초기화가 일어난다.
	String type = "강아지";
	String name = "멍멍이";
	int legs = 4;
	int cnt; //걸음수 저장  //초기화를 안해도 자동 0으로 초기화
	//기능 : 메서드
	void walking() {//()괄호 반드시
		cnt++;
		System.out.println(name + " 걷는다");
	}
	void eating() {
		String food ="사료";  //food는 변수  : 메서드 안에서 쓰는건 지역변수
		System.out.println(food+"먹는다");
	}
	
}
public class J20210416_03_class {  //public접근제한자 : public클레스의 이름과 파일 이름은 반드시 동일
									//public : 누구든지 접근 가능

	public static void main(String[] args) {
		Dog d1 = new Dog();  //d1이라는 객체 생성
		System.out.println(d1.type);
		System.out.println(d1.legs);
		d1.walking();
		System.out.println(d1.cnt);
		d1.eating();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
