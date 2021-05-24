package ex_class;
//회원 클래스
//필드 : 아이디 비밀번호(String) 출생연도(int), 키(double) 모든 필드 프라이빗
class Member{
	//은닉화 : private
	private String id;
	private String pw;  //세팅전용 : 읽기 불가 (비밀번호니까) 게터를 날리면 됨
	private int ye;
	private double k;
	
	//생성자 : 객체가 생성될때 딱 한번 실행되는 메소드
	//반드시 객체가 생성될때 생성자가 실행되어야 한다.
	//클래스의 이름과 같다.
	//반환형이 없다.
	
	//기본 생성자 : Memaber(){}; 기본생성자를 이요하여 객체 생성 (생성자를 따로 만들지 않으면)
	//만약 생성자가 없으면 컴파일러가 기본생성자를 생성
	//만약 생성자를 만들면 컴파일러가 기본생성자를 생성하지 않는다.
	//생성자의 오버로딩 (매개변수의 개수나 형이 다를경우 중복 생성 가능)
	Member(String id, String pw, int ye, double k){ //필드를 그대로 적음
		this.id = id;  //아래에 객체를 생성할때 값을 받아 필드에 넘겨주는 역할
		this.pw = pw;
		this.ye = ye;
		this.k = k;
	}
	
	
	//세터
	void setId(String id) {
		this.id = id;
	}
	void setPw(String pw) { //얘가 없으면 비밀번호 못바꿈
		this.pw = pw;
	}
	void setYe(int ye) {
		this.ye = ye;
	}
	void setk(double k) {
		this.k = k;
	}
	
	String getId() {
		 return id;
	}
	String getPw() {
		 return pw.substring(0, 2) + "**";   //비밀번호 잘라서 보내기.
	}
	int getYe() {
		 return ye;
	}
	double getK() {
		 return k;
	}
	
	
}
public class J20210419_05_member {

	public static void main(String[] args) {
		Member m1 = new Member("stpn","1234",920416,150.5); //여기에 생성자의 값을 넣어줌 : 객체 생성
		m1.setId("stpn"); //얘네를 할 필요가 없음
		m1.setPw("1234");
		m1.setYe(920416);
		m1.setk(150.5);
		
		System.out.println(m1.getId() + " " + m1.getPw());
		System.out.println(m1.getYe() + " " + m1.getK());
		
//		System.out.println("0123456".substring(3));  //문자열 잘라서 출력하기
//		System.out.println("0123456".subSequence(0, 3)); //문자열 잘라서 출력하기
		
		Member m2 = new Member("sㅂㅂㅂㅂn","1211",1111,180.5); 
		System.out.println(m2.getId() + " " + m2.getPw());
		System.out.println(m2.getYe() + " " + m2.getK());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

