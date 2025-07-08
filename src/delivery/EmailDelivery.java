package delivery;

import model.Customer;

public class EmailDelivery implements DeliveryStrategy {
    @Override
    public void deliver(Customer customer) {
        System.out.println("Sending eBook to [" + customer.getName() + "] at [" + customer.getEmail() + "]");
    }
}