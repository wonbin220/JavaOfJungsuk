import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {	
		int input = 0,  answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1 ~ 100 ������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);
		
		do {    // flag�� ���� true�̹Ƿ� ���ǽ��� ���̵ȴ�.
			System.out.print("1�� 100���� ������ �Է��ϼ���.>");
			input = scanner.nextInt();
					
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if(input < answer){
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input!=answer);//while���� ��
		
		System.out.println("����!");
	}//������ ��
}
