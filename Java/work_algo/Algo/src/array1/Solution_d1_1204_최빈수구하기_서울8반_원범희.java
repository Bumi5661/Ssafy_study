package array1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_d1_1204_최빈수구하기_서울8반_원범희 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_d1_1204.txt"));
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			int b=sc.nextInt();
			
			int arr[]=new int[1001];
			int arrr[]=new int[101];
			int max=0;	//최소값을 구할때는 int max=Integer.MIN_VALUE 와 같은 식으로 쓰면 됨  (특정 값을 주는 것은 위험함)
			int ans=0;
			for(int j=0;j<1000;j++)
			{
				int c=sc.nextInt();
				arr[j]=c;
			}
			
			for(int j=0;j<1000;j++)
			{
				arrr[arr[j]]++;
			}
			
			for(int j=0;j<100;j++)
			{
				if(arrr[j]>=max)
				{
					max=arrr[j];
					ans=j;
				}
			}
		System.out.println("#"+b+" "+ans);
		}
	}

}
