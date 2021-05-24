package ex_class;

import java.util.Arrays;

//학생 클래스
//필드 :이름(name), 반(group), 점수 배열(자바,파이썬,씨), 합계
//메소드 : 합계 계산, 평균 계산해서 반환
class Student{
	String name = "로아";
	String group = "아크";
	int[] score = new int[3];
	int sum;
	//합계 구하기
	void sumCal(int a,int b,int c){ //합계
		sum=0;
		score[0] = a; score[1] = b; score[2] = c;
		sum =a + b + c;
	}
	void sumCal(int[] score){  //합계
		sum=0;
		this.score = score;  //디스 스코어는 필드  //얇은 복사
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
	}
	double avgCal(double a) {
		return a/3;
	}
	//평균 구하기
	double avgCal() {
		double avg = (double)sum/score.length;
		return (double)Math.round(avg * 100) / 100;
	}
	
	
	
	
}


public class J20210419_03_student {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.name);
		System.out.println(s1.group);

		s1.sumCal(20, 30, 40); //값 주기
		System.out.println(Arrays.toString(s1.score));
		
		System.out.println(s1.sum); //합계
		
		s1.sumCal(new int[] {70,99,40}); //값 바꾸기
		System.out.println(Arrays.toString(s1.score));
		System.out.println(s1.sum); //합계
		
		System.out.println(s1.avgCal()); //평균
		
		
		
	}

}
