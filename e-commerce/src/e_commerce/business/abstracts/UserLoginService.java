package e_commerce.business.abstracts;

import e_commerce.entities.concretes.User;

public interface UserLoginService {
    void register(User user);
    void login(String email, String password);
}

