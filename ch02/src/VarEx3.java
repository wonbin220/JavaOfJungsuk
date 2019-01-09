
public class VarEx3 {
	public static void main(String[] args) {
		final int score =  100;
//		score =  200;
//		System.out.println(score);
		boolean power = true;
		System.out.println(power);
		
		
		byte b = 127; // -128~127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16

//		long l = 10_000_000_000; //에러 20억을 넘기때문에.
		long l = 10_000_000_000L; //
	
		 float f = 3.14f; //f생략 안됨.
		 double d = 3.14f; //double타입이 float타입보다 더크기때문에 가능
		 
		System.out.println(b);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	//8진수나 16진수로 표현하고싶으면 println대신 printf 사용
		
		char ch = 'A';
		//char ch = 'AB'; ->에러
		//char ch = ''; ->에러
		System.out.println(ch);
		
		int i = 'A';
		System.out.println(i);
		
		String str =""; // 빈 문자열(empty string)
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
