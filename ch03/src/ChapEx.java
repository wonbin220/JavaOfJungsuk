
public class ChapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =2, y =5;
		char c = 'A'; // 'A'�� �����ڵ�� 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >=5 || x<0 && x >2);
		System.out.println(y += 10 - x++);
		System.out.printf("x= %d%n", x); // �� ���� �����Ȼ���? �ƹ��� ������ ������ ���״ٰ��Ͽ��� �ƿ� �������� �ٲ����?
		System.out.println(x +=2);
		System.out.println(!('A'<=c && c <= 'Z'));
		System.out.println('C'-c);
		System.out.println(c+1); // �׷� �̰��� �� �ȹٲ�°���?
		System.out.printf("c=%s%n", c);
		System.out.println(++c);
		System.out.printf("c=%s%n", c);
		System.out.println(c++);
		System.out.printf("c=%s%n", c);
		System.out.println(c);
		System.out.printf("c=%s%n", c);
		
	}

}
