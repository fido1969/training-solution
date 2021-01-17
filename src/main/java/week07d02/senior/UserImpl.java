//Készíts egy interfészt User néven. Az interfésznek legyen egy String getUsername(), egy String getFirstName(), egy String getLastName()
//és egy String getFullName() metódusa! Implementáld a User interfészt egy UserImpl nevű osztályban, mely konstruktor paraméterként várja az username,
//a firstName és a lastName paramétereket. A getFullName metódushoz adjunk az interfészben egy default implementációt!

package week07d02.senior;

public class UserImpl implements User {

    private String username;

    private String firstName;

    private String lastName;

    public UserImpl(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
