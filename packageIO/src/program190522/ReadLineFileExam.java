package program190522;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� �а� ��������
//		���� �а� ��������
//		���� ����
//		ȭ�鿡 �������
		FileReader fr;
		try {
			fr = new FileReader("src/datar.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
