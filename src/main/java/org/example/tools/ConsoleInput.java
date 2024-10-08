package org.example.tools;

import org.example.interfaces.Input;
import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
};
