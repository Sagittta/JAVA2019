package code;

import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream fis = new FileInputStream("D:\\MIRIM\\MIRIM2\\IN\\JAVA2\\IDEA Projects\\JAVA2019\\1학기\\src\\tin.txt");
        FileOutputStream fos = new FileOutputStream("D:\\MIRIM\\MIRIM2\\IN\\JAVA2\\IDEA Projects\\JAVA2019\\1학기\\src\\tout.txt");

        fis.read(b);            // tin.txt 에 있는 값을 b에 저장함.
        fos.write(b);           // b에 있는 값을 tout.txt 에 넣음.
        fis.close();
        fos.close();

    }
}
