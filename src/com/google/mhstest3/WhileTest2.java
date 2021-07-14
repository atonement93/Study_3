package com.google.mhstest3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("Test2 Start");
		
		int id = 1234;
		int pw = 5678;
		
		//1. 로그인
		// id, pw 입력
		// 로그인 판단
		//2. 종료
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
		System.out.println("1. 로그인");
		System.out.println("2. 종 료");
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("id를 입력하세요");
			int yid = sc.nextInt();
			System.out.println("pw를 입력하세요");
			int ypw = sc.nextInt();
			if(id==yid && pw==ypw) {
				System.out.println("로그인 성공");
				check = !check;
			}
			}else {
				System.out.println("종 료");
				check = !check;
			}
		}
		
	}
	}

