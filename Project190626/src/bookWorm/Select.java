package bookWorm;

import java.util.*;

public class Select {
	public void selectDo() {
		System.out.println("<�ൿ>\n �˶� ���� : 1 \t �̵� �ð� ���� : 2 \t ���� ���� : 3 \t"
				+ "å�� ���� ���� : 4 \t ���� �ֱ� : 5 \t ���� : 0");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Select sl = new Select();
		Alarm a = new Alarm();
		MovingTime mt = new MovingTime();
		Taste t = new Taste();
		Level l = new Level();
		Star s = new Star();
		
		while (true) {
//			0�� ������ ����
//			1�� ������ �˶� ���� (�︱ �ð� �Է� -> �︱ �� �Է� -> 'n�� n�п� �˶��� �︳�ϴ�' ���)			*�߰��ϰ� ���� �κ� : '������ �ð����� n�ð� n�� ���ҽ��ϴ�' ���
//			2�� ������ �̵� �ð� ���� (���� �̵� �ð� �Է� -> 1�ð� �̻��� ��� -> å�� ���õ� ��Ʈ ���� ���)	*�߰��ϰ� ���� �κ� : ������ �����Ͽ� �������� ���� ���� ã�� �� �ְ�
//			5�� ������ ���� �ֱ� (���񽺿� �����ϴ��� �� �Է� -> 3�� �̸��� ��� ������ �� �ۼ� -> �ۼ� �ź� �� ����)
//			----------------------- ������� �����ߴٿ�
//			3�� ������ ���� ���� (���� ���� (10 ~ 60) -> ���� ���� (�����߹̿�) -> �۰� -> ���� ���� å ��õ)
//			4�� ������ å�� ���� ���� (å �д� �󵵼� ���� -> å�� �β� ���� -> ���� �´� ���� ��õ)
			
			sl.selectDo();
			int selectNum = sc.nextInt();
			if (selectNum == 0) break;
			
			switch (selectNum) {
			case 1 : 
				a.setAlarm();
				System.out.println(a.toString());
				break;

			case 2 :
				mt.setTime();
				break;
				
			case 3 :
				break;
				
			case 4 :
				break;
				
			case 5 :
				s.giveStar();
				break;
			}
		} //while ����
		
	}

}
