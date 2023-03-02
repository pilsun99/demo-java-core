import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4){
            System.out.println("Menu");
            System.out.println("1. Tìm kiếm bằng tên");
            System.out.println("2. Hiển thi theo danh sách ");
            System.out.println("3. Tính tong tien hang");
            System.out.println("4. Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên cần tìm");
                    String nameSearch = scanner.next();
                    Product product = productManager.oderByName(nameSearch);
                    if (product != null) {
                        System.out.println(product.getId() + product.getName() + product.getPrice() + product.getQuantity());
                    }else {
                        System.out.println("Không tim thấy san pham");
                    }
                    break;
                case 2:
                    ArrayList<Product> list = productManager.getList();
                    for (Product product1 : list)
                          {
                             System.out.println(product1.getId() + " | " + product1.getName() + " | " + product1.getPrice() + " | " + product1.getQuantity());
                    }
                    break;
                case 3:
                    System.out.println("Nhập ID các sản phẩm cần tính");
                    int id = scanner.nextInt();
                    ArrayList<Product> list1 = productManager.getList();
                    for (Product product2 : list1
                    ) {if(product2.getId() == id){

                        System.out.println(product2.sumPrice());;
                    }else {
                        System.out.println("Nhap sai");
                    }
                    }
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không đúng");
                    break;

            }
        }

    }
}
