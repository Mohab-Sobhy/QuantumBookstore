package model;

import delivery.ShippingDelivery;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author, true, new ShippingDelivery());
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}