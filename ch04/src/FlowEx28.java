import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {	
		int input = 0,  answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);
		
		do {    // flag의 값이 true이므로 조건식은 참이된다.
			System.out.print("1과 100사의 정수를 입력하세요.>");
			input = scanner.nextInt();
					
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer){
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input!=answer);//while문의 끝
		
		System.out.println("정답!");
	}//메인의 끝
}
