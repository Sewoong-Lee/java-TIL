package java01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J20210415_01_배열 {

	public static void main(String[] args) {
		// 배열
//		int cnt = 5;
//		int[] arr; //선언은 stack에
//		arr = new int[5];  //배열은 heap에 생성
//		//자바는 동적배열 : 
//		arr - new inr[cnt];  //객체생성해서 주소를 arr에 대입
//		arr[0] = 10;
//		System.out.println(arr[0]);
//		arr[5] =100; //5번 인덱스는 없다.
		
		//선언과 동시에 초기화, 선언하고 객체 생성
//		int[] arr = new int[5];
//		//1~5 값을 대입
//		for(int i=0;i<5;i++)
//			arr[i]=(i+1)*10;
//		for(int i = 0;i<5;i++) {
//			System.out.println(arr[i]);
//		}
		
		//하드코딩 안하기
//		int[] arr = new int[7]; //여기 숫자가 바뀌어도 자동으로 아래 랭스로 바뀜
//		//1~5 값을 대입
//		for(int i=0;i<arr.length;i++)  //arr렝스를 이용하여 길이 대입
//			arr[i]=(i+1)*10;
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//선언과 초기화  :  반드시 사이즈 생략
		//int[] arr = new int[] {10,20,30}; //선언과 동시에 초기화 할경우 사이즈 생략
//		int[] arr = {10,20,30};  //이렇게 해도댐 위에랑 똑같음
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		//for~each문 : 위랑 똑같다.
//		for(int a:arr) {
//			System.out.println(a);
//		}
//		
//		
//		//Arrays : 값만 확인하고 싶을떄, 클래스를 이용한 문자열 출력
//		//Arrays.toString(arr); //오버로딩 투스트링이 여러개
//		System.out.println(Arrays.toString(arr)); //오버로딩
//		
//		//System.out.println(arr);//arr 배열은 주소임 그래서 이건 안댐//println메소드는 toString() 실행
//		//System.out.println(arr.toString()); //얘도 주소뜸 위에랑 같다  //오버라이딩
		
		
		//실습) 아래 점수의 합계와 평균을 구하라
//		int sum=0;
//		int[] s = {88,89,77};
//		for(int a:s) {
//			sum +=a;
//		}
//		System.out.printf("합계 "+sum+" 평균 %.2f",(double)sum/3);
		
		
		//해석
//		int sum=0;
//		int[] s = {88,89,77};
//		for(int i=0;i<s.length;i++) {
//			sum += s[i];
//		}
//		System.out.println("합계"+sum);
//		System.out.println("평균"+Math.floor(sum/3)); //소수점 버림
		
		
		//3명의학생의 점수를 입력 받아서
//		Scanner sc = new Scanner(System.in);
//		int r;
//		int[] s = new int[5];
//		int sum=0;
//		for(int i=0;i<3;i++) {
//			System.out.printf("점수는?");
//			r = sc.nextInt();
//			s[i]=r;
//			sum +=s[i];
//		}
//		System.out.printf("합계 "+sum+" 평균 %.2f",(double)sum/3);
		
		
		//3명의 3과목
//		Scanner sc = new Scanner(System.in);
//		int r;
//		int[] s = new int[5];
//		int[] c = new int[5];
//		int[] v = new int[5];
//		int sum=0, sum1=0, sum2=0;
//		System.out.println("첫번째 학생 점수 입력");
//		System.out.println("점수는?");
//		for(int i=0;i<3;i++) {
//			r = sc.nextInt();
////			if(r>101) {
////				System.out.println("오류"); break;
////			}
//			s[i]=r;
//			sum +=s[i];
//		}	
//		System.out.println("두번째 학생 점수 입력?");
//		System.out.println("점수는?");
//		for(int i=0;i<3;i++) {
//			r = sc.nextInt();
//			c[i]=r;
//			sum1 +=c[i];
//		}
//		System.out.println("세번째 학생 점수 입력");
//		System.out.println("점수는?");
//		for(int i=0;i<3;i++) {
//			r = sc.nextInt();
//			v[i]=r;
//			sum2 +=v[i];
//		}
//		System.out.printf("합계 "+sum+" 평균 %.2f\n",(double)sum/3);
//		System.out.printf("합계 "+sum1+" 평균 %.2f\n",(double)sum1/3);
//		System.out.printf("합계 "+sum2+" 평균 %.2f\n",(double)sum2/3);
		
		
		//문자열 배열
		//String[] arr = new String[] {"java","python","c"};
//		String[] arr = {"java","python","c"};
//		for(String s:arr) {
//			System.out.println(s);
//		}
		
		//실습)좋아하는 컬러 3개를 입력 받아 배열에 저장하고 출력
//		Scanner sc = new Scanner(System.in);
//		String[] arr = new String[3];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("컬러를 입력 하시오");
//			arr[i] = sc.next();
//		}
//		System.out.println("________________");
//		for(String a:arr) {
//			System.out.println(a);
//		}
		
		//피보나치 수열
//		Scanner sc = new Scanner(System.in);
//		System.out.println("맥스는?");
//		int n = sc.nextInt();
//		int[] fibo = new int[n];
//		fibo[0]=0; fibo[1]=1;
//		for(int i=2;i<n;i++) {
//			fibo[i]=fibo[i-2]+fibo[i-1];
//		}
//		for(int f :fibo) {
//			System.out.println(f);
//		}
		
		
		//실습) 시험 채점하기
		//
//		Scanner sc = new Scanner(System.in);
//		int[] l = {1,3,4,4,1};
//		int[] a = {2,3,4,1,1};
//		int c=0;  
//		for(int i=0;i<a.length;i++) {
//			if(l[i]==a[i]) {
//				System.out.println((i+1)+"번 문제 정답");
//				c++;
//			}else {
//				System.out.println((i+1)+"번 문제 오답");
//			}
//		}
//		System.out.println((c*20)+"점");
//		System.out.printf("평균 %.2f",((double)(c*20)/5));
		
		//해석
//		int[] l = {1,3,4,4,1};
//		int[] a = {2,3,4,1,1};
//		int sum = 0;
//		for(int i=0; i<l.length; i++) {
//			if(l[i]==a[i]) {
//			System.out.println((i+1)+"번 문제 정답");
//			sum +=100/l.length;
//			}
//		}
//		System.out.println(sum);
		
		
		
		//실습) 최대값, 최소값 출력
//		int mx=0, mi=0;
//		int[] arr = {4,6,7,2,5};
//		for(int i=0; i<arr.length; i++) {  //최대값
//			if(arr[i]>arr[0]) {
//				arr[0]=arr[i];
//				mx=arr[0];
//			}
//		}
//		for(int i=0; i<arr.length; i++) {  //최소값
//			if(arr[i]<arr[0]) {
//				arr[0]=arr[i];
//				mi=arr[0];
//			}
//		}
//		System.out.println(mx);
//		System.out.println(mi);
		
		
		//해석) 최대값 해석
		//1)
//		int[] arr= {4,6,7,2,5};
//		int max = arr[0];
//		for(int i=1; i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("가장 큰값 "+max);
		
		//2)
//		int[] arr= {4,6,7,2,5};
//		int max = 0; //양수라는 가정하에 0으로 둠
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("가장 큰값 "+max);
		
		
		
		
		
		
		
		
		//실습)선택정렬(오름차순 정렬), (내림차순 정렬)
		//{2,4,5,6,7} / {7,6,5,4,2}
		//오름 차순 여기서 제일 작은거 고르고
		//가장 첫번째랑 교체
		
		//해석
//		int[] s =  {4,6,7,2,5};
//		
//		for(int j=0;j<s.length;j++) {
//			int min = s[j];
//			int minIndex=j; //가장 작은 값의 index
//			for(int i=j+1;i<s.length;i++) {
//				if(s[i]<min) {
//					min = s[i];
//					minIndex = i;
//				}
//			}
//			// 두수를 바꾸기
//			s[minIndex]=s[i];
//			s[j] = min;
//		}
		
		
		
		
		

		
		
		
		
		
		//실습) 번호 맞추기
		// 내가 입력한 번호가 배열안에 존재 하는지 확인
		//로또번로 6을 만들기 //맞춘 개수 출력
//		int[] no = {9,12,21,25,33,42};
//		
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[6];
//		int j=0;
//		for(int i =0; i<6;i++) {
//			System.out.println("번호는?");
//			int r = sc.nextInt();
//			arr[i]=r;
//		}
//		for(int i =0; i<6;i++) {
//			if(arr[0]==no[i]) {
//				j++;
//			}else if(arr[1]==no[i]) {
//				j++;
//			}else if(arr[2]==no[i]) {
//				j++;
//			}else if(arr[3]==no[i]) {
//				j++;
//			}else if(arr[4]==no[i]) {
//				j++;
//			}else if(arr[5]==no[i]) {
//				j++;
//			}else if(arr[6]==no[i]) {
//				j++;
//			}
//		}
//		System.out.println(j);
		
		
		//1)Math.random()*100+1;
		//2)Random
		//해석
		//int의 범위
//		System.out.println(Integer.MAX_VALUE); //가장 큰값
//		System.out.println(Integer.MIN_VALUE); //가장 작은값
		
		int[] no = new int[6];
		Random rd = new Random();  //랜덤 클래스 호출
		
		for(int i=0;i<no.length;i++) {
			boolean b = false; //기존에 존재하지 않는다.
			int r = rd.nextInt(45)+1; //한계값을 지정하고 0이 나오면 안되서 +1함
			//기존에 번호가 등록되어 있다면  컨티뉴
			for(int j=0;j<i;j++) {
				if(no[j]==r) {
					i--; //i줄이고 재실행
					b = true; //존재한다.
					break;
				}
			}
			if (!b) no[i] = r;
		}
		Arrays.sort(no);  //오름차순 정렬
		 System.out.println(Arrays.toString(no));

		
		
		
		
		
		//실수 배열 출력하기
//		double[] a = new double[5];
//		for(int i=0; i<5; i++) { 
//			a[i]=i*0.1;
//		}
//		for(double c:a) { 
//			System.out.printf("%.2f  ",c);
//		}
//		

		//배열의 복사
		//얇은 복사 (주소만 복사)
//		int[] src = {1,2,3,4,5};
//		int[] dest = src;
//		
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println(Arrays.toString(src)); //문자열로 값을 확인만
//		System.out.println(Arrays.toString(dest));
//		
//		src[1]=20; dest[3] = 40;  //src와 dest의 내용 바꿈 (둘다 바뀜)
//		System.out.println(Arrays.toString(src)); 
//		System.out.println(Arrays.toString(dest));
//		//두개 다 같은 주소를 가르키므로 하나가 바뀌면 같이 바뀜

		
		//깊은 복사 (값을 복사)
		
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		
////		System.out.println(src);
////		System.out.println(dest);
////		System.out.println(Arrays.toString(src)); 
////		System.out.println(Arrays.toString(dest));
//		
//		//src 안의 값을 dest에 복사
//		for(int i=0;i<src.length;i++) {
//			dest[i] = src[i];
//		}
//		dest[5]=6; //dest에 6을 추가
//		System.out.println(Arrays.toString(src)); 
//		System.out.println(Arrays.toString(dest));
//		src=dest; //dest의 주소를 src에 넣어 앏은복사로 src도 6이 추가
		
		//프레임워크를 이용한 데이터 추가
		//위에처럼 하면 너무 소스가 많아지므로 아래의 어레이리스트를 이용하여 쉽게 추가 가능
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		arr.add(30);
//		System.out.println(arr); 
		
		
		//배열의 깊은 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0}; //뉴 해도댐
//		//현재 3,4 만 복사하고싶음
//		System.arraycopy(src, 2, dest, 0, 3);  //1 배열이름 2 인덱스 3 배열이름 4인덱스 5 몇개?
//		System.out.println(Arrays.toString(src)); 
//		System.out.println(Arrays.toString(dest));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
