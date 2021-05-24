package ex_class;

//핸드폰 케이스
//필드 : 폰네임, 용량, 화소
//생성자, 게터, 세터, 투스트링

class Phon{
	private String name;
	private int capacity;
	private int pixel;
	

	public Phon() {}  //기본생성자도 필수
	
	public Phon(String name, int capacity) {
		
		this.name = name;
		this.capacity = capacity;
	}
	public Phon(String name) {
		super();
		this.name = name;
	}
	Phon(String name, int capacity, int pixel) {
		 //나 자신의 생성자를 호출  //나 자신 호출은 반드시 첫줄
		this(name,capacity); 
		this.pixel = pixel;
	}

	String getName() {
		return name;
	}
	int getCapacity() {
		return capacity;
	}
	int getPixel() {
		return pixel;
	}
	void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	void setName(String name) {
		this.name = name;
	}

	void setPixel(int pixel) {
		this.pixel = pixel;
	}

	@Override
	public String toString() {
		return "Phon [이름=" + name + ", 용량=" + capacity + ", 화소=" + pixel + "]";
	}
	
	
}


public class J20210420_02_phon {
	public static void main(String[] args) {
		Phon p1 = new Phon("애니콜",512,1200);
		System.out.println(p1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
