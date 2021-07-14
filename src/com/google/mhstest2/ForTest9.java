package com.google.mhstest2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("Test9 Start");
		
		// 게임 예제
		// 탄창 3개
		// 한 탄창에 30발
		// 단발모드 1발, 점사모드 3발
		// 1. 단발? 점사?
		// 1-탕 30번
		// 2-타타탕 10번
		Scanner sc = new Scanner(System.in);
		
		
		//방법1
//		for(int tan=0;tan<3;tan++) {
//			System.out.println("1. 단발 2. 점사");
//			int select = sc.nextInt();
//			String sound="탕";
//			//int count = 30;
//			int num=1;
//			if(select != 1) {
//				sound="타타탕";
//				//count=10;
//				num=3;
//			}
//			
//			for(int i=0;i<30;i=i+num) {
//				System.out.println(sound);
//			}
		
		//방법2
		for(int tan=0;tan<3;tan++) {
			System.out.println("1. 단발 2. 점사");
			int select = sc.nextInt();
			String sound="탕";
			int count = 30;
			if(select != 1) {
				sound="타타탕";
				count=10;
			}
			
			for(int i=0;i<count;i++) {
				System.out.println(sound);
			}
			
			
			//방법3
//			if(select==1) {
//				for(int i=0;i<30;i++) {
//				System.out.println("탕");
//				}	
//				}else {
//				for(int i=0;i<10;i++)
//					System.out.println("타타탕");
//			}
		}
		
		System.out.println("Test9 finish");

	}

}
