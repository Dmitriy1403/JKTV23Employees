package org.example;

import org.example.interfaces.EmployeeRepository;
import org.example.model.Employee;
import org.example.EmployeeService;

public class App {

    public static Employee[] employees = new Employee[100];

    private final EmployeeService employeeService;
    private final Input input;
    private final EmployeeRepository employeeRepositiry;

    public App(Input input, EmployeeService employeeService, EmployeeRepository employeeRepository) {
        this.input = input;
        this.employeeService = employeeService;
        this.employeeRepositiry = employeeRepository;
        employees = new Employee[]{employeeRepository.loadEmployees()};


    }



    public void run() {

        System.out.println("Programm\"Employes\"");
        boolean repeat = true;
        do {
            System.out.println("Task Lists");
            System.out.println("0. System out");
            System.out.println("1. Add Employees");
            System.out.print("Enter task number");

            int task = Integer.parseInt(input.nextLine());
//            scanner.nextLine();

            switch (task) {
                case 0:
                    System.out.println("Program exit");
                    repeat = false;
                    break;
                case 1:

                    System.out.println("Add Employees");
                    employeeService.createEmployee((org.example.interfaces.Input) input,employeeRepositiry);
                    System.out.println();

                    break;
                default:
                    System.out.println("Choosing number from list");

                    break;

            }
        }while (repeat);
        System.out.println("Good bye!!!");

    }
}
