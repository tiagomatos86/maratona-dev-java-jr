package br.com.tiago.maratonadevjr.arquitetura.userregistration;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Decide a implementação concreta
        UserRepository memoryRepository = new UserMemoryRepository();

        // Injeta no service
        UserRegistration userRegistration = new UserRegistration(memoryRepository);
        
        userRegistration.registerUser(1, "Tiago Matos", "tiago_m_lima@hotmail.com");
        userRegistration.registerUser(2, "Dominique Ribeiro", "domiribeiro29@hotmail.com");
        userRegistration.registerUser(3, "Erik Gabriel", "erikg0406@gmail.com");
        // userRegistration.registerUser(1, "Fulano da Silva", "fulanodasilva@protonmail.com");
       
        System.out.println( userRegistration.searchUser(1));
        System.out.println( userRegistration.searchUser(2));
        System.out.println( userRegistration.searchUser(3));
        //System.out.println( userRegistration.searchUser(4));

        UserFileRepository fileRepository = new UserFileRepository();
        String path = "D:\\Cursos\\maratona-dev-java-jr\\maratona-dev-java-jr\\src\\br\\com\\tiago\\maratonadevjr\\poo\\userregistration\\users\\users.txt";

   
        try {
            List<User> users = userRegistration.listAllUsers();
            fileRepository.saveToFile(users, path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}