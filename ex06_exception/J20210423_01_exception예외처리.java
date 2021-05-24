package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_exception예외처리 {

	public static void main(String[] args) {
		// 예외처리
		//JVM이 해당하는 예외의 객체를 생성
		
//		Scanner sc = new Scanner(System.in);
//		int a = 10, b=0;
		//System.out.println("나눌 수를 입력");
//		b = sc.nextInt();
//		System.out.println(a/b);  //한번 예외를 만들어보기
		
//		while(true) {
//			System.out.println("나눌 수를 입력");
//			try { //예외 발생 가능성이 있는 문장	
//				b = sc.nextInt();
//				System.out.println(a/b); break;  // 얘도 나중에 문제가 있을수 있으니 한꺼번에 넣음
//			}catch(InputMismatchException e) {
//				// 예외가 발생했을때
//				System.out.println("숫자를 입력해주세요"); 
//				sc.nextLine();  //버퍼 비우기 (sc가 b에 값을 못넣었는데 반복문 돌아감)
//				e.printStackTrace();  //예외 발생 지점 추적 출력
//			}catch(ArithmeticException e ) {
//				// 예외가 발생했을때
//				System.out.println("0 이상을 입력"); 
//				e.printStackTrace();  //예외 발생 지점 추적 출력
//			}catch(Exception e) {  //모든 예외 처리  //얘는 가장 마지막에
//				System.out.println("예외발생"); 
//				e.printStackTrace();
//			} 
//			
//		}
//		System.out.println("정상 종료");

		//실습) 
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = {10,20,30};
//		int a = 0;
//		
//		while(true) {
//			System.out.println("번호를 넣어 주세요");
//			try {
//				a = sc.nextInt();
//				System.out.println(arr[a-1]); break;
//			}catch(ArrayIndexOutOfBoundsException e){
//				System.out.println("숫자를 다시 골라바");
//			}catch(InputMismatchException e){
//				System.out.println("숫자가 아니야");
//				sc.nextLine();
//			}catch(Exception e){
//				System.out.println("예외");
//			}
//		}
//		
//		System.out.println("정상종료");
		
		
		// 예외의 종류
		//1) 체크 예외 : RuntimeException을 상속하지 않은 예외
		               //네트워크 , db등의 파일, 외부장치와 연결되는 것들
		//2) 언체크 예외 : 	RuntimeException을 상속한 예외
		//Scanner sc = new Scanner(file); 예외 처리를 안해주면 에러가 나옴
		File file = new File("sample.txt");
		System.out.println(file);
		try {
			Scanner sc = new Scanner(file);
			System.out.println("니 파일 쩔드라");
			while(sc.hasNextLine()){  //다음 문자열이 있는지 확인
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {  //체크예외
			System.out.println("파일을 찾을수 없습니다.");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
