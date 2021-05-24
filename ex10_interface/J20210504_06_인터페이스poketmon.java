package ex10_interface;
//자바의 단점 : 다중 상속의 불가.
//클래스는 다중상속 불가

//인터페이스 : 구현부가 없다., 다중상속 가능, 객체 생성 불가(전체 추상)
interface Attack{
	//필드도 생성 가능 : 일반필드는 무용지물
	String name = "포켓몬의 공격"; //필드를 만들경우 스테틱 파이널,퍼블릭이 생략되어있다.
	void attack(); //public abstract 생략 가능
	
	//default 일반 메소드 생성 가능
	default void gameTime() {  //default를 앞에 쓰면 얘는 추상 메소드가 아니다란 말
		System.out.println("24시간 공격가능");
	}
}

interface Sound{
	String name = "포켓몬의 소리";
	void Sound(); //abstract 생략 가능
}
//피카
class Pika implements Attack, Sound {

	@Override
	public void attack() {  //인터페이스 사용시 퍼블릭으로 부모보다 범위가 더 커야함
		System.out.println("전기 공격");
		
	}

	@Override
	public void Sound() {
		System.out.println("파카 피카");
		
	}  
}
//꼬북
class Ggobu implements Attack, Sound{

	@Override
	public void attack() {
		System.out.println("물 공격");
		
	}

	@Override
	public void Sound() {
		System.out.println("꼬북꼬북");
		
	}
	
}

class GamePlay{
	void att(Attack a) {
		a.attack();
	}
	void sou(Sound a) {
		a.Sound();
	}
	
}

public class J20210504_06_인터페이스poketmon {
	public static void main(String[] args) {
		//다형성을 이용한 선언
		System.out.println(Attack.name);
		Attack p1 = new Pika();
		p1.attack();
		p1.gameTime();
		
		Sound p2 = new Pika();
		p2.Sound();
		
		Sound g1 = new Ggobu();
		g1.Sound();
		
		Attack g2 = new Ggobu();
		g2.attack();
		
		Ggobu g3 = new Ggobu();
		g3.attack();
		g3.Sound();
		g3.gameTime();
		
		GamePlay c1 = new GamePlay();
		c1.att(p1);
		c1.att(g3);
		c1.sou(p2);
		c1.sou(g3);
		
		
		
		
		
		
		
	}

}
