import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {		
		int score = 0; 
		char grade = ' ', opt = '0'; 
		
		System.out.print("���� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		System.out.printf("����� ������ %d�Դϴ� %n", score);
		
		if(score >= 90) {          // score�� 90�� ���� ���ų� ũ�� A����(grade)
			grade = 'A';
			if (score >= 98) {     // 90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';
			} else if(score < 94) {  // 90�� �̻� 94���̸��� A-
				opt = '-';
			}
		}else if(score >= 80) {    // score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = 'B';
			if (score >= 88) {     // 
				opt = '+';
			} else if(score < 84) {  // 
				opt = '-';
			}
		}else if(score >= 70) {    // score�� 70�� ���� ���ų� ũ�� C����(grade)
			grade = 'C';
			if (score >= 78) {     // 
				opt = '+';
			} else if(score < 74) {  // 
				opt = '-';
			}
		} else {				   // �������� D����
			grade = 'D';          
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}//������ ��

}
