package ex08_inher;
//자동차
class MyCar{
	static final String name = "좋은차";
}
//타이어
class Tire extends MyCar{
	private String company; //회사 이름

	public Tire(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "타이어 [회사 =" + company + "]";
	}
}
//백미러
class Mirror extends MyCar{
	private String company; //회사 이름

	public Mirror(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "백미러 [회사 =" + company + "]";
	}
}

//수리업체 클래스
class Repair {
	//부품을 체인지 해주는 메소드
	//다형성을 이용
	//하나만 만들어도 여러 메소드를 매개변수로 받을수 있게
	void changePart(MyCar t) {  //부모형을 매개변수로 두면 자식형 모두 처리 가능
		System.out.println(t + " 교체 완료");
	}
//	void changePart(Mirror m) {// 이렇게 하나하나 만들면 끝이 없음
//		System.out.println(m + " 교체 완료");
//	}
	
}



public class J20210504_02_Car {

	public static void main(String[] args) {
		System.out.println(MyCar.name);
		
		Tire t1 = new Tire("타이어회사");
		//System.out.println(t1); //투스트링으로 출력
		
		Mirror m1 = new Mirror("거울회사");
		//System.out.println(m1);
		
		Repair r1 = new Repair();
		r1.changePart(t1);
		r1.changePart(m1);

	}

}
