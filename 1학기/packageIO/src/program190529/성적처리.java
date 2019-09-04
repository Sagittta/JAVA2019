package program190529;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 성적처리 {
	static ArrayList<성적> 성적들 = new ArrayList();

	public static void main(String[] args) {
		//파일 연결
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			
			//버퍼 연결
			BufferedReader br = new BufferedReader(fr);
			
			//반복, 한 줄 읽기
			String line;
			while((line = br.readLine()) != null) {
				//이름	주소		수학		영어
				StringTokenizer st = new StringTokenizer(line, "\t");
				
				//새 객체 생성
				성적 new성적 = new 성적();
				new성적.setName(st.nextToken());
				new성적.setAddress(st.nextToken());
				new성적.setMath(Double.parseDouble(st.nextToken()));
				new성적.setEnglish(Double.parseDouble(st.nextToken()));
				
				//리스트에 만들어진 객체 생성
				성적들.add(new성적);
			}
			
			//리스트 출력
			for (성적 a : 성적들) {
				System.out.println(a);
			}
/*			for (int i = 0; i < 성적들.size(); i++) {
				System.out.println(성적들.get(i));
			}
*/
			//파일 저장
			//파일 연결
			FileWriter fw = new FileWriter("src/save.txt");
			
			//버퍼 연결
			BufferedWriter bw = new BufferedWriter(fw);
			
			//쓰기
			for (성적 a : 성적들) {
				bw.write(a.getName() + "\t" + a.getAddress() + "\t" + a.getMath() + "\t" 
						+ a.getEnglish() + "\t" + a.getTotal() + "\t" + a.getAverage());
				bw.newLine();			//bw.write("\n");
			}
			
			//닫기
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
