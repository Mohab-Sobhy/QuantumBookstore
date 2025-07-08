package controller;

import model.*;
import service.InventoryService;
import service.PurchaseService;
import util.BookListFormatter;

import java.util.List;

public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        // Initialize services (singleton instances)
        InventoryService inventoryService = InventoryService.getInstance();
        PurchaseService purchaseService = PurchaseService.getInstance();

        // Create books (PaperBook, EBook, ShowcaseBook)
        PaperBook book1 = new PaperBook("9789770934704", "Ard Zikola", 2013, 120.0, "Alaa Al-Aswany", 15);
        EBook book2 = new EBook("9781476467924", "Youtobia", 2018, 80.0, "Ahmed Tawfik", "PDF");
        ShowcaseBook book3 = new ShowcaseBook("9789776467924", "Al-Ayyam (Rare Edition)", 1978, 0.0, "Taha Hussein");

        // Add books to the inventory
        inventoryService.addBook(book1);
        inventoryService.addBook(book2);
        inventoryService.addBook(book3);

        // Print all books in inventory
        System.out.println("All Books in Inventory:");
        BookListFormatter.printBooks(inventoryService.getAllBooks());

        // Print outdated books (published more than 30 years ago)
        System.out.println("Outdated Books (older than 30 years):");
        BookListFormatter.printBooks(inventoryService.getOutdatedBooks(30));

        // Create a customer
        Customer customer = new Customer("Mohab Sobhy", "mohab_sobhy@outlook.com", "Been Elsarayat _ Giza _ Egypt");

        // Create an order containing one paper book and one ebook
        BookOrder order1 = new BookOrder(book1, 1);
        BookOrder order2 = new BookOrder(book2, 1);
        Order order = new Order(List.of(order1, order2), customer);

        // Execute the purchase
        System.out.println("Executing purchase...\n");
        purchaseService.buy(order); // PurchaseService also provides an overloaded buy() method for buying a single book directly
    }
}