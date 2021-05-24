package ex09_abstract;
//부모 클래스
//교육
//abstract : 추상 메소드를 한개라도 가지고 있으면 추상클래스로 만들어야한다. new Education; 만들수가 없다. (자식클래스는 무조건 구현부가 있어야함)
abstract class Education{  //여기도 붙음
	static String name = "교육청";
	
	//구현부 {} 가 없는 추상 메소드
	//자식이 반드시 구현부 작성 (또는 자식까지 추상으로 만들어야함)
	abstract void schoolname();
}
//초등학교
class Elementary extends Education{
	@Override
	void schoolname() {
		System.out.println("초초등학교");
	}
}
//중학교
class Middle extends Education{
	@Override
	void schoolname() {
		System.out.println("중중학교");
	}
}
//고등학교
class High extends Education{
	@Override
	void schoolname() {
		System.out.println("고고등학교");
	}
}
//이력
class EduInfo {
	//출신 학교 출력
	void schoolnameprint(Education a) {
//		//다운캐스팅 방법 (부모에 스쿨네임이 없을때의 방법) (오버라이딩 안되어있을때)
//		if (a instanceof High)  //instanceof : a가 하이에 속해있다면~
//			((High)a).schoolname();
//		else if (a instanceof Middle)
//			((Middle)a).schoolname();
//		else if (a instanceof Elementary)
//			((Elementary)a).schoolname();
		
		//다형성을 이용해서 출력
		//실제 출력은 자식 클래스
		a.schoolname(); 
		
	}
}




public class J20210504_05_abstract {
	public static void main(String[] args) {
		Elementary e1 = new Elementary();
		Middle m1 = new Middle();
		High h1 = new High();
		EduInfo f1 = new EduInfo();
		
		f1.schoolnameprint(e1);
		f1.schoolnameprint(m1);
		f1.schoolnameprint(h1);
		
		
		
		
		
		
		

	}

}
