package bookWorm;

import java.util.*;

public class Star {
	Scanner sc = new Scanner(System.in);
	
	int star;
	String text;
	
	public void giveStar() {
		System.out.print("���񽺿� �������� ���� ���� ������ �Է����ּ���.(1~5) : ");
		star = sc.nextInt();
		if (star < 6 && star > 0) {
			for (int i = 0; i < star; i++)
				System.out.print("��");
			System.out.println("");
		} else {
			System.out.println("1 ~ 5�� �ٽ� �Է��� �ּ���.");
			star = sc.nextInt();
			if (star < 6 && star > 0) {
				for (int i = 0; i < star; i++)
					System.out.print("��");
				System.out.println("");
			}
			else	System.out.println("���α׷��� ����˴ϴ�. �ٽ� �������ּ���.");
		}
			
		if (star < 3) {
			System.out.println("�����մϴ�.");
			writeMore();
		} else	System.out.println("�����մϴ�. �� ������ �ϰڽ��ϴ� !!");
	}
	
	public void writeMore() {
		System.out.println("�� ���� ���α׷��� ���� ������ ���� �Է����ּ���. (�Է� : 1, ���� : 0)");
		int a = sc.nextInt();
		switch (a) {
		case 0 : 
			System.out.println("�����մϴ�.");
			break;
		case 1 : 
			text = sc.next();
			System.out.println("�����մϴ�. ������ �����ϰڽ��ϴ�.");
			break;
		default :
			System.out.println("���α׷� �����մϴ�. �����մϴ�.");
			break;
		}
	}

}
