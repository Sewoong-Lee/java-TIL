package ex_class;

//원 클래스

class Area{
	private double ban;
	private double one;
	
	// 생성자
	public Area() {
		super();
	}
	public Area(int ban) {
		this.ban = ban;
		add(ban);
	}
	public Area(double ban) {
		this.ban = ban;
		add(ban);  //생성자에서 메소드 실행
	}
	public Area(int ban, double one) {
		this.ban = ban;
		this.one = one;
		add(ban,one);
	}
	public Area(double ban, double one) {
		this.ban = ban;
		this.one = one;
		add(ban,one);
	}
	
	public double getBan() {
		return ban;
	}
	public double getOne() {
		return one;
	}
	
	public void setBan(double ban) {
		this.ban = ban;
	}
	public void setOne(double one) {
		this.one = one;
	}
	
	@Override
	public String toString() {
		return "area [ban=" + ban + ", one=" + one + "]";
	}
	//메소드 : 원의 넓이를 구하는
	double add(int a) {  //반지름만
		one=a*a*3.14;
		return one;
	}
	double add(double a) {
		one = a*a*3.14;
		return one;
	}
	double add(int a,double b) {  //원주율 추가
		one = a*a*b;
		return one;
	}
	double add(double a,double b) {
		one = a*a*b;
		return one;
	}
	
	
	
}







public class J20210420_05_overloding2 {
	public static void main(String[] args) {
		Area ar = new Area(5.5);
		System.out.println(ar);
		
		
		System.out.println(ar.add(5));
	
		System.out.println(ar.add(3.3, 5.5));
		
		Area ar4 = new Area(9,3.14);
		System.out.println(ar4);
		
//		System.out.println(ar.add(30));  //정수 반지름 한개
//		System.out.println(ar.add(60.2));  //실수 반지름 한개
//		
//		System.out.println(ar.add(30, 3.14));  // 정수 반지름, 원주율
//		System.out.println(ar.add(62.3, 3.14));  // 실수 반지름, 원주율
		
		
		
		
		
		
		
		
		

	}

}
