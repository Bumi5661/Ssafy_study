import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1206 {

	public static void main(String[] args) {
		System.setIn(new FileInputStream("res/input_d1_1204.txt"));
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		int[] build = new int[a];
		
		
		for(int i=0;i<a;i++)
		{
			build[i]=sc.nextInt();
		}
		
		int[] build2 = build;
		
		Arrays.sort(build2);
		int cmp=build2.length-1;
		int answer=0;
		
		
		
		
		for(int i=2;i<a-2;i++)
		{
			int result=0;
			
			int max=Integer.MIN_VALUE;
			
			for(int j=i-2;j<i+3;j++) 
			{
			if(max<build[i] && j!=i) 
				max=build[i];
			}
			
			if(build[i]==build2[cmp])
			{
				result=build[i]-max;	//초록색 칠한부분
				cmp=cmp-1;
			}
			
			answer+=result;
		}
		System.out.println(answer);
		
		
		
	}

}
