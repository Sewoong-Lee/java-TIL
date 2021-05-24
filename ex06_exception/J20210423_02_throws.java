package ex06_exception;  //예외 던지기

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_02_throws {
	static void ArrayIndex(int index) {
		int[] arr = {10,20,30};
		
		try {
			System.out.println(arr[index]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 번호");
		}catch (Exception e) {
			System.out.println("예외");
		}
	}
	
	//throws 예외 던지기 : 호출한 메인 클래스 안에서 처리.
	static void ArrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException {  
		int[] arr = {10,20,30};
			System.out.println(arr[index]);
	}
	
	//파일 읽기 메소드
//	static void fileRead(String filename) {
//		File file = new File("sample.txt");
//		System.out.println(file);
//		
//		try {
//			Scanner sc = new Scanner(file);
//			System.out.println("니 파일 쩔드라");
//			while(sc.hasNextLine()){  //다음 문자열이 있는지 확인
//				String s = sc.nextLine();
//				System.out.println(s);
//			}
//			
//		} catch (FileNotFoundException e) {  //체크예외
//			System.out.println("파일을 찾을수 없습니다.");
//			e.printStackTrace();
//		}
//	}
	 //예외 던지기 적용
	static void fileRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		System.out.println(file);
		Scanner sc = new Scanner(file, "utf-8");  //인코딩 방식이 다르면 지정해줘야한다.
		System.out.println("니 파일 쩔드라");
		while(sc.hasNextLine()){  //다음 문자열이 있는지 확인
			String s = sc.nextLine();
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		//쓰루스 : 예외 던지기
		
//		J20210423_02_throws.ArrayIndex(3);
//		
//		//예외 던지기 처리
//		try {
//			J20210423_02_throws.ArrayIndex_throws(5);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("쓰루스 잘못된 인텍스");
//		}catch (Exception e) {
//			System.out.println("예외");
//		}
		
		//파일 읽기 메소드 호출
		try {
			J20210423_02_throws.fileRead("sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (Exception e) {
			System.out.println("예외");
		}

		
		
		
		
		
		

	}

}
