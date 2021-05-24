package ex_class;



public class J20210420_04_main {
	public static void main(String[] args) {
		
//		System.out.println(args.length);
//		for(String s:args) {
//			System.out.println(s);
//		}
		
		//실습) 아이디와 패스워드를 아규먼트로 받아서 
		// 만약 아이디가 java이고 pw가 1111이면 관리자모드 아니면 일반 모드 출력
		if (args.length>1 && args[0].equals("java") &&args[1].equals("1111")) {
			System.out.println("관리자");
		}else {
			System.out.println("일반");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
