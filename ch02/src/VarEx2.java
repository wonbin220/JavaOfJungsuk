
public class VarEx2 {
	public static void main(String[] args) {
		int x = 10, y = 6;
		int tmp;
		
		tmp = x; // 1. x�� ���� tmp�� ����
		x = y;	 // 2. y�� ���� x�� ����
		y = tmp; // 3. tmp�� ���� y�� ����
		
		System.out.println("x=" + x); 
		System.out.println("y=" + y); 
	
	}
}
