package com.google.mhstest2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("Test8 Start");
		// 분초 출력
		// 0분 0초
		// 0분 1초
		// ...
		// 0분 59초
		// 1분 0초
		// 1분 1초
		// 1분 2초
		// ...
		// 1분 59초
		// 2분 0초
		// ...
		// 59분 59초
		
		System.out.println("Test8 finish");
		
	
		
		// 분, 초를 입력 1, 10
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		boolean flag = false;
		
		for(int min=0;min<60;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분"+sec+"초");
				if(m==min && s==sec) {
					System.out.println("종료");
					flag=true;
					break; // 혹은 sec=60; min=60; (조건식을 false로 만드는 방법)
					
				}
			}//안쪽 for
			
			if(flag) {
				break;
			}
		}
		
	}
}
