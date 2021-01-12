//A UserValidator osztályba írj egy validate(List<User>) metódust, mely leellenőrzi a paraméterben
// átadott felhasználókat! (A User egy String name és egy int age attribútumot tartalmazzon!)
// Ha a lista null, dobjon kivételt! Ha a felhasználó null, dobjon kivételt! Ha A felhasználó neve null,
// vagy üres, dobjon kivételt! Ha az életkor kisebb, mint 0, vagy nagyobb, mint 120, dobjon kivételt!
package week05d03.senior;

import week05d03.senior.User;

import java.util.List;

public class UserValidator {

    public void validate(List<User> users) {
        if (users == null) {
            throw new NullPointerException("Users is null");
        }
        if (users.size() == 0) {
            throw new IllegalArgumentException("Empty list!");
        }
        for (User user : users) {
            if (user == null) {
                throw new NullPointerException("User is null!");
            }
            if (user.getName() == null || user.getName().isBlank()) {
                throw new IllegalArgumentException("Name can not be null or empty! " + user.toString());
            }

            if (user.getAge() < 0 || user.getAge() > 120) {
                throw new IllegalArgumentException("The age must be between 0 and 120! " + user.toString());
            }
        }
    }
}
