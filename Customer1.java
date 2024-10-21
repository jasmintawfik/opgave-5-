
public class Customer1 {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;


    public Customer1(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = ++counter;


    }

    //getter
    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {

        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;


    }

    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName + " (Username: "  +  username + ")";
    }
}