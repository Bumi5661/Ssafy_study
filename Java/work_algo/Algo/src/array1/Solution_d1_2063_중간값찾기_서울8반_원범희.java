package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_d1_2063_중간값찾기_서울8반_원범희 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]= new int[a];
		for(int i=0;i<a;i++)
		{
			int b=sc.nextInt();
			arr[i]=b;
		}
		Arrays.sort(arr);
		
		System.out.println(arr[(a)/2]);
		sc.close(); //스캐너 사용이 끝나면 명시적으로 close 해주는 것이 좋음
	}

}
