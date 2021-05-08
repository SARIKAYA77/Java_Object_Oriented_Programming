package e_commerce.core;
import e_commerce.entities.concretes.User;
public interface NotifyService {
    boolean addNewAccount(User user);
    void sendValidationEmail(User user, String content);
    void sendValidationLink(User user);
    boolean isClickedToValidationLink(User user);
}