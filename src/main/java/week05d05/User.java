package week05d05;

public class User {
    //Mai Junior/Mid feladat:
    //Készíts egy osztályt week05d05.User néven, melynek van egy firstName (String),
    // egy lastName (String) és egy email (String) mezője. Legyen ellenőrzés az User konstruktorában,
    // mely hibát jelez, ha nincs @ és . (pont) az e-mail cimben! Készíts egy metódust is getFullName névvel,
    // mely visszaadja a firstName és a lastName változókat összefűzve. Legyen közöttük egy whitespace (" ").
    //Bónusz feladat: írjunk teszteket

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        if ((!email.contains("@")) || (!email.contains("."))) {
            throw new IllegalArgumentException("Email address in not correct: "+email);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        User user = new User("Szabadkai", "János", "szabadkai.janos@freemail.hu");
        user.getFullName();
        System.out.println(user.firstName+"-"+user.lastName+"-"+user.email);

        User user1 = new User("Szabadkai", "János", "szabadkai.janosfreemail.hu");
        user1.getFullName();
        System.out.println(user1.firstName+"-"+user1.lastName+"-"+user1.email);

    }
}
