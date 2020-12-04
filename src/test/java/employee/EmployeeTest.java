package employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee = new Employee("János", "engineer", 700_000);

    @Test
    public void employeeConstructorTest() {

        assertEquals("János", employee.getName());
        assertEquals("engineer", employee.getOccupation());
        assertEquals(700_000, employee.getSalary());
    }

    @Test
    void employeeEmptyNameTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("", "engineer", 700_000));
        assertEquals("Name can not be 'null' or empty!", ex.getMessage());
    }

    @Test
    void employeeNameIsNullTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee(null, "engineer", 700_000));
        assertEquals("Name can not be 'null' or empty!", ex.getMessage());
    }

    @Test
    void employeeEmptyOccupationTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Béla", "", 700_000));
        assertEquals("Occupation can not be 'null' or empty!", ex.getMessage());
    }

    @Test
    void employeeOccupationIsNullTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Béla", null, 700_000));
        assertEquals("Occupation can not be 'null' or empty!", ex.getMessage());
    }

    @Test
    void employeeSalarySmallerThanZeroTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Béla", "engineer", -150_00));
        assertEquals("Salary is not correct!", ex.getMessage());
    }

    @Test
    void employeeSalaryNotDevidedBy1000Test() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Béla", "engineer", 150_125));
        assertEquals("Salary is not correct!", ex.getMessage());
    }

    @Test
    public void employeeToStringTest() {
        assertEquals("János - engineer - 700000 Ft", employee.toString());
    }

}