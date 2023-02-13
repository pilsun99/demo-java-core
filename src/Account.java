import java.util.Scanner;

public class Account {
    String username,password;
    double amount;
    Scanner scanner = new Scanner(System.in);
    public Account(){

    }
    public Account(String username, String password, double amount) {
        this.username = username;
        this.password = password;
        this.amount = amount;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public static void viewAccount(Account[].amount) {

    }
}


