package br.com.tiago.maratonadevjr.arquitetura.userregistration;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserFileRepository {
    public void saveToFile(List<User> users, String path) throws IOException {
        try (FileWriter fw = new FileWriter(path, true)) {
            for (User user : users) {
                fw.write(user.toString() + "\n_________________\n");
            }
        }
    }
    
}