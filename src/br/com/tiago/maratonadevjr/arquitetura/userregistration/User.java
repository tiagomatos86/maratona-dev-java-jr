package br.com.tiago.maratonadevjr.arquitetura.userregistration;

public class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
            verifyFields(name);
            verifyFields(email);
            this.name = name;
            this.email = email;
            this.id = id;
    }

    private void verifyFields(String string){
        if(string == null || string.isBlank()  ) {
            throw new IllegalArgumentException("The fields name and email shouldn't be empty");
        }
    }

    //setters
    public void setName(String name) {
       verifyFields(name);
        this.name = name;
    }
    public void setEmail(String email) {
        verifyFields(email);
        this.email = email;
    }
    public void setId(int id) {
        this.id = id;
    }

     //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }   
}
