package ex_class;

public class J20210421_03_계산기 {
	static final String name = "로아 계산기";
	private int result;
	private boolean light;
	//두수를 매개변수로 받아서 합을 리턴하는 메소드
	//static 메소드 안에서는 static필드만 사용 가능
	static int cal(int a, int b) {
		return a+b;
	}
	int add(int a) {
		this.result +=a;
		return result;
	}
	//라이트 켜기,끄기
	void lightonoff() {
		light = !light;
	}
	public int getResult() {
		return result;
	}
	
	public static void main(String[] args) {
		//J20210421_03_계산기 cal = new J20210421_03_계산기();  //이거 안할거면 스테틱
		//System.out.println(cal.cal(30, 20));
		System.out.println(J20210421_03_계산기.cal(30, 20));
		System.out.println(J20210421_03_계산기.cal(20, 20));
		
		J20210421_03_계산기 cal = new J20210421_03_계산기(); 
		cal.lightonoff();
		cal.lightonoff();
		cal.lightonoff();
		System.out.println(cal.light);
		cal.add(20);
		cal.add(20);
		System.out.println(cal.add(20));
		System.out.println(cal.getResult());
		
	}

}
