
public class MethodTest {
	// 1.메소드 정의 후에  2.사용함
	// hello():console에  "hello,java를 출력"
	static void hello(){
		System.out.println("Hello, java");
	}
	
	//increase(): int형 변수 한개를 입력받아 1을 증가 시킨 후 그 값을 리턴
	static int Increase(int a){
		int x=++a;
		return x;
		}
	
	//printGreeting(): 이름을 매개변수로 입력받아 그 앞에 "...be happy!"를 붙여 출력
	static void printGreeting(String name)
	{
		System.out.println("...be happy!"+name);
	}
	
	//이름을 매개변수로 입력받아 이름 뒤에 'welcome!'을 붙여 리턴
	
	static String greeting(String name)
	{
		String s="welcome!"+name;
		
		return s;
	}
	
	//문자열 두개를 입력 받아 그 둘을 붙여 리턴
	
	static String concat(String a,String b)
	{
		String s=a+b;
		return s;
	}
	
	// int형 변수 두개를 입력 받아 그 합을 리턴
	static int sum(int a,int b)
	{
		int c=a+b;
		
		return c;
	}
	
	//float형 두개를 입력받아 그합을 리턴
	static float sum(float a,float b)
	{
		float c=a+b;
		
		return c;
	}
	
	//double형 두개를 입력받아 그합을 리턴
	static double sum(double a,double b)
	{
		double c=a+b;
		
		return c;
	}
		
	//정수형 변수 한개를 입력 받아 절대값을 구한 뒤 리턴
	static int abs(int a)
	{
		if(a>0) return a;
		else return -a;
	}
	
	static double pi()
	{
		return Math.PI;
	}
	
	public static void main(String[] args) {
		//작성된 메소드 사용
		int result=Increase(88);
		System.out.println(result);
		
		
		hello();
	}

}
