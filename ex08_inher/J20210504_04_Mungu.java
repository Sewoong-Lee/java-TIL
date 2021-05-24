package ex08_inher;

import java.util.HashMap;
import java.util.Map;

//부모 클래스
class Thing{
	
}

//노트클래스 (자식)
class Note extends Thing{

	@Override
	public String toString() {
		return "노트";
	}
	
}

//펜 클래스 (자식)
class Pen extends Thing{
	@Override
	public String toString() {
		return "펜";
	}
	
}

//입고 클래스
class Enter {
	//int b;
	//재고 저장용 맵
	Map<String, Integer> m1 = new HashMap<>();
	//입고 메소드
	void ibgo(Thing t, int qty) { 
		System.out.println(t.toString() +" 상품 "+ qty +" 개 입고");
		//System.out.println("현재고" + m1.get(t.toString()));
		Integer stq = m1.get(t.toString());  //기존 재고 조회 (맵이므로 래퍼클래스에 int는 널이 저장 안댐)
		
		if(stq==null) stq = 0;  //재고가 없을경우 초기화
		
		m1.put(t.toString(), stq + qty);  //기존 재고랑 입고 재고랑 합침
		//b += qty;
	}
	//현재고 출력
	void jego (Thing t){
		System.out.println(t.toString() +" 총 재고 "+m1.get(t.toString()));  //투스트링의 노트, 펜을 키로 줌
	}
	
}



public class J20210504_04_Mungu {

	public static void main(String[] args) {
		Note n1 = new Note();
		Pen p1 = new Pen();
		Enter e1 = new Enter();
		
		e1.ibgo(new Note(), 10);  //이렇게 바로도 댐
		e1.ibgo(p1, 10);
		e1.ibgo(p1, 10);
		
		e1.jego(p1);
		e1.jego(n1);
		//System.out.println(e1.b);  //총 입고 수량 내가한거

		
	}

}
