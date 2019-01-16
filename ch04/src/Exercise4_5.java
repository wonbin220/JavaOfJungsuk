
public class Exercise4_5 {

	public static void main(String[] args) {
		//다음의 for문을 while문으로 변경하시오.
		
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//			System.out.print("*");
//			System.out.println();
//		}
		int i = 0;
		int j=0;
		
		while(i<=10) {
			//System.out.println(i);
			i++;

			while(j<=i) {
				//System.out.println(j);
				System.out.print("*");
			
				j++;
				System.out.println();
			}
			
		}
		
	}
}
