package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class OrderBoard {
    private List<Customer> customers = new ArrayList<>();

    public void subscribe(Customer customer) {
        customers.add(customer);
    }

    public void unsubscribe(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers(String message) {
        for (Customer customer : customers) {
            customer.update(message);
        }
    }
}