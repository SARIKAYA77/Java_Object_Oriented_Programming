package e_commerce;

import e_commerce.business.abstracts.UserLoginService;
import e_commerce.business.concretes.UserLoginServiceManager;
import e_commerce.core.GoogleAuthManagerAdapter;
import e_commerce.core.NotifyManager;
import e_commerce.dataAccess.concretes.UserDaoHibernate;
import e_commerce.dataAccess.concretes.UserDaoHibernate;
import e_commerce.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1,"julia","roberts","546848","julia@gmail.com");
        User user2 = new User(1,"emilly","clark","238932","emilly@gmail.com");

        UserLoginService userLoginService = new UserLoginServiceManager(new NotifyManager(true),new UserDaoHibernate());
        userLoginService.register(user1);
        System.out.println("--------------------------------------------");
        userLoginService.register(user2);

        userLoginService.login("julia@gmail.com","546848");

        UserLoginService userLoginService2 = new UserLoginServiceManager(new GoogleAuthManagerAdapter(),new UserDaoHibernate());
        userLoginService2.register(user1);
        System.out.println("--------------------------------------------");
        userLoginService2.register(user2);

        userLoginService2.login("emilly@gmail.com","238932");

    }
}
