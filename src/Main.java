import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Tính chu vi và diện tích hình chu nhật");
            System.out.println("2.Tính chu vi và diện tích hình tròn");
            System.out.println("3.Tính chu vi và diện tích hình vuông");
            System.out.println("4.Thoát chương trình");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    HinhChuNhat cvdthcn = new HinhChuNhat();
                    cvdthcn.tinhToan1();
                    break;
                case 2:
                    HinhTron cvdtht = new HinhTron();
                    cvdtht.tinhtoan2();
                    break;
                case 3:
                    HinhVuong cvdthv = new HinhVuong();
                    cvdthv.tinhToan3();
                    break;
            }

        }while (choice!=4);
    }
}
