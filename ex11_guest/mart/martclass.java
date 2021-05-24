//package ex11_guest.mart;  //선생님꺼 보면서 다시 해보자 ㅎㅎ  인터페이스파일임
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface ClothCorner {  //의류코너
//	void setClothItem(String s);
//	void getClothItem();
//}
//
//interface MeatCornet { //정육코너
//	void setMeatItem(String...s);
//	void getMeatItem();
//}
//
//interface PerocuctCornr {  //공산품코너
//	void setProductItem(String...s);
//	void getProductItem();
//	public List<String> getP1();
//	public void setP1(List<String> p1);
//}
//
//
//class HeadOffice{  //본사
//	private String name = "참좋은마트";
//	void mart () {
//		System.out.println(name);
//	}
//}
//
//class Branchl extends HeadOffice implements PerocuctCornr,MeatCornet{  //지점1
//	private String Branchlname = "1번지점";
//	private List<String> m1 = new ArrayList<String>();  //기존값 누적
//	private List<String> p1;  //리스트가 아니라 선언, 참조변수임 주소만 가져옴
//	//세터 게터
//	public List<String> getM1() {
//		return m1;
//	}
//
//	public void setM1(String...s) { //스트링으로 배열을 만든다.
//		//new ArrayList<String>(); //여기에 선언하면 새로운 객체 생성 중복값 없음
//		for(String a : s) {
//			m1.add(a);
//		}
//	}
//
//	public List<String> getP1() {
//		return p1;
//	}
//
//	public void setP1(List<String> p1) { //얘도 ...으로 받아도댐
//		this.p1 = p1;
//	}
//
//	@Override
//	public void setProductItem(String...s) {
//		System.out.println("등록 아이템");
//		for (String a : s) {
//			System.out.println(a);
//		}
//		
//	}
//
//	@Override
//	public void getProductItem() {
//		System.out.println(Branchlname+"공산품 취급 상품");
//	}
//	
//	@Override
//	public void setMeatItem(String...s) {
//		System.out.println("고기 코너 등록");
//		for (String a : s) {
//			System.out.println(a);
//		}
//	}
//
//	@Override
//	public void getMeatItem() {
//		System.out.println(Branchlname+"고기 취급 상품");
//		
//	}
//
//
//	
//}
//
////class Branchl2 extends HeadOffice implements PerocuctCornr,ClothCorner{  //지점2
////
////	@Override
////	public void setClothItem(String s) {
////		System.out.println("옷 아이템" + s);
////		
////	}
////
////	@Override
////	public void setProductItem(String...s) {
////		System.out.println("등록 아이템" + s);
////		
////	}
////
////	@Override
////	public void getClothItem() {
////		System.out.println("상품나왔슴다.");
////		
////	}
////
////	@Override
////	public void getProductItem() {
////		System.out.println("겟 아이템");
////		
////	}
////
////}
//
//
//public class martclass {
//	public static void main(String[] args) {
//		
//		Branchl b1 = new Branchl();
//		b1.mart();
//		b1.getMeatItem();
//		b1.setMeatItem("닭","돼지","소");
//		b1.setProductItem("공","산","품");
//		
////		Branchl2 b2 = new Branchl2();
////		b2.getClothItem();
////		
////		PerocuctCornr b3 = new Branchl2();
//		
////		b3.getProductItem();
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//}



