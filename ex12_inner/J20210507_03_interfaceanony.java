package ex12_inner;

//인터페이스 객체 생성 안됨
interface School {
	void nameprint();
}

//class HighShool implements School{  //얘 만들지말구
//
//	@Override
//	public void nameprint() {
//		System.out.println("학교");
//		
//	}
//	
//}






public class J20210507_03_interfaceanony {
	public static void main(String[] args) {
		//HighShool h1 = new HighShool();
		//h1.nameprint();
		
		//익명 클래스 생성
		//스쿨 인터페이스의 상속을 받은 객체 생성
		School h2 = new School() {
			@Override
			public void nameprint() {
				System.out.println("학교");
			}
		};
		h2.nameprint();

	}

}
