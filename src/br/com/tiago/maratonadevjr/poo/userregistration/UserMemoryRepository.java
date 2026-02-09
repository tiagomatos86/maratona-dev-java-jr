package br.com.tiago.maratonadevjr.poo.userregistration;

import java.util.ArrayList;
import java.util.List;

public class UserMemoryRepository implements UserRepository{
    private List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findById(int id) {
        for(User user : users) { 
            if(user.getId() == id) {
                 return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }
    
}
