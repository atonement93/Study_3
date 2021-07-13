package com.google.mhstest;

import java.util.Scanner;

public class Test5 {
	public static void main(String [] args) {
		System.out.println("==Test5 Start==");
		Scanner sc = new Scanner(System.in);
		
		//회원가입시 입력한 ID
		int ID = 1234;
		//회원가입시 입력한 PW
		int PW = 5678;
		
		//입력할 id
		int yourid=0;
		//입력할 pw
		int yourpw=0;
		
		System.out.println("ID를 입력하세요");
		//ID 입력 후 저장
		yourid = sc.nextInt();
		
		System.out.println("PW를 입력하세요");
		//PW 입력 후 저장
		yourpw = sc.nextInt();
		
		//로그인이 성공하면 - 로그인 성공 출력
		if(yourid==ID && yourpw==PW) {
			System.out.println("로그인 성공");
		}
	}
}
