package program190531;

public class Throws_p153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws_p153 ts = new Throws_p153();
		try {
			arrayMethod();			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ͼ���");
		}
	}
	
	public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
		String[] irum = new String[3];
		irum[3] = "ȫ�浿";
	}

}
