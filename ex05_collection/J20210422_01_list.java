package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



//컬렉션 프레임워크
//프레임워크도 라이브러리의 집합
//골격을 잡아놓은것의 차이
//리스트안에 배열형 링크드리스트 형이 있음
//컬렉션의 리스트와, 맵(키와 벨류로 구성)을 가장 만이 씀

public class J20210422_01_list {

	public static void main(String[] args) {
		//List<E> 프레임워크
		//저장 순서가 있다. (인덱스가 있다.)
		//데이터의 중복 허용 가능
		//1) ArrayList : 배열 구조(연속적 공간의 할당.)
		//               검색시 유리 /  추가, 삭제가 어려움
		//ArrayList arrlist = new ArrayList();  //컨트롤 쉬프트 o 누르면 위에 임포트댐  //제네릭 설정을 안하면 오브젝트(최상위)로 자동 설정
		
		ArrayList<Integer> arrlist = new ArrayList<>();  //유지보수의 어려움으로 형을 정해줌
		
//		arrlist.add(10);  //add가 값 넣기
//		arrlist.add(22);
//		arrlist.add(33);
		System.out.println(arrlist.size());  //현재 초기화가 안되서 사이즈 없음
		
		for(int i = 1;i<5;i++) {  //반복문을 이용하여 값 넣기  //여기에 사이즈 넣으면 안댐 초기화 x
			arrlist.add(i*10);
		}
		System.out.println(arrlist);  //출력
		
		for(int i = 0;i<arrlist.size();i++) {  //어레이리스트의 사이즈로 출력
			System.out.println(arrlist.get(i)+100);  //겟으로 그 인덱스를 뺴옴
		}
		
		//foreach문
		for(int a:arrlist ){  //포이치문으로 출력
			System.out.println(a);
		}
		
		arrlist.remove(1);   //인덱스로 삭제
		System.out.println(arrlist);
		
		arrlist.add(2, 90);  //인덱스의 위치에 추가
		System.out.println(arrlist);
		
		arrlist.set(2, 70);  //인덱스의 값 바꾸기
		System.out.println(arrlist);
		
		
//		ArrayList<Double> arrlist1 = new ArrayList<>();  //실수형 넣어보기
//		arrlist1.add(10.5);
//		arrlist1.add(22.5);
//		System.out.println(arrlist1);
//		
//		ArrayList<String> arrlist2 = new ArrayList<>();   //문자형 넣어보기
//		arrlist2.add("q");
//		arrlist2.add("w");
//		System.out.println(arrlist2);
		
		//실습) 이름을 입력 받아 ArrayList만들기
//		ArrayList<String> arrlist5 = new ArrayList<>();  
//		Scanner sc = new Scanner(System.in);
//		
//		while (true){
//			System.out.println("이름은?");
//			String a = sc.next();
//			if(a.equals("q")) {
//				System.out.println("종료"); break;
//			}else {
//				arrlist5.add(a);
//			}
//		}
//		for(int i =0;i<arrlist5.size();i++) {  //하나씩 출력
//			System.out.println(arrlist5.get(i));
//		}
//		System.out.println(arrlist5);  //통출력
		
		//삭제 1)
//		System.out.println("삭제할 이름은?");
//		String a = sc.next();
//		arrlist5.remove(a);  //리무브 오브젝트로 변수로 선택 삭제 가능. (중복일시 첫번째만 삭제)
//		System.out.println(arrlist5);
		
		//삭제 2)
//		arrlist5.add("hong");arrlist5.add("park");arrlist5.add("park");arrlist5.add("park"); //하드코딩함
//		System.out.println(arrlist5);
//		System.out.print("삭제할 이름은?");
//		String name = sc.next();
//		for(int i=0; i< arrlist5.size(); i++) {
//			if (arrlist5.get(i).equals(name)) {
//				arrlist5.remove(i);
//				i--;
//			}
//		}
//		System.out.println(arrlist5);
		
		
		//삭제 3안  //이거 추천
		//반복자 iterator  :  인덱스를 사용하지 않음
//		arrlist5.add("hong");arrlist5.add("park");arrlist5.add("park");arrlist5.add("park"); //하드코딩함
//		System.out.println(arrlist5);
//		System.out.print("삭제할 이름은?");
//		String name = sc.next();
//		//반복자 생성
//		Iterator<String> it =  arrlist5.iterator();
//		while(it.hasNext()) {  //이동하지 않음
//			String n = it.next(); //넥스트가 이동하여 값 확인 값을 n에 넣음
//			if (name.equals(n)) it.remove();  // 내가 넣은 값과 같다면 삭제
//		}
//		System.out.println(arrlist5);
		
		
		//반복자를 이용하여 출력
		//선언과 동시에 초기화
		//  Arrays.asList() 고정길이 반환
//		List<String> list = new ArrayList<String> (Arrays.asList("레드","블루","핑크")); //이렇게 하면 리무브 가능
		
//		List<String> list = Arrays.asList("레드","블루","핑크");
//		System.out.println(list);
//		Iterator<String> it =  list.iterator();
//		while(it.hasNext()) {
//			//String n = it.next();
//			System.out.println(it.next());  //넥스트로 바로 출력 가능  // 다음 값이 없다면 자동으로 펄스, 빠져나옴
//		}
		
		
		//학생들의 키를 입력받아 평균을 구하시오.
//		ArrayList<Double> arrlist1 = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		double c =0;
//		int b =0;
//		while (true){
//			b++;
//		System.out.println(b+"번 키는?");
//		double a = sc.nextDouble();
//		if(a==00) {
//			System.out.println("종료"); break;
//		}else {
//			arrlist1.add(a);
//		}
//		}
//		for(int i =0;i<arrlist1.size();i++) {  
//			c +=arrlist1.get(i);
//			//System.out.println(arrlist1.get(i));
//		}
//		System.out.println(arrlist1);
//		System.out.println("총 합은 " + c);
//		System.out.println("평균은 " + c / arrlist1.size());
		
		
		//LinkedList : 리스트 기반
		//각 요소가 자신의 이전 요소의 주소와 다음요소의 주소를 가지고 있다.
		//추가, 삭제가 쉽다. 검색시 성능 저하
		
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("자바");
		linkedlist.add("파파");
		linkedlist.add("이썬");
		
		System.out.println(linkedlist);
		
		
		for (int i =0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
		
		List<String> linkedlist1 = new LinkedList<>();  //유지 보수의 효율로 리스트형으로 선언(부모형, 인터페이스로)
		linkedlist1.add("qq");
		System.out.println(linkedlist1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
