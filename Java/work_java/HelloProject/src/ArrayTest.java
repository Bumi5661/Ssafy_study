
public class ArrayTest {

	public static void main(String[] args) {
		int a;	//기본형은 선언만 해도 메모리에 등록이됨(생성되는 시점)  하지만 기본형은 default 값이 없음
		int[] b;	//b는 이름만 등록이 되고 아직 자리를 잡고 생성되는것은 아님(생성되는 시점)  그래서 배열은 new를 해줘야함
		int[] score = new int[100];
		double[] point = new double[200];
		boolean[] flag = new boolean[55];
		String[] name =new String[30];
		
		System.out.println(score[33]);
		System.out.println(point[22]);
		System.out.println(flag[8]);
		System.out.println(name[13]);
		
	}

}
