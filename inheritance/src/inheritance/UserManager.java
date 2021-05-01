package inheritance;

public class UserManager {
    public void UserName(User user) {
        System.out.println("Your name and your surname:"+user.getName_surname());
    }

    public void UserEmail(User user) {
        System.out.println("Your e-mail address:"+user.getEmail());
    }

    public void UserPassword(User user) {
        System.out.println("Password:"+user.getPassword());
    }


}