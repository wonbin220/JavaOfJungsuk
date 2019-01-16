

public class ex2 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.


		
		int i = 0;
		int sum = 0;
		
		while(i<=10) {
			sum += ++i;
			
		}
		
		System.out.println(sum);
	}

}
