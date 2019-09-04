package program190524;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SungDatasExam {

	public static void main(String[] args) {
		// 파일 연결(writed.txt)
		FileReader fr;
		
		try {
			fr = new FileReader("src/writed.txt");
			//버퍼 연결(readLine())
			BufferedReader br = new BufferedReader(fr);
			//한 줄 읽고, \t로 연결
			String csvStr = "";			//모든 내용 \t로 연결한 String
			String tmpStr = "";			//한 줄 읽기용 임시 String
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t";
			}
//			System.out.println(csvStr);
			//token으로 나누어 데이터 저장
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			int length = parse.countTokens() / 4;
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			for(int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken());	//String->double
				english[i] = Double.parseDouble(parse.nextToken());
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2;
			}
			for (int i = 0; i < length; i++) {
			System.out.println("이름 : " + name[i] + ", 주소 : " + address[i] 
					+ ", 수학 : " + math[i] + ", 영어 : " + english[i]
							+ ", 총점 : " + total[i] + ", 평균 : " + avg[i]);
			}
			//total, average 계산
			//출력
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
