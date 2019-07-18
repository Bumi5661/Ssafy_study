package array1;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution_d1_3307_최장증가부분수열_서울8반_원범희 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int[] s1=new int[a];
		for(int i=0;i<a;i++)
		{
			s1[i]=sc.nextInt();
		}
		
		int[] arr=new int[a];
		int[] dp=new int[a];
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<s1.length;j++)
			{
				arr[j]=s1[j];
				dp[j]=1;
			}
		}
		
		for(int i=0;i<a;i++)
		{
			for(int j=i;j<a;j++){
				if(arr[i]<arr[j])
				{
					dp[j]++;
				}
			}
			
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a;i++)
		{
			if(max<dp[i])
			{
				max=dp[i];
			}
		}
		
		System.out.println(max);
	}

}
