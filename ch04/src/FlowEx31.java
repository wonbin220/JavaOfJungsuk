import java.util.Scanner;

public class FlowEx31 {

	public static void main(String[] args) {	
		for(int i=0; i<=10;i++) {
			if(i%3==0)
				continue; // 조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동. break문과 달리 반복문을 벗어나지 않음
			System.out.println(i);
		}
  }
}
