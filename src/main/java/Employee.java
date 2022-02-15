public class Employee {

    private int ID;
    private static int counter;


    public Employee(String firstName, String lastName, int age, double salary){
        counter = counter + 1;
        ID = counter;
    }

    public int getUniqueId() {
        return ID;
    }
}
