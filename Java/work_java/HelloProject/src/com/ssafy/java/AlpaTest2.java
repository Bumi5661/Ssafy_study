package com.ssafy.java;

public class AlpaTest2 {

	public static void main(String[] args) {
		
		char a='A';
		
		for(int i=4;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{	System.out.print("  ");	
			}
			for(int j=0;j<5-i;j++)
			{		
				System.out.print(a+++" ");
			}
			System.out.println();
		
			
		}

	}

}
