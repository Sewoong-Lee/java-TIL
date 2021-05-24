package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//학생 클래스
//필드 : 번호, 이름, 전화번호

class Student{
	private int no;
	private String name;
	private String tel;
	
	public Student() {}
	public Student(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
	
}


public class J20210422_03_student {

	public static void main(String[] args) {
//		Student s1 = new Student(1,"행행행","010-3777-7777");
//		Student s2 = new Student(2,"캬캬캬","010-1111,2222");
//		Student s3 = new Student(3,"하하하","010-3333,4444");
//		
//		List<Student> l1 = new ArrayList<Student>();
//		l1.add(s1);
//		l1.add(s2);
//		l1.add(s3);
//		System.out.println(l1);
//		System.out.println(l1.get(1).getName());
//		
//		for(int i=0;i<l1.size();i++) {  //하나씩 풀어보기
//			Student s = l1.get(i);
//			System.out.println(s.getNo()+"  "+s.getName()+"  "+s.getTel());
//		}
//		
//		for(Student s: l1) {
//			System.out.println(s.getNo()+"  "+s.getName()+"  "+s.getTel());
//		}
		
		
		//맵에 저장
		//키 : 번호 값: 스튜던트
//		Student s1 = new Student(1,"행행행","010-3777-7777");
//		Student s2 = new Student(2,"캬캬캬","010-1111,2222");
//		Student s3 = new Student(5,"하하하","010-3333,4444");
//		
//		Map<Integer,Student> hmap = new HashMap<>();
//		hmap.put(s1.getNo(), s1);
//		hmap.put(s2.getNo(), s2);
//		hmap.put(s3.getNo(), s3);
//		System.out.println(hmap);
//		
//		System.out.println(hmap.get(5));
//		
//		System.out.println(hmap.get(1).getNo());
//		System.out.println(hmap.get(1).getName());
//		System.out.println(hmap.get(1).getTel());
//		
//		Student s = hmap.get(5);
//		System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
//		
//		
//		System.out.println(hmap.keySet());  //키만 보여줌
//		
//		//Set : 중복되지 않는 데이터들, 순서가 없다. (그래서 그냥 포문으로는 불가.)
//		Set<Integer> a = hmap.keySet();  //키만 변수에 넣음
//		
//		System.out.println(a);
//		
//		for(int k :a) {
//			System.out.println(k);
//		}
//		
//		for(int k :a) {
//			System.out.println(hmap.get(k));
//		}
		
//		Iterator<Integer> it= a.iterator(); //이터레이터를 이용한 키 출력
//		while (it.hasNext()) {
//			int k = it.next();
//			System.out.println(k);
//		}
		
//		Iterator<Integer> it= a.iterator(); //이터레이터를 이용한 키와 내용 출력
//		while (it.hasNext()) {
//			int k = it.next();
//			System.out.println(k);
//			Student sl = hmap.get(k);
//			System.out.println(sl.getNo()+" "+sl.getName()+" "+sl.getTel());
//			//System.out.println(hmap.get(k));
//		}
		
		
		//실습) restlt : "sucess"
		//data : ArrayList<Student>
		Student s1 = new Student(1,"행행행","010-3777-7777");
		Student s2 = new Student(2,"캬캬캬","010-1111,2222");
		Student s3 = new Student(3,"하하하","010-3333,4444");
		Map<String,Object> hmap = new HashMap<>();
		
		List<Student> slist = new ArrayList<>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		//System.out.println(slist);  //어레이리스트에 값 넣음 확인
		
		hmap.put("restlt", "sucess");
		hmap.put("data", slist);  //맵에 어레이리스트 넣기
		
		//System.out.println("그냥 맵 "+hmap);
		
		Object obj = hmap.get("restlt");
		System.out.println(obj);
		
		String result = (String) hmap.get("restlt");  //오브젝트인 리절트를 스트링 형으로 만듬  //부모형을 자식형으로 바꾸는걸 다운캐스팅
	
		if (hmap.get("restlt").equals("sucess")) {
			System.out.println("우아아 성공이야");
			System.out.println(hmap.get("data"));
		}else {
			System.out.println(hmap.get("에러요"));
		}
		
		//해석판
		if (result.equals("sucess")) { //스트링으로 바꾼 리절트를 이용한 방법
			System.out.println("우아아 성공이야");
			List<Student> stu1 = (List<Student>) hmap.get("data");  //오브젝트를 리스트로 형변환
			//System.out.println(stu1);  //확인
			for(Student s : stu1 ) {
				System.out.println(s.getName()+s.getNo()+s.getTel());
			}
		}else {
			System.out.println(hmap.get("에러요"));
		}
		
		
		
		
		System.out.println("키로 값 불러오기 "+hmap.get("restlt"));
		System.out.println("키로 값 불러오기 "+hmap.get("data"));
		
		System.out.println("키셋 "+hmap.keySet());
		
		Set<String> ks = hmap.keySet();
		
		for(String a : ks) {
			System.out.println("포이치문 키"+a);
			System.out.println("포이치문 값 "+hmap.get(a));
		
			
			
			
		}
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
