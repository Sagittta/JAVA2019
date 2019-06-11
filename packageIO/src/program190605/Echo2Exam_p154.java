package program190605;

import java.io.IOException;
import java.io.InputStream;

public class Echo2Exam_p154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		
		while (true) {
			int i;
			try {
				i = is.read();
				if (i == -1)
					break;
				System.out.println((char)i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
