package ex08_inher;

class School {
	void schoolName() {
		System.out.println("좋은학교");
	}
	void info(String name) {  //형변환을 안하기 위해 에러를 막기위해 부모형에 인포 생성
	}
}

class student extends School{
	@Override //이거 붙여주면 더 정확
	void info(String name) {
		System.out.println(name + "학생");
	}
}

class tech extends School {
	@Override //이거 붙여주면 더 정확
	void info(String name) {
		System.out.println(name + "선생님");
	}
}


public class J20210504_01_Student {

	public static void main(String[] args) {
//		student s1 = new student();
//		s1.info("피카츄");
//		s1.schoolName();
//		
//		School s2 = new student();  //스쿨에는 인포가 없어서 인포 에러
//		//s2.info("피카츄");
//		s2.schoolName();
//		
//		
//		School s3 = new student();  //다운캐스팅 필요
//		((student)s3).info("피카츄"); //연산자 우선순위로 s3 괄호 필요  (s3을 먼저 스튜던트로 바꾸고)
//		s3.schoolName();
//		
//		
//		School s4 = new student();  //다운캐스팅 방법2
//		student s5 = (student)s4;
//		s5.info("피카츄");
//		s5.schoolName();
		
		School s2 = new student(); 
		s2 = new tech();  //위에 s2는 스쿨형이므로 티쳐도 가르킬 수 있다.
		//((tech)s2).info("라이츄");
		s2.schoolName();
		s2.info("라이퓨");  //부모형에 인포를 만들면 형변환 필요x
		
		
		
		
		

	}

}
