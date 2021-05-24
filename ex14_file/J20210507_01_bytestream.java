package ex14_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J20210507_01_bytestream {
//스트림 : 데이터의 흐름 (fifo)(먼저 들어간게 먼저 나감)
	public static void main(String[] args) {
		// 파일 읽고 쓰기
		//바이트 단위 (stream)
		
		// 1)파일 출력
		FileOutputStream fout = null;
		try {  
			fout = new FileOutputStream("sampletest.txt");  //바이트단위  //파일 이름
			fout.write(95);  //코드값
			fout.write('h');
			fout.write('h');
			fout.write('h');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fout != null) fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// 2)파일 읽기
//		FileInputStream fin = null;
//		try {
//			fin = new FileInputStream("./data/sampletest.txt");
//			while(true) {
//				int data =  fin.read();
//				//만약에 데이터가 -1이면 파일의 끝
//				if (data == -1) break;  //이거를 트루에 넣는 방법도 있음
//				System.out.println((char)data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없습니다.");
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		try {
//			if(fin != null) fin.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		
		// 2)파일 읽기 2번째
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("./data/sampletest.txt");
			int data;
			while((data = fin.read()) != -1) { //데이터를 먼저 읽고 그게 -1이면 끝
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fin != null) fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
