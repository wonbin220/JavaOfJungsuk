
public class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a'; // c1에는 문자 'a'의 코드값인 97이 저장
		char c2 = c1;  // c1에 저장되어 있는 값이 c2에 저장
		char c3 = ' '; // c3을 공백으로 초기화
		
		int i = c1 + 1; // 'a'+1 => 97+1 ->98
		
		c3 = (char)(c1 + 1); // 덧셈연산 c1+1의 결과가 int이므로 이 결과를 char형 변수c3 담기위해서는 char형으로 형변환이 필요
		
		c2++; // c2=c2+1;을 사용하면 에러가 발생할 것. c2+1의 연산결과는 int형이며, 그 결과를 다시 c2에 담으려면 형변환 연산자를
		c2++; // 사용하여 char형으로 형변환해야 하기 때문
		
		System.out.println("i=" + i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	
		
	}
}
