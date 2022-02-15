public class Employee {

    private int ID;
    private static int counter;
    private String firstName;

    public Employee(String firstName, String lastName, int age, double salary){
        counter = counter + 1;
        ID = counter;
        this.firstName = firstName;
    }

    public int getUniqueID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String expected) {
        firstName = expected;
    }
}
