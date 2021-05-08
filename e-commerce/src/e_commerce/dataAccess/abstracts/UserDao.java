package e_commerce.dataAccess.abstracts;
import java.util.List;
import e_commerce.entities.concretes.User;
public interface UserDao {
    void addAccount(User user);
    boolean addVerificationEmail(User user);
    boolean signUp(String email, String password);

    User getUser(int id);
    List<User> getAllUser();
}






