package array1;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution_d1_1289_원재의메모리복구하기_서울8반_원범희 
{
	public static void main(String args[]) throws Exception
	{
		int idx=1;
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
		
		String s= sc.next();
		
		//char[] chs=s.toCharArray() -> 문자열이 char배열로 바뀜
		int cnt=0;
		char comp='0';
		
		for(int j=0;j<s.length();j++)	
			{
				if(s.charAt(j)!=comp)
				{
					if(comp=='0')
					{
						comp='1';
					}
					else
						comp='0';
					cnt++;
				}
			}
		System.out.println("#"+(idx)+" "+cnt);
		idx++;
		}
	}
}

//int[] ia={1,2,3,4,5};
//for(int v:ia)
//{
//	System.out.println(v);
//}	-> 1,2,3,4,5 출력

