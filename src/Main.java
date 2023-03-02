import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Tìm kiếm bằng tên");
            System.out.println("2. Hiển thi theo danh sách ");
            System.out.println("3. Tính tổng tiền hàng");
            System.out.println("4. Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên cần tìm");
                    String nameSearch = scanner.next();
                    Product product = productManager.findByName(nameSearch);
                    if (product != null) {
                        System.out.println(product.getId() + product.getName() + product.getPrice() + product.getQuantity());
                    } else {
                        System.out.println("Không tim thấy san pham");
                    }
                    break;
                case 2:
                    ArrayList<Product> list = productManager.getList();
                    for (Product product1 : list) {
                        System.out.println(product1.getId() + " | " + product1.getName() + " | " + product1.getPrice() + " | " + product1.getQuantity());
                    }
                    break;
                case 3:
                    System.out.println("Nhập ID các sản phẩm cần tính");
                    int id = scanner.nextInt();
                    System.out.println("TỔng tiền hàng sp có id " + id + " là: " + productManager.calculateSum(id));
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
