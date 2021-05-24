package ex08_inher;
//부모 클래스
class ani{
	
}
//토끼
class Rabbit extends ani{
	String name;
	
	public Rabbit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rabbit [name=" + name + "]";
	}
	
	
}
//사자
class Lion extends ani{
	@Override  //투스트링만 있어도댐
	public String toString() {
		return "사자";
	}
	
}

class AnimalCare{
	//먹이 주기 메소드
	void eating(ani a) {
		System.out.println(a + " 를 목욕시킴");
	}
	
	//목욕 시키기 메소드
	void washing(ani a) {
		System.out.println(a + " 를 목욕시킴");
	}
	
}

public class J20210504_03_Animal {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("토끼");
		Lion l1 = new Lion();  //투스트링만 있음
		AnimalCare a1 = new AnimalCare();
		a1.eating(r1);
		a1.eating(l1);
		a1.washing(r1);
		a1.washing(l1);
	}

}
