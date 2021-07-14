package com.google.mhstest2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String [] args) {
		System.out.println("Test1 Start");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반복할 횟수를 입력");
//		int count = sc.nextInt();
//		int num=0;
//		for(int i=0;i<count;i=i++) {
//			System.out.println("Hi there"+i);
//			num=num++;
//		}
		
		//
		//0-20 사이에 짝수만 출력
		
//		for(int i=0;i<20;i=i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		System.out.println("===================");
		// 0-20미만 사이에 짝수만 출력
		//단 if문을 사용하지 않고 출력
		
		for(int i=0;i<20;i=i+2) {
			System.out.println(i);
		}
		
		
		System.out.println("Test1 finish");
	}
}
