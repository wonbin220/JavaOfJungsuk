
public class OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;  			
		byte c = (byte)(a*b);//  byte c= (byte)a+b로하면 에러, byte + int가 되어버림
		System.out.println(c);
	}

}
