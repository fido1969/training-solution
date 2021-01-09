//Írj egy Phone oszályt, melynek van egy prefix és egy number String attribútuma!
// Írj egy PhoneParser osztályt egy parse(String) metódussal, ami beolvas egy 10-1234567
// formátumú szöveget, és visszaad egy Phone objektumot, feltöltve a prefix értékét 10,
// a number értékét 1234567 értékekkel!
package week03;

public class PhoneParser {

    public Phone parse(String str) {
        int index = str.indexOf("-");
        String prefix = str.substring(0, index);
        String number = str.substring(index + 1);
        return new Phone(prefix, number);
    }
}
