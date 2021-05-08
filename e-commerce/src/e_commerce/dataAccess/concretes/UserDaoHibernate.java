package e_commerce.dataAccess.concretes;
import java.util.ArrayList;
import e_commerce.dataAccess.abstracts.UserDao;
import e_commerce.entities.concretes.User;

import java.util.List;

public class UserDaoHibernate implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void addAccount(User user) {
        users.add(user);
        System.out.println("User added : " + user.getName() + " user surname : " + user.getSurname());
    }

    @Override
    public boolean addVerificationEmail(User user) {
        for (User usr : users)
            if (usr.getEmail() == user.getEmail()) {
                return false;
            }
        return true;
    }

    @Override
    public boolean signUp(String email, String password) {
        for (User usr : users) {
            if (usr.getEmail().equals(email) && usr.getPassword().equals(password))
                return true;
        }
        return false;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
    }

