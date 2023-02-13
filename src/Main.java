import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = new Account[3];
        for (int i = 0; i < 3; i++) {
            accounts[i] = new Account();
        }
        accounts[0].username = "Tuan";
        accounts[0].password = "123";
        accounts[0].amount = 100000;
        accounts[1].amount = 10000;
        accounts[1].username = "Luan";
        accounts[1].password = "123";
        accounts[2].username = "Nam";
        accounts[2].password = "123";
        accounts[2].amount = 50000;
        if (login(accounts)){
            System.out.println("Dang nhap thanh cong");
        }else
            System.out.println("Dang nhap khong thanh cong");
        do {
            System.out.println("1. Rut tien");
            System.out.println("2.So du");
            System.out.println("3.Thoat");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (withdraw(accounts[i])){
                    System.out.println("ok");
                }else System.out.println("fail");
                case 2:

            }
        }while (choice !=3);
    }

    private static boolean login(Account[] accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tai khoan");
        String username = scanner.next();
        System.out.println("nhao mat khau");
        String password = scanner.next();
        for (int i = 0; i < accounts.length; i++) {
            if (username.equals(accounts[i].username)){
                return true;
            }if (password.equals(accounts[i].password)){
                return true;
            }
        }return false;
    }
    public static boolean withdraw(Account[] accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut");
        double amount = scanner.nextDouble();
        int i = 0;
        if (amount <= (accounts[i].getAmount())) {
            accounts[i].setAmount(accounts[i].getAmount() - amount);
            return true;
        } else
            return false;
    }


}
