
public class VarEx3 {
	public static void main(String[] args) {
		final int score =  100;
//		score =  200;
//		System.out.println(score);
		boolean power = true;
		System.out.println(power);
		
		
		byte b = 127; // -128~127
		
		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������ 16

//		long l = 10_000_000_000; //���� 20���� �ѱ⶧����.
		long l = 10_000_000_000L; //
	
		 float f = 3.14f; //f���� �ȵ�.
		 double d = 3.14f; //doubleŸ���� floatŸ�Ժ��� ��ũ�⶧���� ����
		 
		System.out.println(b);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	//8������ 16������ ǥ���ϰ������ println��� printf ���
		
		char ch = 'A';
		//char ch = 'AB'; ->����
		//char ch = ''; ->����
		System.out.println(ch);
		
		int i = 'A';
		System.out.println(i);
		
		String str =""; // �� ���ڿ�(empty string)
		String str2 ="ABCD"; 
		String str3="123"; 
		String str4 = str2 + str3;
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
	}
}
