import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer1> customers = new ArrayList<>();


        Customer1 customers1 = new Customer1("Jasmin", " tawfik", "jasmint22");
        Customer1 customers2 = new Customer1("Nancy", "Hoji", "nancy2200");

        customers.add(customers1);
        customers.add(customers2);


        // Tester printCustomers metoden
        printCustomers(customers);

    }

    // Statisk metode til at printe kunder
    public static void printCustomers(ArrayList<Customer1> customers) {
        for (Customer1 customer : customers) {
            System.out.println(customer);
        }
    }
}