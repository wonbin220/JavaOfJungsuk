import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int sum = 0; //������ �����ϱ� ���� ����
		float average = 0; //����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];  // �ݺ����� �̿��ؼ� �迭�� ����Ǿ� �ִ� ������ ��� ����.
		}
		
		average = sum / (float)score.length; // ������� float�� ��� ���ؼ� ����ȯ
		
		System.out.println("���� : " + sum); 
		System.out.println("��� : " + average); 
	} //main
}
