package org.example.employee;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeController {

    EmployeeRepository employeeRepository = new MySqlEmployeeRepository();

    public void createAndSave(){
        Scanner scanner = new Scanner(System.in);
        Employee newEmployee = new Employee();
        System.out.println("Employee Management Program");
        System.out.println("------------------------------");
        System.out.println("Enter Employee's fullname: ");
        newEmployee.setFullName(scanner.nextLine());
        System.out.println("Enter Employee's address: ");
        newEmployee.setAddress(scanner.nextLine());
        System.out.println("Enter Employee's email: ");
        newEmployee.setEmail(scanner.nextLine());
        System.out.println("Enter Employee's username: ");
        newEmployee.setUsername(scanner.nextLine());
        System.out.println("Enter Employee's password: ");
        newEmployee.setPassword(scanner.nextLine());
        System.out.println("Enter Employee account's create date: ");
        newEmployee.setCreateDate(LocalDate.parse(scanner.nextLine()));
        System.out.println("Enter Employee account's update date: ");
        newEmployee.setUpdateDate(LocalDate.parse(scanner.nextLine()));
        System.out.println("Enter Employee's status: ");
        newEmployee.setStatus(scanner.nextInt());
        scanner.nextLine();
        System.out.println("================================================================");
        System.out.println("Employee's Information:");
        System.out.println(newEmployee.toString());
        System.out.println("================================================================");
        System.out.println("Do you want to save this account? (y/n): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            employeeRepository.save(newEmployee);
        }
    }
}