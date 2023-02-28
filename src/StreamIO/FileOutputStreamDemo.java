package StreamIO;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\demo-fileoutput.txt");
            fileOutputStream.write("Hello World!".getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
