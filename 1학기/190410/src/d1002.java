import java.io.IOException;

public class d1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bt;
		try {									//�̰� ������ ~
			bt = System.in.read();
			System.out.println(bt);				//int ������ ���(�ƽ�Ű�ڵ�)
			System.out.println((char)bt);		//char ������ ���
		} catch (IOException e) {				//�̷� ������ �߻����� �� �ʰ� ��Ƽ� �ذ��� ~
			e.printStackTrace();
		}
	}

}
