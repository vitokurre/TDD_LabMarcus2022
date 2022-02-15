public class Employee {

    private int ID;
    private static int counter;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age, double salary){
        counter = counter + 1;
        ID = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public void setLastName(String newLastname) {
        lastName = newLastname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int i) {
        age = i;
    }
}
