import java.io.IOException;

public class d1002_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bt;
		try {
			while((bt = System.in.read()) != -1) {
				System.out.println((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
