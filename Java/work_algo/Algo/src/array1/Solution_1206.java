package array1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1206 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input (4).txt"));
		Scanner sc= new Scanner(System.in);
		
		
		
		int a=sc.nextInt();
		
		int[] build = new int[a];
		
		
		for(int i=0;i<a;i++)
		{
			build[i]=sc.nextInt();
		}
	
		
		int answer=0;
		
		for(int i=2;i<a-2;i++)
		{
			
			int max=Integer.MIN_VALUE;
			
			for(int j=i-2;j<i+3;j++) 
			{
				if(max<build[j] && j!=i) 
					max=build[j];
			}
			
				
			if(build[i]>max)
			{
				answer+=(build[i]-max);
			}
			
				
		}
		System.out.println(answer);
		
		
		
	}

}