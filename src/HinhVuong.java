import java.util.Scanner;

public class HinhVuong {
    public float canhHinhVuong;
    public void tinhToan3() {
        double CV, DT;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vao canh hinh vuong : ");
        this.canhHinhVuong = scanner.nextInt();

        CV = 4 * canhHinhVuong;
        System.out.println("Chu vi hình vuông la: " + Math.round(CV * 100.00) / 100.00);

        DT = canhHinhVuong * canhHinhVuong;
        System.out.println("Diện tích hình vuông la: " + Math.round(DT * 100.00)/100.00);
    }
}
