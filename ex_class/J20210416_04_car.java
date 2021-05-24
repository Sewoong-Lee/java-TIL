package ex_class;

//자동차 클래스
//속성 : name, color, power, speed
//기능 : powerToffle, speedUp, speedDown
class Car{
	String name = "남보르기니";
	String color = "Gold";
	boolean power;
	int speed;
	
	void powerToffle(){
		power = !power;
	}
	void speedUp(){  //100 초과 불가 기능 추가
		if (speed<100) {
			speed++;
		}
	}
	void speedDown(){//50 미만 불가 기능 추가
		if (speed>50) {
			speed--;
		}
//		System.out.println(speed + " 속도 증가");
	}
	
}

public class J20210416_04_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1.name);
		System.out.println(c1.color);
		c1.powerToffle();
		System.out.println(c1.power);
		System.out.println(c1.speed);
		for(int i=0;i<300;i++) {
			c1.speedUp();
		}
		System.out.println(c1.speed);
		for(int i=0;i<100;i++) {
			c1.speedDown();
		}
		System.out.println(c1.speed);
		
		
		
		
		

	}

}
