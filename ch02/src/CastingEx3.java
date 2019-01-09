
public class CastingEx3 {

	public static void main(String[] args) {
		
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;

		System.out.printf("f = %20.18f\n", f);
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
		
		double d3 = 1.0e100; // float의 최대값보다 큰 값을 d3에 저장(1.0*10의 100제곱)
		float f2 = (float)d3; // d3의값을 float로 형변환해서 f2에 저장. f2는 무한대가 된다.
		
		double d4 = 1.0e-50; // float의 최소값보다 작은 값을 d4에 저장(1.0*10의 -50제곱)
		float f3 = (float)d4;// f3의 값은 0이 된다.
		
		System.out.printf("f2 = %20.18f\n", f2);
		System.out.printf("f3 = %20.18f\n", f3);

	}

}
