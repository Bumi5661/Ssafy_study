
public class SwitchTest {

	public static void main(String[] args) {
		int score=90;
		
		switch (score) { //score자리에는 byte,int,short,char 즉 long을 제외한 정수형만 올 수 있다! + String도 가능!!	//score 값에 따라 각 케이스가 선택됨
			case 100:
				System.out.println("class-1");
				break;
				
			case 90:
				System.out.println("class-2");
				break;
				
			case 80:
				System.out.println("class-3");
				break;
	
			default:
				System.out.println("class-4");
				break;
		}
	}

}
