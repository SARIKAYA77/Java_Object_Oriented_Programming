package inheritance;

public class User {
    int id;
    String name_surname;
    String email;
    String password;

    public User(int id, String name_surname,  String password, String email) {
        super();
        this.id = id;
        this.name_surname = name_surname;
        this.password = password;
        this.email = email;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName_surname() {
        return name_surname;
    }
    public void setUsername(String name_surname) {
        this.name_surname = name_surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
