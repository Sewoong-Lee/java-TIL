package ex12_inner;
// 내부 클래스
class OuterClass{
	class InnerClass{
		public String toString() {
			return "인스턴스클래스";
		}
	}
	InnerClass inner = new InnerClass();  //필드
	void method1() {
		InnerClass local = new InnerClass();  //변수
		System.out.println(local);
	}
	
	class InnerClassNew {
		public String toString() {
			return "뉴인스턴스클래스";
		}
	}
	
	
}


public class J20210507_01_inner {

	public static void main(String[] args) {
		OuterClass o1 = new OuterClass();
		System.out.println(o1.inner);
		o1.method1();
		
		//뉴이너클래스 생성
		OuterClass.InnerClassNew no1 = o1.new InnerClassNew();
		System.out.println(no1);
		
		
		
	}

}
