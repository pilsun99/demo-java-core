import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        int a, b, choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        a = scanner.nextInt();
        System.out.println("Please enter second number");
        b = scanner.nextInt();
        do {
            System.out.println("1. Tính tổng hai số và in ra màn hình");
            System.out.println("2. Tính hiệu hai số và in ra màn hình");
            System.out.println("3. Tính tích hai số và in ra màn hình");
            System.out.println("4. Tính tích hai số và in ra màn hình");
            System.out.println("5. Thoát chương trình");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Tổng hai số la: " + (a + b));
                    break;
                case 2:
                    System.out.println("Hiệu hai số là: " + (a - b));
                    break;
                case 3:
                    System.out.println("Tích hai số là: " + (a * b));
                    break;
                case 4:
                    System.out.println("Thương hai số là: " + (a / b));
            }
        }while (choose!=5);
    }
}
