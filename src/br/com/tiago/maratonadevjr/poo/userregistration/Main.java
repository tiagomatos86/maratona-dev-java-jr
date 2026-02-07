package br.com.tiago.maratonadevjr.poo.userregistration;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        
        userRegistration.registerUser(1, "Tiago Matos", "tiago_m_lima@hotmail.com");
        userRegistration.registerUser(2, "Dominique Ribeiro", "domiribeiro29@hotmail.com");
        userRegistration.registerUser(3, "Erik Gabriel", "erikg0406@gmail.com");
        // userRegistration.registerUser(1, "Fulano da Silva", "fulanodasilva@protonmail.com");
       
        System.out.println( userRegistration.searchUser(1));
        System.out.println( userRegistration.searchUser(2));
        System.out.println( userRegistration.searchUser(3));
        // System.out.println( userRegistration.searchUser(4));
   
        try {
            userRegistration.saveUsersFile("D:\\Cursos\\maratona-dev-java-jr\\maratona-dev-java-jr\\src\\br\\com\\tiago\\maratonadevjr\\poo\\userregistration\\users\\users.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}