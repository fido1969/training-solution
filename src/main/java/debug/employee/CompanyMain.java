package debug.employee;

import java.util.ArrayList;

public class CompanyMain {

    public static void main(String[] args) {

        /*Employee employee1 = new Employee("Szabadkai János", 1969);
        Employee employee2 = new Employee("Nagy Mariann", 1999);
        Employee employee3 = new Employee("Kiss Béla", 1956);
        Employee employee4 = new Employee("Andreas Wollrath", 1982);*/

        Company company = new Company(new ArrayList<>());

        company.addEmployee(new Employee("Szabadkai János", 1969));
        company.addEmployee(new Employee("Nagy Mariann", 1999));
        company.addEmployee(new Employee("Kiss Béla", 1956));
        company.addEmployee(new Employee("Andreas Wollrath", 1982));

        /*Employee Kiss = company.findEmployeeByName("Kiss Béla");
        System.out.println(Kiss.getName()+" "+Kiss.getYearOfBirth());*/

        System.out.println(company.findEmployeeByName("Kiss Béla").getName() + "  " + company.findEmployeeByName("Kiss Béla").getYearOfBirth());

        System.out.println(company.listEmployeeNames());

     }

}
