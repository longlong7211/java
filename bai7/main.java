package bai7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String check = "";
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        do {
            switch (check) {
                case "1":
                    students = nhapsv();
                    break;
                case "2":
                    employees = nhapnv();
                    break;
                case "3":
                    customers = nhapkh();
                    break;
                    case "4":
                    
                    break;
            }
        } while (check != "1" && check != "2" && check != "3");
    }

    private static ArrayList<Student> nhapsv() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("long1", "dn", 9, 10));
        students.add(new Student("long2", "dn", 10, 10));
        return students;
    }

    private static ArrayList<Employee> nhapnv() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("long3", "dn", 9));
        employees.add(new Employee("long4", "dn", 10));
        return employees;
    }

    private static ArrayList<Customer> nhapkh() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("long6", "dn", "fanta", 10));
        customers.add(new Customer("long7", "dn", "fanta", 10));
        return customers;
    }

}