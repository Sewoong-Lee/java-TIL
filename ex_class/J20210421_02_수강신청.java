package ex_class;

import java.text.SimpleDateFormat;
import java.util.Date;

//학생 클래스
//필드 : 수강코드, 이름, 수강과목(자바)
class Attendee{
	private String cod;
	private String name;
	private String ban;
	
	public Attendee() {}
	public Attendee(String cod, String name, String ga) {
		super();
		this.cod = cod;
		this.name = name;
		this.ban = ga;
	}
	public String getCod() {
		return cod;
	}
	public String getName() {
		return name;
	}
	public String getban() {
		return ban;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGa(String ga) {
		this.ban = ga;
	}
	@Override
	public String toString() {
		return "Attendee [cod=" + cod + ", name=" + name + ", ga=" + ban + "]";
	}
}

// 수강 클래스 : LecturManager
// 메소드 : 입실관리, 퇴실관리 (출력만)
class LecturManager{
	//클래스 필드, 클래스 변수
	//클래스가 메모리에 로딩될때 생성 ,프로그램이 종료할때까지 사라지지 않음, 종료시 소멸
	//static final : 상수, 바꿀수 없다, 반드시 선언과 동시에 초기화
	static final String collegekNname = "국제 학원";  //static final => 상수로 바뀜, 바꿀수가 없음
	//인스턴스 필드, 객체변수
	//인스턴수(객체)생성시 생성, 객체 소멸시 소멸
	static int buildYear = 2011;
//	int year = 21;
	//int day;
	static final int day; //1)  아래 스테틱 블럭을 이용하여 초기화하여 당장의 초기화는 불필요
	static {  // static 중괄호를0 이용하여 변수를 초기화
		Date now=new Date(); //2)  //db에서 가져 오거나 파일에서 가져와 설정 가능.
		SimpleDateFormat sf = new SimpleDateFormat("dd");
		day = Integer.parseInt(sf.format(now));
	}
	static void ib(Attendee att) {  //클래스 형 자체를 넘겨 받음  //메소드에도 스테틱 생성 가능
		//this.day;  //메소드를 스테틱으로 쓰려면 필드도 변수여야한다. (객체 생성전에 스테틱이 생성 -> 이후 생성의 필드 = 같이 쓸수가 없다.)
		//LecturManager.day=day; //1번 데이를 스테틱 으로 변환 후 이렇게 생성(미리 생성, 이후 생성을 나눠서 생성.)
		System.out.println(day+att.getban()+"반 "+att.getName()+"님이 입실하셨습니다.");  //클래스 변수의 값을 가져와서 넣음
	}
	static void exit(Attendee att, int day) {
		System.out.println(att.getban()+"반 "+att.getName()+"님이 퇴실하셨습니다.");
	}
}

public class J20210421_02_수강신청 {
	public static void main(String[] args) {
		System.out.println(LecturManager.collegekNname);  //스테틱 선언하면 클래스로 접근 가능  //클레스 필드 : 스테틱 필드
		
		Attendee attd1 = new Attendee("a001","홍씨","자바");
		System.out.println(attd1); 
		
		LecturManager ma = new LecturManager();
		System.out.println(ma.collegekNname);   //스테틱이 없을때는 클레스를 선언하고 불러올 수 있음
		System.out.println(ma.buildYear);  //스테틱이 없을때는 선언해야만 호출 가능  //인스턴스 필드
//		ma.ib(attd1);  //클래스 변수의 값을 통째로 넘김
//		ma.exit(attd1);
//		
//		LecturManager.ib(attd1);  //스테틱으로 변환하여 출력
//		LecturManager.exit(attd1);
		
		

	}

}
