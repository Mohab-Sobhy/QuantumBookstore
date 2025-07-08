package delivery;

import model.Customer;

public class ShippingDelivery implements DeliveryStrategy {
    @Override
    public void deliver(Customer customer) {
        System.out.println("Shipping paper book to [" + customer.getName() + "] at [" + customer.getAddress() + "]");
    }
}