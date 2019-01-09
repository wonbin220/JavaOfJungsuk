
public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;  
		long b = 1_000_000 * 1_000_000L;  			
		  
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
  // long a 의 값은 a=-727379968인데 int타입 * int타입의 연산결과는 int타입이기때문에 오버플로우 되어버려서
  // 이미 오버플로우 발생한 값을 아무리 long타입의 변수에 저장하여도 소용이 없다.
}
