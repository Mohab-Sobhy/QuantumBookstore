package service;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private static final InventoryService inventoryService = new InventoryService();
    private final Inventory inventory = new Inventory();

    private InventoryService() {}

    public static InventoryService getInstance() {
        return inventoryService;
    }

    public List<Book> getAllBooks() {
        return inventory.getAll();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public List<Book> getOutdatedBooks(int ageLimit) {
        int currentYear = LocalDate.now().getYear();
        List<Book> allBooks = getAllBooks();
        List<Book> outdatedBooks = new ArrayList<>();

        for (Book book : allBooks) {
            int bookAge = currentYear - book.getYear();
            if (bookAge >= ageLimit) {
                outdatedBooks.add(book);
            }
        }
        return outdatedBooks;
    }

    public Book getBook(String isbn) {
        return inventory.get(isbn);
    }

    public void removeOutdatedBooks(int ageLimit) {
        List<Book> outdatedBooks = getOutdatedBooks(ageLimit);

        for (Book book : outdatedBooks) {
            inventory.remove(book);
        }
    }

}