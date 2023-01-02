import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        int a, b, choose;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        do {
            System.out.println("1. tinh tong 2 so");
            System.out.println("2. tinh hieu 2 so");
            System.out.println("3. tính tích 2 so");
            System.out.println("4. tinh thuong 2 so");
            System.out.println("5. thoat chuong trinh");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("tong hai so la: " + (a + b));
                    break;
                case 2:
                    System.out.println("hieu hai so la: " + (a - b));
                    break;
                case 3:
                    System.out.println("tich 2 so la: " + (a * b));
                    break;
                case 4:
                    System.out.println("thuong 2 so la: " + (a / b));
                    break;

            }
            while (choose != 5);

    }
}


