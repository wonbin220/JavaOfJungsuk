

public class ex2 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.


		
		int i = 0;
		int sum = 0;
		
		while(i<=10) {
			sum += ++i;
			
		}
		
		System.out.println(sum);
	}

}
