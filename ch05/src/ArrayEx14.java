import java.util.Arrays;

public class ArrayEx14 {

	public static void main(String[] args) {		
		String src = "ABCDE";
		
		for(int i =0;i<src.length();i++) {
			char ch = src.charAt(i);  // src�� i��° ���ڸ� ch�� ����
			System.out.println("src.charAt("+i+"):"+ch);
		}
		// String�� char[]�� ��ȯ
		char[] chArr = src.toCharArray();
		
		//char�迭(chart[])�� ���
		System.out.println(chArr);
	} //end of main
}//end of class
