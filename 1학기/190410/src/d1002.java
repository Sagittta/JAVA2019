import java.io.IOException;

public class d1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bt;
		try {									//이거 실행해 ~
			bt = System.in.read();
			System.out.println(bt);				//int 값으로 출력(아스키코드)
			System.out.println((char)bt);		//char 값으로 출력
		} catch (IOException e) {				//이런 에러가 발생했을 때 너가 잡아서 해결해 ~
			e.printStackTrace();
		}
	}

}
