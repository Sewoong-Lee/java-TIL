package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class J20210507_03_bupper {

	public static void main(String[] args) {
//		//한줄씩 쓰기 (입력받기)
//		Scanner sc = new Scanner(System.in);
//		//try~with문 (트라이가 끝난 이후 클로즈가 자동실행)
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("./data/buffer.txt"))) {
//			while(true) {
//				System.out.println("이름, 국, 영, 수 를 입력하시오.");
//				String data = sc.nextLine();
//				if (data.equals("quit")) {
//					System.out.println("종료"); break;
//				}
//				bw.write(data);
//				bw.newLine(); 
//			}
//		}catch (IOException e) {
//			System.out.println("입출력 예외발생");
//		}
	
//		//한줄씩 쓰기 (기본)
//		BufferedWriter bw = new BufferedWriter(new FileWriter("./data/buffer.txt"));
//			bw.write("ㅋㅋ,12,33,55");
//			bw.newLine();  //한라인씩 저장 //개행
//			bw.write("하하,55,88,99");
//			bw.newLine();  
//
//		bw.close();
		
//		//한줄씩 읽기
//		FileReader fr = new FileReader("./data/buffer.txt"); (스루스함)
//		BufferedReader br = new BufferedReader(fr);
//		
//		String s = null;
//		while((s =br.readLine()) != null) {
//			System.out.println(s);
//			String[] arr = s.split(",");
//			System.out.println(Arrays.toString(arr));			
//		}
//		
//		br.close();
		
		
		//한줄씩 읽기(반복이용)
		try(BufferedReader br = new BufferedReader(new FileReader("./data/buffer.txt"))) {
			String s = null;
			while((s =br.readLine()) != null) {
				System.out.println(s);
				String[] data = s.split(",");
				System.out.println(Arrays.toString(data));
				int sum=0; //과목의 합계
				for (int i=1;i<4;i++) {
					sum += Integer.parseInt(data[i]); //이거 많이 씀
				}
				System.out.println("이름 "+data[0]);
				System.out.println("합계 "+sum);
				System.out.printf("평균 %.2f \n",sum/3.);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
