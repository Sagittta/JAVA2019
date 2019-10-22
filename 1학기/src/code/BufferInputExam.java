package code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferInputExam {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = in.readLine();      // 한 줄씩 불러옴. 근데 한 줄만 받으니까 종료됨.
        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }
        System.out.println(s);
    }
}
