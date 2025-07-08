package model;

import delivery.EmailDelivery;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author, true, new EmailDelivery());
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }
}