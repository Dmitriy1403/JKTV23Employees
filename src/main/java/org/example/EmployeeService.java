package org.example;

import org.example.interfaces.EmployeeProvider;
import org.example.interfaces.Input;
import org.example.model.Employee;

public class EmployeeService {
    private final org.example.interfaces.EmployeeProvider employeeProvider;


    public EmployeeService(EmployeeProvider employeeProvider) {

       this.employeeProvider = employeeProvider;



    }

    public void createEmployee(Input input){

        Employee employee = employeeProvider.addEmployee((org.example.Input) input);

        employeeProvider.addEmployee((org.example.Input) input);

        App.employees[0] = employee;
        for(int i=0;i<App.employees.length;i++){
            if(i==0 && App.employees[i]==null){
                App.employees[i]=employee;
                break;

            }else if (i>0 && App.employees[i]==null){
                App.employees[i] = employee;
                break;
            }

        }

       }






//        Employee employee = new Employee();
//        Person person = new Person();
//        Address address = new Address();
//        person.setAddress(address);
//        employee.setPerson(person);

    }

