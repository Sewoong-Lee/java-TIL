package ex_class;

import java.util.Arrays;

//계산기 클래스
class Sum{
	//두 정수를 매개변수로 받아 합을 리턴하는 메소드
	int add (int a, int b) {
		return a+b;
	}
	
	//세 정수를 매개변수로 받아 합을 리턴하는 메소드
	int add (int a, int b, int c) {
		return a+b+c;
	}
	//배열을 매개변수로 받아 합을 마지막 인덱스에 넣어 리턴하는 메소드
	int add(int[] a) {
		System.out.println(Arrays.toString(a));
		int sum=0;
		for (int i=0;i<a.length-1;i++) {
			sum+=a[i];
		}
		a[a.length-1] = sum;  //마지막 인덱스에 합계 넣음
		return sum;
	}
	
	int add1(int...arr) {  //점 세개가 가변인자 : 몇개의 인자가 들어오든 배열로 처리하여 arr의 랭스만큼 처리한다는 뜻
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	//문자열을 가변인자로 받아서 출력
	void st(String...arr) {   //포문
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	void st1(String...arr) {   //포이치문
		for (String a:arr) {
			System.out.println(a);
		}
	}
	
	
	
	
	
	
	
}



public class J20210420_03_overloading {
	public static void main(String[] args) {
		Sum s1 = new Sum();
		
		System.out.println(s1.add(20, 30));
		System.out.println(s1.add(10, 20, 30));
		
		int[] arr = {10,20,30,40,0};
		System.out.println("배열값"+s1.add(arr));
		System.out.println(Arrays.toString(arr));  //마지막에 합계 들어옴
		
		System.out.println(s1.add1(10,20,30,40,50));
		
		s1.st("ㅋㅋㅋ","ㅌㅌㅌ","ㅊㅊㅊ");
		s1.st1("ㅋㅋㅋ","ㅌㅌㅌ","ㅊㅊㅊ");
		
		
	}

}
