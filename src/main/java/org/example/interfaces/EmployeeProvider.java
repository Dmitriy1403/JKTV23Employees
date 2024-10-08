package org.example.interfaces;

import org.example.Input;
import org.example.model.Employee;


public interface EmployeeProvider {



    Employee addEmployee(Input input);


    void listEmployees();
}
