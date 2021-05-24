package ex10_interface;
//휴대폰 인터페이스 생성
//전화
interface Call{
	void coll();
}

//사진
interface Photo{
	void photo();
}


//메모
interface Memo{
	void memo();
}

//내핸드폰 : 전화, 사진찍기
class Phon implements Call, Photo{

	@Override
	public void photo() {
		System.out.println("찰칵");
		
	}

	@Override
	public void coll() {
		System.out.println("따르릉");
		
	}
	
	
}

//내핸드폰 : 전화, 사진찍기, 메모
class NewPhon implements Call, Photo, Memo{

	@Override
	public void memo() {
		System.out.println("메모 완료");
		
	}

	@Override
	public void photo() {
		System.out.println("찰칵");
	}

	@Override
	public void coll() {
		System.out.println("따르릉~");
		
	}
	
}

//폰 테스트 클래스
class phontest {
	void colltest(Call a) {
		a.coll();
	}
	void phototest(Photo a) {
		a.photo();
	}
	void memotest(Memo a) {
		a.memo();
	}
}


public class J20210504_07_Phon {
	public static void main(String[] args) {
		Call p1 = new Phon();
		p1.coll();
		Photo p2 = new Phon();
		p2.photo();
		
		Call np1 = new NewPhon();
		np1.coll();
		Photo np2 = new NewPhon();
		np2.photo();
		Memo np3 = new NewPhon();
		np3.memo();
		
		Phon p3 = new Phon();
		NewPhon np4 = new NewPhon();
		phontest t1 = new phontest();
		t1.colltest(p3);
		t1.phototest(p3);
		
		t1.colltest(np4);
		t1.phototest(np4);
		t1.memotest(np4);
		
		//와일문으로 어떤 기능을 쓰시겠습니다? (폰마다)
		
		

	}

}
