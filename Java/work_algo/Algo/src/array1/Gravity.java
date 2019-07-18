package array1;

import java.util.Scanner;

//	9
//	7 4 2 0 0 6 0 7 0 
public class Gravity {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] box=new int[N];
		for(int i=0;i<N;i++)
		{
			box[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++)
		{
			int cnt=N-(i+1); //크기가 9-(i+1)
			for(int j=i+1;j<N;j++)
			{
				if(box[j]>=box[i]) cnt--;	//내 높이보다 크거나 같으면 빼버림
			}
			if(max<cnt) max=cnt;
		}
	System.out.println(max);	
	}

}


