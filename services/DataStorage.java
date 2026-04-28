package services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import models.User;

public class DataStorage {
    public void saveData(List<User> users) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
            out.writeObject(users);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<User> loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("users.dat"))) {
            return (List<User>) in.readObject();
        } catch (Exception e) {
            System.out.println("No saved data found.");
            return new ArrayList<>();
        }
    }
}
