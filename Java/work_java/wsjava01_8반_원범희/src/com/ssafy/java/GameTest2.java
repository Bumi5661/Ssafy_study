package com.ssafy.java;

import java.util.Scanner;

public class GameTest2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승.");
		System.out.println("3. 1판 1승.");
		System.out.println("번호를 입력하세요");
		
		int input=sc.nextInt();
		
		int cng=0;
		if(input==1) cng=5;
		if(input==2) cng=3;
		if(input==3) cng=1;
		
		int cnt=0; int cnt2=0;
		
		for(int i=0;i<cng;i++) {
			int a=(int)(Math.random()*3)+1;
			System.out.print("가위바위보 중 하나 입력:");
			String gbb =sc.next();
			
			switch (gbb) {
				case "가위":
					if(a==1) System.out.println("비겼습니다");
					if(a==2) { System.out.println("졌습니다"); cnt++;}
					if(a==3) { System.out.println("이겼습니다"); cnt2++;}
				break;
					
				case "바위":
					if(a==1) { System.out.println("이겼습니다"); cnt2++;}
					if(a==2) System.out.println("비겼습니다");
					if(a==3) { System.out.println("졌습니다"); cnt++;}
				break;
				
				case "보":
					if(a==1) { System.out.println("졌습니다"); cnt++;}
					if(a==2) { System.out.println("이겼습니다"); cnt2++;}
					if(a==3) System.out.println("비겼습니다");
				break;
		
				default:
					
					break;
			}
		}
		if(cnt<cnt2) System.out.println("###사용자 승!!");
		else System.out.println("###컴퓨터 승!!");
	}

}
