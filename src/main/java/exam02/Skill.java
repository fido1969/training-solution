//Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név, valamint skillek
//(hogy mihez ért az illető). A skill egy névvel és egy számmal (szint) rendelkezik, utóbbi 1 - 5 között.
//Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.
//A skillek megadása a nevével, valamint a szintjével történik, pl. programming (5).
//A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét.
package exam02;

public class Skill {
    private String name; //1 - 5 között
    private int level;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
