
public class OperatorEx15 {

	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32); //char형과 int형간의 뺄셈연산결과는 int형이므로, 연산 후 char형으로 다시 형변환을 잊지 말자
		
		System.out.println(upperCase);
	}	
}
