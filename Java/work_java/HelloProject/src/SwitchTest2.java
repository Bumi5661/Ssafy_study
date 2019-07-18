
public class SwitchTest2 {

	public static void main(String[] args) {
		
		char code='y';
		switch (code) { //score자리에는 byte,int,short,char 즉 long을 제외한 정수형만 올 수 있다! + String도 가능!!	//score 값에 따라 각 케이스가 선택됨
			case 'X':	//code라는 값이 대문자로 들어오건 소문자로 들어오건 상관없이 처리하고 싶으면 다음과 같이 사용하면 된다
			case 'x':
				System.out.println("class-1");
				break;
			case 'Y':
			case 'y':
				System.out.println("class-2");
				break;
			case 'Z':
			case 'z':
				System.out.println("class-3");
				break;
	
			default:
				System.out.println("class-4");
				break;
		}
	}

}
