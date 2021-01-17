////Készíts egy interfészt User néven. Az interfésznek legyen egy String getUsername(), egy String getFirstName(), egy String getLastName()
////és egy String getFullName() metódusa! Implementáld a User interfészt egy UserImpl nevű osztályban, mely konstruktor paraméterként várja az username,
////a firstName és a lastName paramétereket. A getFullName metódushoz adjunk az interfészben egy default implementációt!
package week07d02.senior;

public interface User {

    String getUsername();
    String getFirstName();
    String getLastName();

    default String getFullName() {
        return getFirstName()+" "+getLastName();
    }
}


