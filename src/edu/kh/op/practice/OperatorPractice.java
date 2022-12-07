package edu.kh.op.practice;

public class OperatorPractice {
	
	public void practice1() {
		int iNum1 = 29;
		int iNum2 = 100;
		
		System.out.println("인원 수 : " + iNum1);
		System.out.println("사탕 개수 : " + iNum2);
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + iNum2 / iNum1);
		System.out.println("남는 사탕 개수 : " + iNum2 % iNum1);
		System.out.println("=============================");
	}
	
	public void practice2() {
		String name1 = "홍길동";
		int iNum3 = 3;
		int iNum4 = 4;
		int iNum5 = 15;
		String sex = "남학생";
		double grade = 85.75;
		
		System.out.println("이름 : " + name1);
		System.out.println("학년 : " + iNum3);
		System.out.println("반 : " + iNum4);
		System.out.println("번호 : " + iNum5);
		System.out.println("성별 : " + sex);
		System.out.println("성적 : " + grade);
		System.out.println();
		System.out.println(iNum3 + "학년 " + iNum4 + "반 " + 
						iNum5 + "번 " + name1 + " " +
						sex + "의 성적은 " + grade + "이다.");
		System.out.println("=============================");
	}
	
	public void practice3() {
		int iNum6 = 60;
		int iNum7 = 80;
		int iNum8 = 40;

		System.out.println("국어 : " + iNum6);
		System.out.println("영어 : " + iNum7);
		System.out.println("수학 : " + iNum8);
		System.out.println();
		System.out.println("합계 : " + (iNum6 + iNum7 + iNum8));
		System.out.println("평균 : " + (double)((iNum6 + iNum7 + iNum8) /3));
	}
}
