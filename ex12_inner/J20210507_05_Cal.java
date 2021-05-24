package ex12_inner;

interface Cal{
	int add (int a ,int b);
	int sub (int a ,int b);
}

interface Cal2{
	int add (int a ,int b);
}



public class J20210507_05_Cal {

	public static void main(String[] args) {
		Cal c1 = new Cal() {
			
			@Override
			public int sub(int a, int b) {
				return a-b;
			}
			
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		System.out.println("더하기 "+c1.add(15, 10));
		System.out.println("빼기 "+c1.sub(15, 10));
		

		//람다식
		//한개의 추상메소드만 가지고 있어야 한다 (함수적 인터페이스)
		Cal2 c2 = (a,b)->a+b;
		System.out.println(c2.add(20, 50));

		

	}

}
