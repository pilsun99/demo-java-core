package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {
   private final ArrayList<Employee> employeeList;
   public EmployeeManager(){
       employeeList = new ArrayList<Employee>();
   }
   public void addEmployee(String id,String name,int age,double salary){
       Employee emp = new Employee(id,name,age,salary);
       employeeList.add(emp);
   }
   public void displayEmployee(){
       if (employeeList.size() == 0){
           System.out.println("Khong co thong tin trong danh sach");
           return;
       }
       System.out.println("Danh sach cac nhan vien");
       for (Employee emp: employeeList
            ) {
           System.out.println(emp.toString());
       }
   }
   public  void searchEmployeeByID(String id){
       for (Employee emp : employeeList
            ) { if (emp.getId().equals(id)){
           System.out.println(emp.toString());
           return;
       }
       }
       System.out.println("Nhan vien ID: " + id + "Khong tim thay");
   }
   public void sortEmployeeByName(){
       Collections.sort(employeeList, new Comparator<Employee>(){
           public int compare(Employee emp1, Employee emp2) {
               return emp1.getName().compareTo(emp2.getName());
           }
       });
   }
}
