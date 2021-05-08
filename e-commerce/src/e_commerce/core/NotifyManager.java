package e_commerce.core;

import e_commerce.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotifyManager implements NotifyService {
    private final boolean isClick;

    public NotifyManager(boolean isClick) {
        this.isClick = isClick;
    }

    @Override
    public boolean addNewAccount(User user) {
        return isFirstAndLastNameValid(user.getName()) &&
                isFirstAndLastNameValid(user.getSurname()) &&
                isEmailValid(user.getEmail()) && isPasswordValid(user.getPassword());
    }


    public boolean isEmailValid(String email) {
        String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        boolean resultValidate = matcher.matches();
        if (!resultValidate) {
            System.out.println("Invalid Email address, please check your email address: " + email);
        }
        return resultValidate;
    }

    public boolean isPasswordValid(String password) {
        boolean resultValidate = password.length() >= 6;
        if (!resultValidate) {
            System.out.println("Password must not be less than 6 characters, " + password);
            return false;
        }
        return true;
    }

    public boolean isFirstAndLastNameValid(String name) {
        String nameAndSurnameRegex = "^[a-zA-Z0-9_.]{2,20}$";
        Pattern pattern3 = Pattern.compile(nameAndSurnameRegex);
        Matcher matcher = pattern3.matcher(name);

        boolean resultValidate = matcher.matches();

        if (!resultValidate) {
            System.out.println("Name and surname must be at least 2 characters, " + name);
        }
        return resultValidate;
    }

    @Override
    public void sendValidationEmail(User user, String content) {
        System.out.println("E-mail successfully sent to : " + user.getName() + "User's E-mail: " + user.getEmail() + " " + content);
    }

    @Override
    public void sendValidationLink(User user) {
        System.out.println("A verification mail has been sent to the e-mail address : " + user.getEmail() );
    }

    @Override
    public boolean isClickedToValidationLink(User user) {
        if (isClick){
            System.out.println("activation success : " + user.getName() + " " + user.getSurname());
            return true;
        }
        System.out.println("Verification email not activation success : " + user.getEmail());
        return false;
    }
}