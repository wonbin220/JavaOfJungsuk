import java.util.Scanner;

public class FlowEx26 {

	public static void main(String[] args) {	
		int i = 0, sum = 0;
		
		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	}//������ ��
}
