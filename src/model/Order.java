package model;

import java.util.List;

public class Order {
    private List<BookOrder> bookOrders;
    private Customer customer;

    public Order(List<BookOrder> bookOrders, Customer customer) {
        this.bookOrders = bookOrders;
        this.customer = customer;
    }

    public Order(BookOrder bookOrders, Customer customer) {
        this.bookOrders.add(bookOrders);
        this.customer = customer;
    }

    public List<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public Customer getCustomer() {
        return customer;
    }
}