package code;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineFile {
    public static void main(String[] args) {
        String fname = "D:\\MIRIM\\MIRIM2\\IN\\JAVA2\\IDEA Projects\\JAVA2019\\1학기\\src\\BufferInput.txt";
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            fr.close();
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
