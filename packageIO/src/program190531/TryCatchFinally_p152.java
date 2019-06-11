package program190531;

public class TryCatchFinally_p152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] irum = new String[3];
		irum[0] = "이채린";
		irum[1] = "원채린";
		irum[2] = "장원이";
		
		try {
			for (int i = 0; i <= irum.length; i++) {
				System.out.println(irum[i]);
			}			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("익셉션");
		} finally {
			System.out.println("무조건 실행합니다...");
		}
	}

}
