package com.ssafy.java;

import java.util.Scanner;

public class ArrayTest {
	static int[] List;
	
	
	
	
	static void input()	//console로부터 입력 값을 받아서 배열에 저장
	{
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		String[] s1=s.split(" ");
		
		List =new int[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			List[i]= Integer.parseInt(s1[i]);
		}
		
	}
	
	static void print(int[] List) {
		for(int i=0;i<List.length;i++)
		{
			System.out.print(List[i]+" ");
		}
		System.out.println();
	}
	static void total(int[] List) {
		int result=0;
		for(int i=0;i<List.length;i++)
		{
			result+=List[i];
		}
		System.out.println("배열의 합 :" +result);
	}
	static void average(int[] List) {
		int result=0;
		for(int i=0;i<List.length;i++)
		{
			result+=List[i];
		}
		System.out.println("배열의 평균 :"+result/List.length);
	}
	static void minnum(int[] List) {
		
		selectionSort(List);
		System.out.println("배열의 최소값: "+List[0]);
	}
	static void selectionSort(int[] List) {
		for(int i=0;i<List.length;i++)
		{
			for(int j=i+1;j<List.length;j++)
			{
				int temp=0;
				if(List[i]>List[j])
				{
					 temp=List[i];
	                 List[i]=List[j];
	                 List[j]=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		
		input();//배열에 data 넣기
		print(List);//배열안의 값 출력
		average(List);
		total(List);//배열안의 값들 total
		minnum(List);//배열안의 값 중 최소값
		

	}

}
