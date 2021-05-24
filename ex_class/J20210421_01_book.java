package ex_class;

import java.util.Arrays;

//책 클래스
//필드 : 책 코드(String), 책이름(String), 가격(int), 할인률(double)
//생성자, 게터, 세터, 투스트링
//메소드 : 판매금액 계산(매개변수:수량, 반환값 : 판매금액)
//dto 기본 정보를 넣는것
class Book{  //필드
	private String bookcode;
	private String bookname;
	private int ch;
	private double sale;
	
	//생성자
	public Book() {}
	public Book(String bookcode, String bookname, int ch, double sale) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.ch = ch;
		this.sale = sale;
	}
	public Book(int ch, double sale) {
		this.ch = ch;
		this.sale = sale;
	}
	
	//게터
	public String getBookcode() {
		return bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public int getCh() {
		return ch;
	}
	public double getSale() {
		return sale;
	}
	
	//세터
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	
	//투스트링
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", ch=" + ch + ", sale=" + sale + "]";
	}
}

// 책 관리 클래스 
class Manager {
	//판매금액 합계 저장
	//b001:0, b002:1
	private int[] tot = new int[10];
	public int[] getTot() {
		return tot;
	}
	//메소드 : 판매금액 계산
	int cal (Book book,int q, int indxe) {  //북 클래스와 수량을 매개변수로 받음
//		System.out.println(book); //클래스 잘 나오는지 확인
//		System.out.println(q);  // 수량 잘 나오는지 확인
		String bookcode = book.getBookcode();
		int bookch = book.getCh();
		double booksale = book.getSale();
		int totp=(int)(bookch-bookch*booksale)*q; 
		
		tot[indxe] += totp ;  //판매 금액을 더함
		
		return totp;
	}
}


public class J20210421_01_book {
	public static void main(String[] args) {
		Book[] barr = new Book[10];
		barr[0] = new Book();
//		Book b1 = new Book();
		barr[0].setBookcode("b001");
		barr[0].setBookname("빠끄");
		barr[0].setCh(13000);
		barr[0].setSale(0.2);
		
//		Book b2 = new Book("b002","무야호",27000,0.3);  // 배열 1번에 넣음
		barr[1] = new Book("b002","무야호",27000,0.3);

		
		Manager m1 = new Manager();
		System.out.println("책코드  책명      판매금액");
		System.out.printf("%-10s %-10s %-10s\n",barr[0].getBookcode(),barr[0].getBookname(),+m1.cal(barr[0], 3,0));  //- 하면 왼쪽 정렬
		System.out.println(barr[0].getBookcode()+barr[0].getBookname()+" 판매금액: "+m1.cal(barr[0], 30,0));
		System.out.println(barr[0].getBookcode()+barr[0].getBookname()+" 판매금액: "+m1.cal(barr[0], 10,0));
		
		System.out.println(barr[1].getBookcode()+barr[1].getBookname()+" 판매금액: "+m1.cal(barr[1], 5, 1));
		System.out.println(barr[1].getBookcode()+barr[1].getBookname()+" 판매금액: "+m1.cal(barr[1], 3, 1));
		
		System.out.println(Arrays.toString(m1.getTot()));  // 총 판매액 출력
		
		
		
		
		
		
		


	}

}
