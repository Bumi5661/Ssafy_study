package array1;
import java.util.Random;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("수=");
		//int t=sc.nextInt();
		
		Random r = new Random();
		int t=r.nextInt(100)+1;
	
		if(t%2==0)
			System.out.println(t+" 짝수");
		else
			System.out.println(t+" 홀수");

	}

}
/*
 
 수=10
 
 짝수
 ------
 수=9
 
 홀수
*/