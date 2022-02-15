public class Employee {

    private int ID;
    private static int counter;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName, int age, double salary){
        counter = counter + 1;
        ID = counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getUniqueID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String expected) {
        lastName = expected;
    }
}
