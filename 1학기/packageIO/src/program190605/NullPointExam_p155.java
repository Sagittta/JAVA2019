package program190605;

public class NullPointExam_p155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println("문자열: " + str.length());
		} catch(NullPointerException e) {
			System.out.println("불가능");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("완료");
	}

}
