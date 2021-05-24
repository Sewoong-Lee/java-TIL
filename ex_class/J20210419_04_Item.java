package ex_class;
//상품 클래스 (item)
// 필드 : itemcoge(코드), itemname(이름), price(단가)
// 메소드 : 
//1) 판매금액 계산 : 매개변수 수량(판매 수량), 리턴값(판매 금액)

class Item{
	private String itemcode;  //private 접근제한자 : 클래스 내부에서만 접근 가능 :은닉화 :메인에서 접근 불가
	private String itemname;  //private 접근제한자
	int price;
	int sum;
	
	int amount (int a) {
		return price*a;
	}
	//메소드를 이용해서 접근
	//세터 : 리턴값이 없다. (set를 쓰기로 약속)
	//this는 객체 자신, 필드를 콕 집음
	void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	void setItemname(String itemname) {
		this.itemname = itemname;
	}
	void setPrice(int price) {
		this.price = price;
	}
	//세터 값을 읽는 메소드
	//getter
	String getItemcode() {  //매개변수 없음
		return itemcode;
	}
	String getItemname() {  
		return itemname;
	}
	int getprice() {  
		return price;
	}
	
	
}

public class J20210419_04_Item {
	public static void main(String[] args) {
		Item cc = new Item();
		cc.setItemcode("8801");
		cc.setItemname("사이다");
		cc.setPrice(220);
		System.out.println(cc.getItemname() + " 총 판매가 " + cc.amount(20));
		System.out.println(cc.getItemcode() +"  "+ cc.getprice());

		
		Item item2 = new Item();  //하드코딩을 하지않고 값을 넣을 수 있다.
		item2.setItemcode("8809");
		item2.setItemname("꽈자");
		item2.setPrice(440);
		System.out.println(item2.getItemname() + " 총 판매가 " + item2.amount(20));
		System.out.println(item2.getItemcode() +"  "+ item2.getprice());
		
		
		
		
	}

}
