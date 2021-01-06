package exam02;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private final String name;
    private final List<Skill> skillList = new ArrayList<>();

    public List<Skill> getSkills() {
        return skillList;
    }

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cv{" +
                "name='" + name + '\'' +
                ", skillList=" + skillList +
                '}';
    }

    public int findSkillLevelByName(String skillName) {
        for (Skill skill : skillList) {
            if (skillName.equals(skill.getName())) {
                return skill.getLevel();
            }
        }
        throw new IllegalArgumentException("Wrong data.");
    }

    public void addSkills(String... skillsOfCv) {
        for (String item : skillsOfCv) {


        }
    }

}
