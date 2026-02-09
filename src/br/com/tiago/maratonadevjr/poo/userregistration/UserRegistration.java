package br.com.tiago.maratonadevjr.poo.userregistration;

import java.util.List;
import java.util.NoSuchElementException;

public class UserRegistration {
    private final UserRepository userRepository;
    
    public UserRegistration(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(int id, String name, String email){ 
        if(userRepository.findById(id) != null) throw new IllegalStateException ("The ID already exists.");
        User newUser = new User(id, name, email);
        userRepository.save(newUser);
    }

    public User searchUser(int id) {
        User user = userRepository.findById(id);
        if(userRepository.findById( id) == null) {
            throw new NoSuchElementException ("User not found.");
        }
        return user;
    }

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}