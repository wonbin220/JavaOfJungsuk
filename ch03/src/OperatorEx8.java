
public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;  //1,000,000 1����
		int b = 2_000_000;  //2,000,000 2�鸸			
		long c = a * b ;      //a * b = 2,000,000,000,000 ??  
		System.out.println(c);
	}
	// int Ÿ�� * int Ÿ���� �������� intŸ��.
	// 1�鸸 * 2�鸸 �� intŸ�Կ��� �����÷ο�. intŸ���ǰ� -1454759936 �̹Ƿ� long������ �ڵ� ����ȯ
	// �ص� ���� ������ ����.
	// �ùٸ� ���� �������� ���� a �� b�� Ÿ���� 'long'���� ����ȯ.
	// long c = (long) a * b ;
	// -> long c = (long)1000000 * 2000000;
	// -> long c = 1000000L * 2000000;
	// -> long c = 1000000L * 2000000L;
	// -> long c = 2000000000000L;
}
