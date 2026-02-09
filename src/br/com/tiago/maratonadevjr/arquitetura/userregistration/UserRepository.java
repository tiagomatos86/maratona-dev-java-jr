package br.com.tiago.maratonadevjr.arquitetura.userregistration;

import java.util.List;

public interface UserRepository {    
    void save(User user);
    User findById(int id);
    List<User> findAll();
}
    
