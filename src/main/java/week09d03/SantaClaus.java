package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    List<Person> people = new ArrayList<>();

    public SantaClaus(List<Person> people) {
        this.people = List.copyOf(people);
    }

    public List<Person> getPeople() {
        return people;
    }

    public void getThroughChimneys() {
        for (Person person : people) {
            person.setPresent();
            if (person.getAge() >= 14) {
                while (person.getPresent() == Present.TOY) {
                    person.setPresent();
                }
            }
        }
    }
}
