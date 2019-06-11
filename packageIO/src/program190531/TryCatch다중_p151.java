package program190531;

public class TryCatch다중_p151 {

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
		}
	}

}
