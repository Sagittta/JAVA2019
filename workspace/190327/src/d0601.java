
public class d0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "mirim";				//���� �ٲ��� ����
		String str2 = "mirim";
		String str3 = new String("mirim");		
		String str4 = new String("mirim");		
		
		if (str1 == str2) {
			System.out.println("�ּ� ����");
		} else {
			System.out.println("�ּ� �ٸ���");
		}
		
		if (str3 == str4) {
			System.out.println("�ּ� ����");
		} else {
			System.out.println("�ּ� �ٸ���");
		}
		
		if (str1.equals(str2)) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �ٸ���");
		}
		
		if (str3.equals(str4)) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �ٸ���");
		}
		
		System.out.println("==============");
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));			//index 2/ r���
		System.out.println(String.valueOf(123));		//123�̶�� ������ String����
		System.out.println("  Happy Programming! ".trim());				//���� ����		//strip(Python)
		System.out.println("2417".substring(2, 4));			//2<= n <4		//slicing(Python)
		System.out.println("2417".substring(1, 2));
		System.out.println("2417".charAt(1));
	}

}
