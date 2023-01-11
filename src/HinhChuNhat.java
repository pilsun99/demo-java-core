import java.util.Scanner;

public class HinhChuNhat {
    public float chieuDai;
    public float chieuRong;

    public void tinhToan1() {
        double CV, DT;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dai : ");
        this.chieuDai = scanner.nextInt();
        System.out.println("Nhập vào Chiều rộng : ");
        this.chieuRong = scanner.nextInt();

        CV = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi hcn la : " + Math.round(CV * 100.00) / 100.00);

        DT = (chieuDai * chieuRong);
        System.out.println("Dien tich hcn là :" + Math.round(DT * 100.00) / 100.00);

    }
}
