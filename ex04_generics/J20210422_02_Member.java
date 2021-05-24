package ex04_generics;

//맴버 클래스
//필드 : 아이디 패스워드
class Member{
	private String id;
	private String pw;
	
	
	public Member() {}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
}


//Vip 클래스 만들기
// 필드 : 아이디, 비밀번호, 할인률(rate) 
class Vip{
	private String id;
	private String pw;
	private double rate;
	
	public Vip() {}
	public Vip(String id, String pw, double rate) {
		super();
		this.id = id;
		this.pw = pw;
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public double getRate() {
		return rate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Vip [id=" + id + ", pw=" + pw + ", rate=" + rate + "]";
	}
}
//로그인 관리 클래스
class Login<T>{  //제네릭으로 형을 지정하지 않고 클래스를 넘김
	//입장
	void loginm(T m) {  //상속을 아직 안배워서 이렇게 강제로 변환하여 출력
		System.out.println(m);  //확인용 클래스 출력
		if (m instanceof Member) {
			System.out.println(((Member) m).getId()+"입장");
		}else if(m instanceof Vip) {
			System.out.println(((Vip) m).getId()+"입장");
	}
	
	
	
//	void loginv(Vip v1) {  //제네릭이 없으면 이렇게 따로 만들어야함
//		System.out.println(v1.getId()+"입장");
//	}
	}
}




public class J20210422_02_Member {
	public static void main(String[] args) {
		Member m1 = new Member("ㅋㅋㅋ","1111");
		System.out.println(m1);
		
		Vip v1 = new Vip("ㅂㅂㅂ","2222", 0.1);
		System.out.println(v1);
		
		Login <Member>l1 = new Login<>();
		l1.loginm(m1);

		Login <Vip>l2 = new Login<>();
		l2.loginm(v1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
