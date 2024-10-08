package org.example;
import org.example.interfaces.*;
import org.example.interfaces.Input;
import org.example.tools.ConsoleInput;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Input input = new ConsoleInput();




        EmployeeProvider employeeProvider = new InputEmployee();
        EmployeeService employeeService = new EmployeeService(employeeProvider);
        EmployeeRepository employeeRepository =  new EmployeeFileService();

        App app = new App((org.example.Input) input,employeeService,employeeRepository);


        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        app.run();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}