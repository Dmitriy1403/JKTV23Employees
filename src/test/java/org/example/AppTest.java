package org.example;
import org.example.interfaces.InputEmployee;
import org.example.model.Address;
import org.example.model.Employee;
import org.example.model.Person;
import org.example.tools.ConsoleInput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertTrue;




import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppTest {

    OutputStream defaultOut;
    ByteArrayOutputStream mockOut;
    Input mockInput;




    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         mockInput = mock(Input.class);


        defaultOut = System.out;
        mockOut  = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockOut));

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        System.setOut(new PrintStream (defaultOut));
    }

//    @org.junit.Test
    @Test
    public void testRunExit(){


//        InputStream in  = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
        when(mockInput.nextLine()).thenReturn("0");
        App app = new App(mockInput,new EmployeeService(new InputEmployee()));
        app.run();
        String actualOut = mockOut.toString();
        System.setOut(new PrintStream(defaultOut));
        System.out.println(mockOut.toString());
        String expectedOutFragment = "Good bye!!!";
        assertTrue(actualOut.contains(expectedOutFragment));



    }

//    @Test
    public void testRunTask1(){
        when(mockInput.nextLine()).thenReturn("1","0");
        InputEmployee inputEmployeeMock = mock(InputEmployee.class);
        when(inputEmployeeMock.addEmployee(mockInput)).thenReturn(
                new Employee("Director",
                        "3000",
                         new Person("Ivan",
                                 "Ivanov",
                                  new Address(
                                          "Jõhvi",
                                          "Kooli",
                                          "32",
                                          "3"
                                  )
                         )
                )
        );



        App app = new App(mockInput,new EmployeeService(inputEmployeeMock));
        app.run();
        String output = mockOut.toString();

        String expectedOutFragment1 = "User added!!";
        String expectedOutFragment2 = "Good bye!!";
        assertTrue(output.contains(expectedOutFragment1));
        assertTrue(output.contains(expectedOutFragment2));

    }

    private void assertTrue(boolean goodBye) {
    }
}