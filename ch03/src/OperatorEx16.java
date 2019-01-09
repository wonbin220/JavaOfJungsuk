
public class OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f; 
		System.out.println(shortPi);
	}	
/* int형간의 나눗셈 'int/int'를 수행하면 결과가 float나 double이 아닌 int임에 주의!
 * 나눗셈의 결과를 반올림 하는 것이 아니라 버린다는 점도 꼭 기억!. 예를들어 '3/2'의 결과는 1.5 또는 2가 아니라 1.
 * 
 * 괄호안의 pi *1000가 먼저 수행되는데 pi가 float이고 1000이 정수형이니 연산의 결과는 float인 3141.592f가 됨
 * (int)(3141.592f) / 1000f;
 * 
 * 그다음으로 단항연산자인 형변환 연산자의 형변환이 수행. 3141.592f를 int로 변환하면 3141를 얻는다. 소수점 이하는 반올림 없이 버려짐
 * 
 *  3141/1000f;는 int와 float의 연산이므로 int가 float로 변환된 다음 float와 float의 연산이 수행됨
 *  
 * 3141.0f/ 1000f -> 3.141f 
 * 즉  float와 float의 나눗셈으로 결과는 3.141f가 됨.
 * 
 * 참고로 1000f는 1000.0f와 같다
 * 
 * */	
}
