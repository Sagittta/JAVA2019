import java.util.*;

public class d04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threec[] = {"������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", "������", "��ä��", "�̼���", "��ä��", "������", "������", "������", "�����", "�Ѵٿ�"};
		String fourc[] = {"������", "������", "�����", "�躽��", "�����", "��ä��", "������", "�ڼ���", "������", "��ä��", "�����", "���ϴ�", "��ä��", "������", "", "������", "������", "������", "������"};
		
		for (int i = 0; i < threec.length; i++) {
			System.out.println(threec[i]);
		}
		System.out.println("===");
		for (int i = 0; i < fourc.length; i++) {
			System.out.println(fourc[i]);
		}
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �Է��ϼ��� ^!^");
			int c = sc.nextInt();
			
			if (c == 4) {
				System.out.println("��ȣ�� �Է��ϼ��� ~!~");
				int num = sc.nextInt();
				if (1 <= num && num <= fourc.length) {
					System.out.println(fourc[num-1]);
				}
//				if (num == 1) {
//					System.out.println("������");
//				} else if (num == 2) {
//					System.out.println("������");
//				} else if (num == 3) {
//					System.out.println("�����");
//				} else if (num == 4) {
//					System.out.println("�躽��");
//				} else if (num == 5) {
//					System.out.println("�����");
//				} else if (num == 6) {
//					System.out.println("��ä��");
//				} else if (num == 7) {
//					System.out.println("������");
//				} else if (num == 8) {
//					System.out.println("�ڼ���");
//				} else if (num == 9) {
//					System.out.println("������");
//				} else if (num == 10) {
//					System.out.println("��ä��");
//				} else if (num == 11) {
//					System.out.println("�����");
//				} else if (num == 12) {
//					System.out.println("���ϴ�");
//				} else if (num == 13) {
//					System.out.println("��ä��");
//				} else if (num == 14) {
//					System.out.println("������");
//				} else if (num == 16) {
//					System.out.println("������");
//				} else if (num == 17) {
//					System.out.println("������");
//				} else if (num == 18) {
//					System.out.println("������");
//				} else if (num == 19) {
//					System.out.println("������");
//				} else {
//					System.out.println("�л� ������ �����ϴ�.");
//				}
			} else if(c == 3) {
				System.out.println("��ȣ�� �Է��ϼ��� ~!~");
				int num = sc.nextInt();
				if (1 <= num && num <= threec.length) {
					System.out.println(threec[num-1]);
				}
			} else {
				System.out.println("������ �����ϴ�.");
				break;
			}
		}
	}

}
