import java.io.File;
import java.io.FileInputStream;
public class main {
    public static void main(String args[]) throws Exception{

        int count =0;
        File file = new File("/Users/matuspasko/Desktop/matuspasko/week05/Normal Exam/src/main/java/rainydays.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int)file.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String [] data = s.split(" ");
        for (int i=0; i<data.length; i++) {
            count++;
        }
        System.out.println("Number of characters in the given file are " +count);
    }
}