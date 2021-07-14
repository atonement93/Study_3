package com.google.mhstest2;

import java.util.Scanner;

public class ForTest3 {
	public static void main(String [] args) {
		System.out.println("Test3 Start");
		Scanner sc = new Scanner(System.in);
		
		//종료 시간을 입력 받기
		//12
		//0초, 1초... 12초 끝
		//단 60이라는 상수는 변경이 불가능
		System.out.println("종료 시간 입력");
		int cho = sc.nextInt();
		
		for(int sec=0;sec<60;sec++) {
			System.out.println(sec+"초");
			if(sec == cho) {
				sec = 60;
			}
		}
		
		System.out.println("Test3 finish");
	}
			
}
