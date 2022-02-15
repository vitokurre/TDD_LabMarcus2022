import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class testEmployeeSystem {
    Employee testObject1;
    Employee testObject2;
    Employee testObject3;
    EmployeeSystem testObjectSystem;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Nu börjar testsviten för Labb 1 i TDD");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Nu avslutas testsviten");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test slut");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test start");

        testObject1 = new Employee("Marcus", "Davidsson", 33, 30500.00);
        testObject2 = new Employee("Jakob", "Nilsson", 23, 30500.00);
        testObject3 = new Employee("Anki", "Phan", 24, 30500.00);

        testObjectSystem = new EmployeeSystem();


    }

    @Test
    public void checkGetEmployeeListTest() {

        int expected = 0;
        ArrayList<Employee> employeesTest = new ArrayList<Employee>();

        employeesTest = testObjectSystem.GetEmployeeList();

        int actual = employeesTest.size();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkAddEmployeeTest() {

        int expected = 3;
        ArrayList<Employee> employeesTest = new ArrayList<Employee>();

        testObjectSystem.addEmployee(testObject1, testObject2, testObject3);

        employeesTest = testObjectSystem.GetEmployeeList();


    }

}
