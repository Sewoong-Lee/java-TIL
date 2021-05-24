package ex_class;
//결과값이 저장되는 계산기
class NewCal{  //같은 패키지 안에서는 중복되는 이름의 클래스 생성 불가.
	//필드 : maker, result(결과값)
	String maker = "새로운계산기"; 
	double result;
	//메소드 : 결과값에 더하는 기능
	//오버로딩 : 메소드의 이름은 같고 매개변수의 갯수나 형이 다른경우 중복 가능
	void add(double a) {
		result += a; 
	}
	double add (double a,double b) { //오버로딩
		return a+a; 
	}
	void add(int a) {  //오버로딩
		result += a; 
	}
	
	
	void bbe(double a) {
		result -= a; 
	}
	void gob(double a) {
		result *= a; 
	}
	void nanu(double a) {
		result /= a; 
	}	
	
}





public class J20210419_02_new_cal {

	public static void main(String[] args) {
		NewCal c1 = new NewCal();
//		c1.add(20);
//		System.out.println(c1.result);
//		c1.bbe(5);
//		System.out.println(c1.result);
//		c1.gob(2);
//		System.out.println(c1.result);
//		c1.nanu(2);
//		System.out.println(c1.result);
		
		System.out.println(c1.add(20, 10));
		c1.add(20);

		
		
		
	}

}
