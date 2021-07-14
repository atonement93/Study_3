package com.google.mhstest2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String [] args) {
		System.out.println("Test6 Start");
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		
		boolean flag=false;
		
		//최대 5번 기회
		//1. 최대 5번 로그인 시도
		
		
		for(int i=0;i<5;i++) {
			System.out.println("ID를 입력");
			int yid = sc.nextInt();
			System.out.println("PW를 입력");
			int ypw = sc.nextInt();
			
			if(yid==id && ypw==pw) {
				flag = !flag;
				//flag = true;
				break;
			}
			System.out.println("로그인 실패");
		}//for 반복문 끝
		
		//2. for 종료 조건은 로그인이 성공하거나 로그인이 5번 모두 실패하는 경우
		//flag가 true면 로그인 성공 false면 모두 실패
		
		if(flag) {
		System.out.println("로그인 성공");
		}else {
		System.out.println("로그인 실패로 은행에 방문");
		}
	}

}
