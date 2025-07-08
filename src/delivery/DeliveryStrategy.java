package delivery;

import model.Customer;

public interface DeliveryStrategy {
    void deliver(Customer customer);
}