package org.example.interfaces;

import org.example.Input;
import org.example.model.Address;
import org.example.model.Employee;
import org.example.interfaces.EmployeeProvider;
import org.example.model.Person;
import org.example.EmployeeService;
import org.example.App;

public class InputEmployee  implements  EmployeeProvider{




    @Override
    public Employee addEmployee(Input input){

        Person person = new Person();
        Address address = new Address();

        Employee employee = new Employee();
        System.out.println("New Employess");

        System.out.print("Name");
        person.setFirstname(input.nextLine());

        System.out.print("LastName");
        person.setLastname(input.nextLine());

        System.out.print("Status");
        employee.setPosition(input.nextLine());

        System.out.print("Salary");
        employee.setSalary(input.nextLine());


        System.out.print("Aadress");
        address.setHouse(input.nextLine());



        System.out.print("City");
        address.setCity(input.nextLine());

        System.out.print("Street");
        address.setStreet(input.nextLine());

        System.out.print("Apartment");
        address.setApartment(input.nextLine());

        return employee;
    }















}
