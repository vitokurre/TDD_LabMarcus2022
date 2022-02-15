import org.junit.jupiter.api.*;

public class testEmployee {
    Employee testObject1;


    @BeforeAll
    public static void beforeAll(){
        System.out.println("Nu börjar testsviten för Labb 1 i TDD");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Nu avslutas testsviten");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test slut");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Test start");

        testObject1 = new Employee("Marcus", "Davidsson", 33, 30500.00);

    }
    @Test
    public void checkGetUniqueIDtest(){

        int expected = 1;

        int actual = testObject1.getUniqueId();

        Assertions.assertEquals(expected, actual);


    }




}
