package array1;

import java.util.*;


public class Solution_d1_1208_Flatten_서울8반_원범희 {
	public static void main(String[] args) throws Exception {

			Scanner sc=new Scanner(System.in);
			
			int cnt=1;
			for(int j=0;j<10;j++) {
				int[] arr=new int[100];
				
				int dump=sc.nextInt();
				
				for(int i=0;i<100;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				Arrays.sort(arr);
				for(int i=0;i<dump;i++)
				{

					if(arr[0]==arr[99])
					{
						break;
					}
					else {
					arr[0]++;
					arr[99]--;
					Arrays.sort(arr);
					}
					
						
				}
				
				System.out.println("#"+cnt+" "+(arr[99]-arr[0]));
				cnt++;
			}
		}
	}
	