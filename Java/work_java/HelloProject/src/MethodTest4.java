

public class MethodTest4 {
	
	static int max(int a,int b,int c)
	{
		
		if(a>b)
		{
			if(c>a) return c;
			else return a;
		}
		else
		{
			if(b>c) return b;
			else return c;
		}
	}
	
	static int isExist(int a){
		int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int b=0;
		for(int i=0;i<numbers.length;i++){
			if(a==numbers[i]) {
				System.out.println("exist!"+(i+1)+"번째");
				b=i;
				break;
				}
			else {
				
				b=-1;
				
			}
			
		}
		if(b==-1) System.out.println("not exist");
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(max(3,6,6));
        isExist(7);
		
	}

}
