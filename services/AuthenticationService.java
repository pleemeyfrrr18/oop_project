package services;

import java.util.List;
import models.User;
import exceptions.AuthenticationException;

public class AuthenticationService {
    public User login(String username, String password, List<User> users) throws AuthenticationException {
        for (User user : users) {
            if (user.login(username, password)) {
                System.out.println("Login successful: " + user.getFullName());
                return user;
            }
        }
        throw new AuthenticationException("Invalid username or password.");
    }

    public void logout(User user) {
        user.logout();
    }
}
