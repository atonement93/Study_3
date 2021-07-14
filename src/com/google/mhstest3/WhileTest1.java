package com.google.mhstest3;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		System.out.println("Test1 Start");
		//0-4까지 출력
//		for(int i=0;i<5;i++) {
//			System.out.println(i);
//		}
		
		//while
		//while(조건식) {}
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(check) {
			System.out.println("번호를 선택하세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종   료");
			int select = sc.nextInt();
			
			
			//다중선택문 2개
			
			switch (select) {
			case 1 :
				System.out.println("회원가입 코드 진행");
				break;
			case 2 :
				System.out.println("로그인 코드 진행");
				break;
			default:
				check = !check; // check=false;
				break;
			}
			
//			if(select==1) {
//				System.out.println("회원가입 코드 진행");
//			}else if(select==2) {
//				System.out.println("로그인 코드 진행");
//			}else {
//				System.out.println("종료");
//				check=!check; //cheak=false; 혹은 break;
//			}
		}
	}

}
