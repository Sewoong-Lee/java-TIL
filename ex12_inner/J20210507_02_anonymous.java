package ex12_inner;
//익명 클래스
class Dog {
	void walking() {
		System.out.println("걷다");
	}
}
//class HuntDog extends Dog{  //한번만 쓸거면 얘를 안만들어도댐
//	void walking() {
//		System.out.println("못걷다");
//	}
//}





public class J20210507_02_anonymous {

	public static void main(String[] args) {
//		HuntDog h1 = new HuntDog();
//		h1.walking();
		
		//익명 클래스 : 부모의 클래스로 재정의 해서 생성
		//1회성으로 쓸려고 할때
		Dog h2 = new Dog() {  //일회성 
			@Override
			void walking() {
				System.out.println("못걷다");
			}
//			void eat() {  //부모형에 없어서 실행할 방법이 없음 (오버라이딩만)
//				System.out.println("먹다");
//			}
		};
		h2.walking();
		
		
		
		
		
	}

}
