import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {		
		
		System.out.print("���� ���� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� month�� ����
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("������ ������ ���Դϴ�");
				break;
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�");
				break;
		
			case 9: case 10: case 11:
				System.out.println("������ ������ �����Դϴ�");
				break;
			default:	
			//case 12: case 1: case 2:
				System.out.println("������ ������ �ܿ��Դϴ�");
					
		}
		
/*		if (month == 3 || month == 4 || month == 5) {
			System.out.println("������ ������ ���Դϴ�");
		} else if(month == 6|| month == 7 || month == 8) {
			System.out.println("������ ������ �����Դϴ�");
		}else if(month == 9|| month == 10 || month == 11) {
			System.out.println("������ ������ �����Դϴ�");
		}else if(month == 12|| month == 1 || month == 2) {
			System.out.println("������ ������ �ܿ��Դϴ�");
		}*/
	}//������ ��
}
