
public class OperatorEx17 {

	public static void main(String[] args) {
		double pi = 3.141592f;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0; 
		System.out.println(shortPi);
	}	
//1000.0이 아닌 1000으로 나눴다면 3.142가 아닌 3이란 결과를 얻었을 것
}
