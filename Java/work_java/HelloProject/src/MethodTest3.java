
public class MethodTest3 {
	
	
	static void average(int a,int b,int c)
	{
		System.out.println((double)(a+b+c)/3);
	}
	
	static boolean reverse(boolean a)
	{
		return !a;
	}
	
	static String result(boolean a,boolean b)
	{
		if(a&&b) return "ok";
		else return "cancel";
	}

	static void loopString(int count, String msg)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(msg);
		}
	}
	
	static double getArea(int r)
	{
		return Math.PI*r*r;
	}
	
	static void printCircum(int r)
	{
		System.out.println(Math.PI*2*r);
		
	}
	
	static int[] makeArray(int len)
	{
		int[] arr=new int[len];
		
		return arr;
	}
	
	static void total(int data[])
	{
		int result=0;
		for(int i=0;i<data.length;i++)
		{
			result+=data[i];
		}
		System.out.println(result);
	}
	public static void main(String[] args) {

		int[] data= {10,28,30,50,90,123,450,66,67};
        average(1,2,3);
        System.out.println(reverse(true));
        System.out.println(result(true,true));
        loopString(3,"good");
        System.out.println(getArea(3));
        printCircum(3);
        System.out.println(makeArray(3).length);
        total(data);
		
		
		
	}

}
