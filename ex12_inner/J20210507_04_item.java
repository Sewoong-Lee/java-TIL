package ex12_inner;

interface Item{
	void namePrint(String s);
}

class print implements Item{

	@Override
	public void namePrint(String s) {
		System.out.println(s);
		
	}
	
}


public class J20210507_04_item {

	public static void main(String[] args) {
		//일반 생성
		print p1 = new print();
		p1.namePrint("캬캬캬캬컄");
		
		//익명 클래스
		Item i1 = new Item() {
			
			@Override
			public void namePrint(String s) {
				System.out.println("익명 : "+s);
				
			}
		};
		
		i1.namePrint("하하하하하하하");
		
		//두번째
		Item i2 = new Item() {
			
			@Override
			public void namePrint(String s) {
				System.out.println("익명 : "+s);
				
			}
		};
		
		i2.namePrint("ㅋㅋㅋㅋㅋㅋ");
		i2.namePrint("ㅂㅂㅂㅂㅂㅂ");
		

	}

}
