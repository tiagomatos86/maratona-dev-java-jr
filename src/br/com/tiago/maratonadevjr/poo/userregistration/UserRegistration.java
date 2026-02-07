package br.com.tiago.maratonadevjr.poo.userregistration;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserRegistration {
    private List<User> users = new ArrayList<>();

    public void registerUser(int id, String name, String email){
       for(User user : users) {
            if(user.getId() == id) {
                throw new IllegalStateException ("The ID already exists.");
            }
       }
       User newUser = new User(id, name, email);
       users.add(newUser);
    }

    public User searchUser(int id){
        for(User user : users) { 
            if(user.getId() == id) {
                 return user;
            }
        }
        throw new NoSuchElementException ("User not found.");
    }

    public List<String> listAllUsers() {
        List<String> usersData = new ArrayList<>();
        for (User user : users) {
            usersData.add(user.toString());
        }
        return usersData;
    }

    public void saveUsersFile(String path) throws IOException{
        try (FileWriter fw = new FileWriter(path, true)) {
            for (String userData : listAllUsers()) {
                fw.write(userData + "\n_________________\n");
            }
        }
    }
}