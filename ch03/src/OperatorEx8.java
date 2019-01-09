
public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;  //1,000,000 1벡만
		int b = 2_000_000;  //2,000,000 2백만			
		long c = a * b ;      //a * b = 2,000,000,000,000 ??  
		System.out.println(c);
	}
	// int 타입 * int 타입의 연산결과는 int타입.
	// 1백만 * 2백만 은 int타입에서 오버플로우. int타입의값 -1454759936 이므로 long형으로 자동 형변환
	// 해도 값은 변하지 않음.
	// 올바른 값을 얻으려면 변수 a 나 b의 타입을 'long'으로 형변환.
	// long c = (long) a * b ;
	// -> long c = (long)1000000 * 2000000;
	// -> long c = 1000000L * 2000000;
	// -> long c = 1000000L * 2000000L;
	// -> long c = 2000000000000L;
}
