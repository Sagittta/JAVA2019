package bookWorm;

import java.util.*;

public class MovingTime {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int time;
	String text[] = {"å�� �Բ� �� ������ ������.", "å�� ì�⼼��.", "å�� �Բ���� ������ �� �� �־��.", "å�� �ʿ��ؿ�.", "����ִ� å�б�", "�ð��� ��½ ���� å �б�", 
			"ååå ååå ���� ��� �Ҹ� å�� ��������� �Ҹ�", "�ϺϺϺϺϺ� ���� �ܴ� �Ҹ� å ���������� �غ��ϴ� �Ҹ�", "��å��å��åå ���ϴ� �Ҹ� å�� �аڴٴ� �Ҹ�", "å���� ���� ����־��?"};
	
	public void setTime() {
		int randomText = r.nextInt(10);
		
		System.out.println("���� �̵� �ð��� �Է��ϼ���.(����:��) : ");
		time = sc.nextInt();
		if (time > 60) 	System.out.println(text[randomText]);
		else System.out.println("���� å�̳� ������ ì��� ���� ��õ�ؿ�.");
	}
	
}
