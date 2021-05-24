package ex08_inher;

//포켓몬 : 추상클래스 , 이걸 먼저 하면 자식클래스는 자동적으로 메소드를 뭘 만들어야할지 실수가 없음
abstract class Poketmon{
	//일반 메소드와 추상 메소드 모두 사용 가능
	void gnameName() {
		System.out.println("포켓몬게임"); //추상 이외의 클래스도 가질수 있다.
	}
	abstract void att();
	abstract void sound();
}

//피카츄
class Pikachu extends Poketmon{
	void att() {
		System.out.println("백만볼트");
	}
	void sound() {
		System.out.println("피카피카");
	}
}
//꼬부기
class Ggobugi extends Poketmon{
	void att() {
		System.out.println("물대포");
	}
	void sound() {
		System.out.println("꼬북꼬북");
	}
}

//공격클래스
class GamePlay {
	void att(Poketmon p) {
		p.gnameName(); //어택 실행전 부모 메소드 실행
		p.att();
	}
	void sound(Poketmon p) {
		p.sound();
	}
}



public class J20210504_05_poketmon {

	public static void main(String[] args) {
		Pikachu p1 = new Pikachu();
		Ggobugi g1 = new Ggobugi();
		GamePlay c = new GamePlay();
		
		System.out.println("피카츄");
		c.att(p1);
		c.sound(p1);
		c.att(new Pikachu());
		
		System.out.println("꼬부기");
		c.att(g1);
		c.sound(g1);
		

	}

}
