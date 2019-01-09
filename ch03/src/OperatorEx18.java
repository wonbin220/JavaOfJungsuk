
public class OperatorEx18 {

	public static void main(String[] args) {
		double pi = 3.141592f;
		double shortPi = Math.round(pi * 1000) / 1000.0; 
		System.out.println(shortPi);
	}	
/*
 *  Math.round(pi * 1000) / 1000.0
 *  ->Math.round(3.141592 * 1000) / 1000.0
 *  ->Math.round(3141.592) / 1000.0    ==>  round메서드는 소수점 첫째자리엣 반올림하고 그 결과를 '정수'로 돌려주는 메서드
 *  ->3142 / 1000.0
 *  -> 3.142
 * */
}
