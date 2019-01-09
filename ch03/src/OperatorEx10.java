
public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000 ;  
		
		int result1 = a * a / a; // 1000000 * 1000000 / 1000000
		int result2 = a / a * a; // 1000000 / 1000000 * 1000000
		  
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);

	}
//	1000000 * 1000000 / 1000000 = -727
//	1000000 / 1000000 * 1000000 = 1000000
	//이처럼 같은 의미의 식이라도 연산의 순서에 따라서 다른 결과를 얻을 수 있다는 것에 주의!
}
