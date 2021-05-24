package ex13_thread;
//프로그램 : 소스를 컴파일해서 실행코드로 변환된 파일
//프로세스 : 실행파일이 cpu에 의해서 실행되어 메모리에 올라간 상태
//스레드 : 프로세스내에서 실행되는 세부 실행 단위
//멀티 스레드 : 하나의 프로세스 내에서 여러개의 스레드가 병행처리
//자바가 멀티 스레드로 동작 (메인이 하나라는 스레드)
//스레드 스케쥴링
//JVM의 스레드 스케줄러가 각 스레드에게 CPU를 할당하여 실행


//스레드 만들기
class Thrasd1 extends Thread {  //오버라이드 런
	// 부모의 런을 재정의 (추상메소드가 아님)
	@Override
	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println("Thrasd1 : "+i);
		}
	}	
}

class Thrasd2 extends Thread {  //오버라이드 런

	@Override
	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println("두번째 스레드 : "+i);
		}
	}	
}


class Thrasd3 extends Thread {  //오버라이드 런
	//실행하고 싶은 작업 구현 (런으로)
	@Override
	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println("세번쨰 스레드 : "+i);
		}
	}	
}



public class J20210507_01_thread {

	public static void main(String[] args) {
		//스레드 객체 생성 (메인에서 다른 스레드를 실행시켜줘야함)
		Thrasd1 t1 = new Thrasd1();
		t1.start(); //스레드를 실행
		
		Thrasd2 t2 = new Thrasd2();
		t2.start(); //스레드를 실행
		
		Thrasd3 t3 = new Thrasd3();
		t3.start(); //스레드를 실행
		
		
		for (int i=0; i<10;i++) {
			System.out.println("main : "+i);
		}
		
		
		
		
		
		
		
		
		
	}

}
