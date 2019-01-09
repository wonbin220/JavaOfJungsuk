
public class PrintfEX1 {
	
	public static void main(String[] args) {
//		System.out.println(10.0/3);
		System.out.println();
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15); //���λ縦 ���̰��Ϸ��� #�� �ٿ�����
		System.out.printf("%#x%n", 15);
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
//		float f = 123.456789f;
		double f = 123.456789f;
		System.out.printf("%f%n",f);
		System.out.printf("%e%n",f);
		System.out.printf("%g%n",f);
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger =  10;
		long big = 100_000_000L; // long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;  // 8���� 10, 10�����δ� 8 
		int hexNum = 0x10; // 16���� 10, 10�����δ� 16
		int binNum = 0b10; // 2���� 10, 10�����δ� 2 
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'�� ���λ�(16���� 0x, 8���� 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		System.out.printf("[%5d]%n", 1234567); 
		//5�ڸ����� ©�������°��� �ƴ϶� �����Ѽ��ڴ� 7�ڸ��̱⶧���� ������ ��(5) ������� 7�ڸ� �ٳ���
		
		double d = 1.23456789;
		System.out.printf("%.6f", d);
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
		
	}
}
