package e_commerce.business.concretes;

import e_commerce.business.abstracts.UserLoginService;
import e_commerce.core.NotifyService;
import e_commerce.dataAccess.abstracts.UserDao;
import e_commerce.entities.concretes.User;

public class UserLoginServiceManager implements UserLoginService {
    private NotifyService notifyService ;
    private UserDao userDao;

    public UserLoginServiceManager(NotifyService notifyService, UserDao userDao) {
        this.notifyService = notifyService;
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        if (!userDao.addVerificationEmail(user)){
            System.out.println("This mail is available in the system. " + user.getEmail());
        }else if(!notifyService.addNewAccount(user)){
            System.out.println("Registration failed");
        }else {
            notifyService.isClickedToValidationLink(user);
            userDao.addAccount(user);
        }
    }

    @Override
    public void login(String email, String password) {
        if (userDao.signUp(email,password)){
            System.out.println(email + "Login success");
        }else {
            System.out.println("Login disapproved");
        }

    }
}
