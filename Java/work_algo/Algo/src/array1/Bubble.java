package array1;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int a[]= {10,2,6,7,8,5,3,4,9,1};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}

/////////////////////////////////////////////
//////// 이 방법으로 해도 됨(이게 더 이해하기 쉬움)/////////
//for(int i=a.length-1;i>=0;i--)
//{
//	for(int j=0;j<i;j++)
//	{
//		if(a[j]>a[j+1])
//		{
//			int tmp=a[j];
//			a[j]=a[j+1];
//			a[j+1]=tmp;
//		}
//	}
//}