package employee;

public class Employee {

    private String name;
    private String occupation;
    private int salary;

    public boolean isEmpty(String string){
        return string==null || string.isBlank();
    }

    public Employee(String name, String occupation, int salary) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name can not be 'null' or empty!");
        }
        if (isEmpty(occupation)) {
            throw new IllegalArgumentException("Occupation can not be 'null' or empty!");
        }
        if (salary<=0 || salary%1000!=0) {
            throw new IllegalArgumentException("Salary is not correct!");
        }
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + occupation + " - " + salary + " Ft";
    }
}
