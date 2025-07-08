package service;

import delivery.DeliveryStrategy;
import model.Book;
import model.BookOrder;
import model.Customer;
import model.Order;

public class PurchaseService {
    private static PurchaseService purchaseService = new PurchaseService();

    private PurchaseService() {}

    public static PurchaseService getInstance() {
        return purchaseService;
    }

    public void buy(Order order) {
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("--------------------------------------------------");

        for (BookOrder bo : order.getBookOrders()) {
            String title = bo.getBook().getTitle();
            String isbn = bo.getBook().getIsbn();
            DeliveryStrategy strategy = bo.getBook().getDeliveryStrategy();

            System.out.println("Book     : " + title);
            System.out.println("ISBN     : " + isbn);
            System.out.print("Delivery : ");
            strategy.deliver(order.getCustomer());
            System.out.println("--------------------------------------------------");
        }
    }

    public void buy(BookOrder bookOrder , Customer customer) {
        Order order = new Order(bookOrder , customer);
        bookOrder.getBook().getDeliveryStrategy().deliver(customer);
    }

    public void buySingleBook(String isbn, int quantity, String email, String address) {
        Book book = InventoryService.getInstance().getBook(isbn);
        if (book == null) {
            throw new NullPointerException();
        }
        BookOrder bookOrder = new BookOrder(book , quantity);
        Customer customer = new Customer("null" ,email , address);
        Order order = new Order(bookOrder , customer);
    }
}