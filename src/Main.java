import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ASUS\\Desktop\\New Text Documents.txt");
            int data = 0;
            while((data = fileInputStream.read()) != -1) {
                System.out.println((char) data);
            }
            fileInputStream.close();

        }catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
