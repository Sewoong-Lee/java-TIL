package ex13_thread;
//스레드 만들기 2

class Thread5 implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println("스레드 오번 : "+i);
		}
	}
}


public class J20210507_02_Runnable {

	public static void main(String[] args) {
		Thread5 t5 = new Thread5(); //실행 구현 (런을 먼저 만들고)
		Thread th = new Thread(t5); //스레드 생성 (만든 런을 스레드에 전달)
		//th.start();  //스레드 시작
		
		//익명 클래스
//		Runnable r1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i=0; i<10;i++) {
//					System.out.println("익명 스레드 : "+i);
//				}
//				
//			}
//		};
//		Thread th2 = new Thread(r1);
//		th2.start();
		
		//익명스레드2 (단축)
		Thread th3 = new Thread (new Runnable() {  //인터페이스를 스레드 생성 괄호안에서 만들어버림
			
			@Override
			public void run() {
				for (int i=0; i<30;i++) {
					System.out.println("익명 스레드2 : "+i);
				}
				
			}
		});
		//스레드 우선순위 : 1~10 (기본값 5)
		th3.setPriority(10);
		th3.start();
		
		
		//익명스레드2 (실습)
		Thread th4 = new Thread (new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<30;i++) {
					System.out.println("슈퍼 익명 스레드2 : "+i);
				}
				
			}
		});
		//스레드 우선순위 : 1~10 (기본값 5)
		th4.setPriority(1);  //우선순위 정하기 (우선순위가 클수록 높음)
		th4.start();
		
		
		
		//메인 포문 (비교용)
		for (int i=0; i<10;i++) {
			System.out.println("메인 : "+i);
		}
		
	}

}
