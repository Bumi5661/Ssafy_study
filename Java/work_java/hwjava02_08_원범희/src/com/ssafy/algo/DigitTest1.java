package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        int digit[]=new int[50];
	        
	        int num=sc.nextInt();
	        while(num>0) 
	        {
	            digit[num/10]++;
	            num=sc.nextInt();
	        }
	        for(int i=0;i<digit.length;i++) 
	        {
	            if(digit[i]>0)
	                System.out.println(i+":"+digit[i]+"개");
	        }
	    }
}
