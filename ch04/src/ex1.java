

public class ex1 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
		
		int i = 0;
		int sum = 0;
		
		while(i<=10) {
			sum += ++i;
			
		}
		
		System.out.println(sum);
	}

}
