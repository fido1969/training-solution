package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String userName) {
        return !"".equals(userName);
    }

    public boolean isValidPassword(String passWord1, String password2) {
        return passWord1.length() >= 8 && passWord1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        if ((email.indexOf("@") != -1) && (email.indexOf(".") != -1) && (email.indexOf(".") > email.indexOf("@"))
                && (email.indexOf("@.") == -1) && (email.indexOf("@") > 0) && (email.indexOf(".") < email.length() - 1)) {
            return true;
        } else {
            return false;
        }
    }

}




