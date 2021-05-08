package e_commerce.core;

import e_commerce.entities.concretes.User;
import e_commerce.googleAuthentication.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements NotifyService {

    @Override
    public boolean addNewAccount(User user) {
        GoogleAuthManager authManager = new GoogleAuthManager();

        if (authManager.loginWithGoogle(user.getEmail())){
            System.out.println("Authentication credentials success.");
            return true;
        }
        System.out.println("Authentication credentials fail.");
        return false;
    }

    @Override
    public void sendValidationEmail(User user, String content) {

    }

    @Override
    public void sendValidationLink(User user) {

    }

    @Override
    public boolean isClickedToValidationLink(User user) {
        return true;
    }
}