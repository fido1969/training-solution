package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Szabadkai János",2003,510_000);
        System.out.println(employee.toString());    //System.out.println(employee);
        System.out.println();

        employee.setName("Nagy Gábor");
        System.out.println(employee.toString());
        System.out.println();

        employee.raiseSalary(300_000);
        System.out.println(employee.toString());
        System.out.println();

        System.out.println("Name: "+employee.getName());
        System.out.println("The year of hiring: "+employee.getHiringYear());
        System.out.println("Salery: "+employee.getSalary());


    }
}
