package StreamIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamCopyFile {
    public static void main(String[] args) {
        String path = null;
        int data = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập đường dẫn vào đây");
        path = scanner.nextLine();
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File không tồn tại");
            System.exit(1);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String [] pathSplit = path.split("\\.");
            FileOutputStream fileOutputStream = new FileOutputStream(pathSplit[0]+"-copy."+pathSplit[1]);
            while ((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
