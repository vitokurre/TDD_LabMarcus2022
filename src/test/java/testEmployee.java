import org.junit.jupiter.api.*;

public class testEmployee {
    Employee testObject1;
    Employee testObject2;
    Employee testObject3;


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

    }

    @Test
    public void checkGetUniqueIDtest() {

        int expected = 1;

        int actual = testObject1.getUniqueID();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void checkGetUniqueIDtest2() {

        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;


        int actual1 = testObject1.getUniqueID();
        int actual2 = testObject2.getUniqueID();
        int actual3 = testObject3.getUniqueID();

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    public void checkGetFirstNameTest() {

        String expected = "Marcus";

        String actual = testObject1.getFirstName();

        Assertions.assertEquals(expected, actual);

    }


}
