
public class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a'; // c1���� ���� 'a'�� �ڵ尪�� 97�� ����
		char c2 = c1;  // c1�� ����Ǿ� �ִ� ���� c2�� ����
		char c3 = ' '; // c3�� �������� �ʱ�ȭ
		
		int i = c1 + 1; // 'a'+1 => 97+1 ->98
		
		c3 = (char)(c1 + 1); // �������� c1+1�� ����� int�̹Ƿ� �� ����� char�� ����c3 ������ؼ��� char������ ����ȯ�� �ʿ�
		
		c2++; // c2=c2+1;�� ����ϸ� ������ �߻��� ��. c2+1�� �������� int���̸�, �� ����� �ٽ� c2�� �������� ����ȯ �����ڸ�
		c2++; // ����Ͽ� char������ ����ȯ�ؾ� �ϱ� ����
		
		System.out.println("i=" + i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	
		
	}
}
