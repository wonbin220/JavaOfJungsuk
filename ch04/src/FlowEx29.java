import java.util.Scanner;

public class FlowEx29 {

	public static void main(String[] args) {	
		for(int i=1;i<=100;i++) {
		System.out.printf("i=%d ", i);
		
		int tmp =i;
			
		do {    
			// tmp%10�� 3�� ������� Ȯ��(0 ����)
			if(tmp%10%3==0 && tmp%10 != 0) 
				System.out.print("¦");
		// tmp /= 10�� tmp = tmp / 10�� ����
		}while((tmp/=10) != 0);
		
		System.out.println("");
	}
  }
}
