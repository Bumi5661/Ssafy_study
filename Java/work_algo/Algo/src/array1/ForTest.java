package array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		int[] ia=new int[10];
		Random r = new Random();
		
		//Scanner sc = new Scanner(System.in);
		//int T=sc.nextInt();
		
		int sum=0;
		int max=0;
		int min=101;
		for(int i=0;i<=9;i++)
		{
			ia[i]=r.nextInt(5)+1;	
		}
		
		for(int i=0;i<=9;i++)
		{
			sum=sum+ia[i];
			
			if(min>ia[i])
			{
				min=ia[i];
			}
			if(max<ia[i])
			{
				max=ia[i];
			}
		}
		System.out.println("sum="+sum+ " min="+min + " max=" +max);
	}

}

