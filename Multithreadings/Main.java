package Q2;
 package com.cipher.exception;

// User-defined exception
class EmployeeException extends Exception {
    EmployeeException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {

        double salary = 2500;

        try {
            if (salary < 3000) {
                throw new EmployeeException("Salary is below 3000");
            }
            System.out.println("Salary is valid");
        }
        catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    

