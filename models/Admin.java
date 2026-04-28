package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Admin extends Employee {
    private List<String> permissions = new ArrayList<>();

    public Admin(int id, String username, String password, String email,
                 String firstName, String lastName,
                 String employeeId, double salary, LocalDate hireDate) {
        super(id, username, password, email, firstName, lastName, employeeId, salary, hireDate);
        permissions.add("MANAGE_USERS");
        permissions.add("VIEW_LOGS");
    }

    public void addUser(User user) {
        System.out.println("Admin added user: " + user.getFullName());
    }

    public void removeUser(User user) {
        System.out.println("Admin removed user: " + user.getFullName());
    }

    public void updateUser(User user) {
        System.out.println("Admin updated user: " + user.getFullName());
    }

    public List<String> viewLogs() {
        return List.of("User logged in", "Course registered", "Mark added");
    }
}
