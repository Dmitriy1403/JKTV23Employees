package org.example.interfaces;

import org.example.model.Employee;

public interface EmployeeRepository {
    boolean saveEmployee(Employee[] employees);

    Employee loadEmployees();


}
