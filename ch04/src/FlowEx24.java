public class FlowEx24 {

	public static void main(String[] args) {	
		int i =11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i-- != 0) {
			System.out.println(i);
			
			for(int j=0;j<2_000_000_000;j++) {
				; //아무런 내용도 없는 빈문장
			} //for(int j=0;j<2_000_000_000;j++); ->블럭내에 문장이 하나뿐일 때 괄호{}를 생략할수 있음
		}	  //for(int j=0;j<2_000_000_000;j++){} -> ';' 을 없앨수도 있음.
	}//메인의 끝
}
