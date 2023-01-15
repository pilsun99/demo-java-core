import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Cho Husky = new Cho("USA", "gray", 4, 1000);
        Cho Kien = new Cho("VN", "black", 5, 200);
        Cho Laika = new Cho("Russia", "white", 6, 800);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chọn chú chó mà bạn muốn mua :");
            System.out.println("1. Chó Husky");
            System.out.println("2. Chó Kiến");
            System.out.println("3. Chó Laika");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Origin : " + Husky.origin);
                    System.out.println("Color : " + Husky.furColor);
                    System.out.println("Age(Months) : " + Husky.age);
                    System.out.println("Price($) : " + Husky.price);
                    break;
                case 2:
                    System.out.println("Origin : " + Kien.origin);
                    System.out.println("Color : " + Kien.furColor);
                    System.out.println("Age(Months) : " + Kien.age);
                    System.out.println("Price($) : " + Kien.price);
                    break;
                case 3:
                    System.out.println("Origin : " + Laika.origin);
                    System.out.println("Color : " + Laika.furColor);
                    System.out.println("Age(Months) : " + Laika.age);
                    System.out.println("Price($) : " + Laika.price);
                    break;
            }
        }while (choice!=3);
    }
}
