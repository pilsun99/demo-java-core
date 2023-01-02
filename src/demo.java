import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so vao day");
        a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " la so chan");
        } else {
            System.out.println(a + " la so le");
        }
        }
}
