import java.util.Scanner; // 1. import�� �߰�
public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. ScannerŬ������ ��ü ���� 
		Scanner scanner =  new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
//	
		//���δ����� �Է�
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
		
		System.out.println("���ڸ��� ������ �ϳ� �Է����ּ���.>");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է� ���� : " + input2 );
		System.out.printf("num=%d%n", num2);
	}

}
