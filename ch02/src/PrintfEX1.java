
public class PrintfEX1 {
	
	public static void main(String[] args) {
//		System.out.println(10.0/3);
		System.out.println();
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15); //접두사를 보이게하려면 #을 붙여야함
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
		
		int octNum = 010;  // 8진수 10, 10진수로는 8 
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2 
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		System.out.printf("[%5d]%n", 1234567); 
		//5자리지만 짤려나오는것이 아니라 저장한숫자는 7자리이기때문에 지정한 값(5) 상관없이 7자리 다나옴
		
		double d = 1.23456789;
		System.out.printf("%.6f", d);
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
		
	}
}
