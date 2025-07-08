package model;

import delivery.DeliveryStrategy;

public abstract class Book {
    protected String isbn, title, author;
    protected int year;
    protected double price;
    protected boolean isPurchasable;
    protected DeliveryStrategy deliveryStrategy;

    public Book(String isbn, String title, int year, double price, String author, boolean isPurchasable, DeliveryStrategy deliveryStrategy) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
        this.isPurchasable = isPurchasable;
        this.deliveryStrategy = deliveryStrategy;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchasable() {
        return isPurchasable;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }
}
