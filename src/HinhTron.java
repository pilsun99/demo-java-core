import java.util.Scanner;

public class HinhTron {
    public float banKinh;
    public static final float SO_PI = 3.14f;
    public void tinhtoan2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kinh : ");
        this.banKinh = scanner.nextInt();
        double CV, DT;

        CV = 2 * banKinh * SO_PI;
        System.out.println("Chu vi hình tròn là : " + Math.round(CV * 100.00)/100.00);

        DT = SO_PI * banKinh * banKinh;
        System.out.println("Diện tích hình tròn là : " + Math.round(DT * 100.00)/100.00);
    }
}
