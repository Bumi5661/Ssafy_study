package array1;

import java.util.Arrays;

public class Counting {
	public static void main(String[] args) {
	
		int[] a= {0,4,1,3,1,2,4,1};
		int M=Arrays.stream(a).max().getAsInt();
		int[] cnt=new int[M+1];
		int[] s=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			cnt[a[i]]++;
		}
		
		for(int i=0;i<cnt.length-1;i++) {
			cnt[i+1]=cnt[i+1]+cnt[i];
		}
		
//		for(int i=1;i<cnt.length;i++) {
//			cnt[i]=cnt[i]+cnt[i-1];
//		}
		for(int i=a.length-1;i>=0;i--)
		{
			cnt[a[i]]--;
			s[cnt[a[i]]]=a[i];
		}
		
		System.out.println(Arrays.toString(s));
	
	}
}
