
public class CastingEx3 {

	public static void main(String[] args) {
		
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;

		System.out.printf("f = %20.18f\n", f);
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
		
		double d3 = 1.0e100; // float�� �ִ밪���� ū ���� d3�� ����(1.0*10�� 100����)
		float f2 = (float)d3; // d3�ǰ��� float�� ����ȯ�ؼ� f2�� ����. f2�� ���Ѵ밡 �ȴ�.
		
		double d4 = 1.0e-50; // float�� �ּҰ����� ���� ���� d4�� ����(1.0*10�� -50����)
		float f3 = (float)d4;// f3�� ���� 0�� �ȴ�.
		
		System.out.printf("f2 = %20.18f\n", f2);
		System.out.printf("f3 = %20.18f\n", f3);

	}

}
