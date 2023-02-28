package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager empManager = new EmployeeManager();
        int choice = 0;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add new employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Search employee by ID");
            System.out.println("4. Sort employees by name");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter employee details:");
                    System.out.print("ID: ");
                    String id = scanner.next();
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    empManager.addEmployee(id, name, age, salary);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    empManager.displayEmployee();
                    break;
                case 3:
                    System.out.print("Enter employee ID to search: ");
                    String searchId = scanner.next();
                    empManager.searchEmployeeByID(searchId);
                    break;
                case 4:
                    empManager.sortEmployeeByName();
                    System.out.println("Employees sorted by name.");
                    break;
                case 5:
                    System.out.println("Thoat");
            }
        } while (choice != 5);
    }
}