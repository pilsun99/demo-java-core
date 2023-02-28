package StreamIO;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Scanner;

public class FileDownload {
    public static void main(String[] args) {
        String link = null;
        int data = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vui lòng nhập vào đường dẫn vào đây");
        link = scanner.nextLine();
        try {
            URL url = new URL(link);
            BufferedInputStream fileInputStream = new BufferedInputStream(url.openStream());
            String splitLinks[] = link.split("\\/");
            String name = splitLinks[splitLinks.length - 1];
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\"+ name);
            while ((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
