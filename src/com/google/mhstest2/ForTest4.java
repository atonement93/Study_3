package com.google.mhstest2;

public class ForTest4 {
	public static void main(String [] args) {
		System.out.println("Test4 Start");
		
		//1+2+3+4+5=15
		//1+2+3+....+1000000
		
//		int hap=0;
//		hap = hap + 1;//1
//		hap = hap + 2;//3
//		hap = hap + 3;//6
//		hap = hap + 4;//10
//		hap = hap + 5;//15
		
		//반복문 5번
		
		int hap = 0;
		
		for(int i=1;i<6;i++) {
			hap = hap + i;
			System.out.println(hap);
		}
		
		System.out.println("총합 : "+hap);
		
		
		System.out.println("Test4 finish");
	}

}
