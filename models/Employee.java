package models;

import java.time.LocalDate;

public class Employee extends User {
    protected String employeeId;
    protected double salary;
    protected LocalDate hireDate;

    public Employee(int id, String username, String password, String email,
                    String firstName, String lastName,
                    String employeeId, double salary, LocalDate hireDate) {
        super(id, username, password, email, firstName, lastName);
        this.employeeId = employeeId;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void sendMessage(Employee employee, String message) {
        System.out.println(getFullName() + " sent message to " + employee.getFullName() + ": " + message);
    }

    public void sendComplaint(String text) {
        System.out.println(getFullName() + " sent complaint: " + text);
    }
}
