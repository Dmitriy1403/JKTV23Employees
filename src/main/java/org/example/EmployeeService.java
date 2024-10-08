package org.example;

import org.example.interfaces.EmployeeProvider;
import org.example.interfaces.EmployeeRepository;
import org.example.interfaces.Input;
import org.example.model.Employee;

public class EmployeeService {
    private final org.example.interfaces.EmployeeProvider employeeProvider;


    public EmployeeService(EmployeeProvider employeeProvider) {

       this.employeeProvider = employeeProvider;



    }

    public boolean createEmployee(Input input, EmployeeRepository employeeRepository){

        Employee employee = employeeProvider.addEmployee((org.example.Input) input);

        employeeProvider.addEmployee((org.example.Input) input);

        App.employees[0] = employee;
        for(int i=0;i<App.employees.length;i++){
            if(App.employees[i]==null){
                App.employees[i]=employee;
                employeeRepository.saveEmployee(App.employees);
                return true;

            }
        }

        return false;
    }






//        Employee employee = new Employee();
//        Person person = new Person();
//        Address address = new Address();
//        person.setAddress(address);
//        employee.setPerson(person);

    }

