
public class ChapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =2, y =5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >=5 || x<0 && x >2);
		System.out.println(y += 10 - x++);
		System.out.printf("x= %d%n", x); // 왜 값이 증가된상태? 아무리 위에서 증가를 시켰다고하여도 아예 변수값이 바뀌는지?
		System.out.println(x +=2);
		System.out.println(!('A'<=c && c <= 'Z'));
		System.out.println('C'-c);
		System.out.println(c+1); // 그럼 이값은 왜 안바뀌는건지?
		System.out.printf("c=%s%n", c);
		System.out.println(++c);
		System.out.printf("c=%s%n", c);
		System.out.println(c++);
		System.out.printf("c=%s%n", c);
		System.out.println(c);
		System.out.printf("c=%s%n", c);
		
	}

}
