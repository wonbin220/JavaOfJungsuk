import java.util.Scanner;

public class FlowEx26 {

	public static void main(String[] args) {	
		int i = 0, sum = 0;
		
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	}//메인의 끝
}
