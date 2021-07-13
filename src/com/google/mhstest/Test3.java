package com.google.mhstest;

import java.util.Scanner;

public class Test3 {
	public static void main(String [] args) {
		System.out.println("==Test3 Start==");
		//쇼핑몰의 총 주문금액 입력
		//주문금액이 30000 이하면 배송비 3000원이 추가 아니면 0
		
		//총 주문금액을 출력
		//ex) 주문 금액 : 25000 -> 28000 출력
		//ex) 주문 금액 : 35000 -> 35000 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 금액을 입력하세요");
		
		int total = sc.nextInt();
		if(30000 >= total) { 
			total = total + 3000;
		}
		System.out.println("총 금액 : " + total);
		
		System.out.println("Test3 finish");
	}

}
