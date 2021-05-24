package ex14_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J20210507_02_char {

	public static void main(String[] args) {
		// 문자기반 : 문자 데이터의 입출력을 다루는 스트림
		// char형 변수 : 2바이트
		// 자바의 모든 문자를 유니코드를 기준으로 표현
		
		char c = '자';
		
		//문자단위 쓰기
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("./data/charcample.txt");
//			fw.write('a');
//			fw.write("자바");
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//문자단위 쓰기
		//try-with문 : 자동으로 크로즈
//		try(FileWriter fw = new FileWriter("./data/charcample.txt")) {
//			fw.write('a');
//			fw.write("자바");
//			fw.write("good");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//문자단위 읽기
//		int data;
//		try (FileReader fr = new FileReader("./data/charcample.txt")){
//			while((data = fr.read()) != -1) {
//				System.out.print((char)data);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		
		
		
		
		
		
		
		
		
		
		//실습) 좋아하는 컬러를 입력받아 파일을 만들고 
		//      파일을 읽어서 리스트를 출력
		Scanner sc = new Scanner(System.in);
		String a,b;
		for(int i = 0; i<3;i++) {
			try(FileWriter fw = new FileWriter("./data/fw.txt",true)) {
				a = sc.next();
				fw.write(a);
				fw.write("\n");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		int data;
		try (FileReader fr = new FileReader("./data/fw.txt")){
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		//실습2) 이름과 점수를 입력받아 파일에 저장하고
		//       파일을 읽어서 합계와 평균 구하기
		//Integer.parseInt("100")+Integer.parseInt("80")
		//http://blog.naver.com/PostView.nhn?blogId=imf4&logNo=220626268638
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
