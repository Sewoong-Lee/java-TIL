package ex13_thread;


public class J20210507_03_sleep {

	public static void main(String[] args) throws InterruptedException {
		//스레드로 속도 제어
//		for (int i =1;i<6;i++) {
//			Thread.sleep(1000);
//			System.out.println(i);
//		}
		
		Thread t1 = new Thread (new Runnable() {
			
			@Override
			public void run() {
				for (int i =5;i>0;i--) {
					try {
						//슬립 : 우선순위가 낮은 스레드가 기아상태에 빠지는 것을 방지
						Thread.sleep(1000); //속도 제어
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				
			}
		});
		t1.start();
		
		System.out.println("메인 스레드 종료");
	}

}
