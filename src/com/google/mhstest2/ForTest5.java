package com.google.mhstest2;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String [] args) {
		System.out.println("Test5 Start");
		//과목수 입력(Scanner 입력)
		Scanner sc = new Scanner(System.in);
		System.out.println("과목수를 입력하세요");
		
		int num = sc.nextInt();
		int point=0;
		
		//과목수만큼 점수 입력
		//총합을 담을 변수
		int total=0;
		double avg=0.0;
		for(int i=0;i<num;i++) {
			System.out.println(i+1+"번째 점수 입력");
			point = sc.nextInt();
			total = total+point;
			
		}
		
		avg = (double)total/num;
		//총점 및 평균 계산 후 출력
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		System.out.println("Test5 finish");
	}

}
