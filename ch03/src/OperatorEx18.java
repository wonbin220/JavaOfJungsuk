
public class OperatorEx18 {

	public static void main(String[] args) {
		double pi = 3.141592f;
		double shortPi = Math.round(pi * 1000) / 1000.0; 
		System.out.println(shortPi);
	}	
/*
 *  Math.round(pi * 1000) / 1000.0
 *  ->Math.round(3.141592 * 1000) / 1000.0
 *  ->Math.round(3141.592) / 1000.0    ==>  round�޼���� �Ҽ��� ù°�ڸ��� �ݿø��ϰ� �� ����� '����'�� �����ִ� �޼���
 *  ->3142 / 1000.0
 *  -> 3.142
 * */
}
