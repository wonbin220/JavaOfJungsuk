import java.util.Scanner; // 1. import문 추가
public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Scanner클래스의 객체 생성 
		Scanner scanner =  new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
//	
		//라인단위로 입력
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
		
		System.out.println("두자리의 정수를 하나 입력해주세요.>");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력 내용 : " + input2 );
		System.out.printf("num=%d%n", num2);
	}

}
