//
//public class HelloWorld {
//	//main() method: 실행 가능한 파일이 되기 위해 필요한 부분
//	public static void main(String[] args) {
//		
//		boolean flag=true;
//		
//		byte b=12;	//1 byte	-128~127
//		b=b+1; //리터럴(literal: 값)	정수 리터럴이 계산에 사용 될 떄는 VM에서 4바이트짜리 그릇에 저장해둠	(12는 1바이트 짜리에 저장돼있고 1은 4바이트 짜리이므로 서로 더할 수 없음)
//		//int b2=b+1;		//이런 식으로 int형에 연산 결과를 넣으면 됨
//		//b=(byte)(b+1);	//data가 잘려도 강제로 넣어버리는 연산(강제 형변환 연산)
//		
//		
//		short s=122;	//2byte
//		
//		s = (short)(s+12);	//강제 형변환
//		int s1=s+12;
//		
//		int i=12345; //4 byte
//		long l=12990088; //8 byte
//		char c='x'; // 2 byte //글자 1개를 저장하는 데이터 타입
//		
//		//실수형	(실수형은 8바이트 짜리에 저장이 되어있음)
//		float f = 3.2f;	//실수 리터럴은 VM내부에서 8byte에 저장되어 있음 -> 4바이트라고 나타내기 위해 뒤에 f를 붙여줌
//		float f1=(float)3.2;
//		double d=3.14;
//		
//		System.out.println(flag);
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(c);
//        System.out.println(d);
//	}
//
//}
