package stringconcat;

public class Name {

    private String familyName;
    private String givenName;
    private String middleName;
    private Title title;

    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public Name(String familyName, String givenName, String middleName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and Given name must be given!");
        }
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.title = title;
    }

    public String concatNameWesternStyle() {

        String fullName;

        if (title != null) {
            fullName = title.getTitleString().concat(" ").concat(givenName).concat(" ");
        } else {
            fullName = givenName.concat(" ");
        }
        if (middleName != null && !middleName.isBlank()) {
            fullName = fullName.concat(middleName).concat(" ");
        }
        fullName = fullName.concat(familyName);

        return fullName;
    }

    public String concatNameHungarianStyle() {

        String fullName;

        if (title != null) {
            fullName = title.getTitleString()+" "+familyName+" ";
        } else {
            fullName = familyName+" ";
        }
        if (middleName != null && !middleName.isBlank()) {
            fullName = fullName+middleName+" ";
        }
        fullName = fullName+givenName;

        return fullName;
    }
}
