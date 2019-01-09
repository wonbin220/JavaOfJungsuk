
public class OperatorEx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;  			
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		//int타입보다 범위가 더 넓은 float타입으로 일치시킨후 연산을 수행.
	}

}
