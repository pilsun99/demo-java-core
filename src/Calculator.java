import java.util.Scanner;

public class Calculator {
    public float num1;
    public float num2;
    public char kt;
    public void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số thứ nhất: ");
        this.num1 = scanner.nextInt();
        System.out.println("nhập vào số thứ 2 : ");
        this.num2 = scanner.nextInt();
        do {
            System.out.println("Nhập phép toán (+,-,*,/): ");
            kt = scanner.next().charAt(0);
            switch (kt) {
                case '+':
                    System.out.println((num1 + num2));
                    break;
                case '-':
                    System.out.println((num1 - num2));
                    break;
                case '*':
                    System.out.println((num1 * num2));
                case '/':
                    if (num2 == 0) {
                        System.out.println("Số bị chia phải khác 0 ");
                    } else {
                        System.out.println((num1 / num2));
                    }
                    break;
            }
        }while (scanner.hasNextInt());
    }
}
