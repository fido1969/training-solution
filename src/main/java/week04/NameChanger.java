//Készítsd el a NameChanger osztályt, melynek privát attribútuma legyen a String fillName,
// mely egy ember teljes nevét reprezentálja! A fullName attribútum [vezetéknév-familyname][szóköz][keresztnév--firstname]
// (Mással most nem foglakozunk)formátumban épül fel. A konstruktor állítsa be a paraméterül kapott értékre az adattagot,
// de ha az érték null, vagy üres String, akkor dobjon egy IllegalAgrumentException kivételt a következő üzenettel:
// Invalid name:[paraméter értéke]!
//Legyen egy changeFamilyName(String familyName) metódusa, mely megváltoztatja az objektum állapotát és kicseréli
// a vezetéknevet a paraméterül kapott értékre! Készíts teszt esetet.
package week04;

public class NameChanger {

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public NameChanger(String fullName) {
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Invalid name:[paraméter értéke]!");
        }
        this.fullName = fullName;
    }

    public String changeFamilyName(String familyName) {

        String oldFamilyName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf(" ") + 1);
        return fullName = familyName.trim().concat(" ").concat(firstName);

    }

    public String changeFirstName(String firstName) {

        String familyName = fullName.substring(0, fullName.indexOf(" "));
        String oldFirstName = fullName.substring(fullName.indexOf(" ") + 1);
        return fullName = familyName.concat(" ").concat(firstName.trim());

    }

    public String changeFirstName1(String firstName) {
        String[] fullNameArr = fullName.split(" ");
        return fullName = new StringBuilder().append(fullNameArr[0]).append(" " + firstName).toString();
    }

    public boolean nameIsSame(String otherName) {
        return fullName.equals(otherName);
    }
}

