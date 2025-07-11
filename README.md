# QuantumBookstore

QuantumBookstore is an object-oriented Java application that simulates a bookstore system with support for book management and purchasing

---

## 📊 Class Diagram

The UML class diagram below illustrates the main classes and their relationships in the system:

![Class Diagram](UMLDiagram/ClassDiagram.jpg)

---

## 📐 Object-Oriented Design

- Used core OOP principles: encapsulation, inheritance, polymorphism, and abstraction.  
- Applied design patterns:  
  - **Singleton** (`InventoryService`, `PurchaseService`)  
  - **Strategy** (`DeliveryStrategy`, `EmailDelivery`, `ShippingDelivery`)  
- Clean separation of concerns across controller, service, model, and delivery layers.  
- Designed for reusability and easy extension (e.g., adding new book or delivery types).  

---

## 📸 Application Screenshot

Below is a sample screenshot demonstrating the output or behavior of the application:

![Screenshot](ScreenShot/screenshot.png)

---

## 📁 Project Structure

```bash
.
├── ScreenShot
│   └── screenshot.png         # Sample screenshot of application behavior or execution
├── UMLDiagram
│   └── ClassDiagram.jpg       # UML class diagram representing system design
├── src
│   ├── controller             # Entry point of the application
│   │   └── QuantumBookstoreFullTest.java
│   ├── delivery               # Delivery strategy interface and its implementations
│   │   ├── DeliveryStrategy.java
│   │   ├── EmailDelivery.java
│   │   └── ShippingDelivery.java
│   ├── model                  # Core domain models: Book, Order, Customer, etc.
│   │   ├── Book.java
│   │   ├── BookOrder.java
│   │   ├── Customer.java
│   │   ├── EBook.java
│   │   ├── Inventory.java
│   │   ├── Order.java
│   │   ├── PaperBook.java
│   │   └── ShowcaseBook.java
│   ├── service                # Business logic and service classes
│   │   ├── InventoryService.java
│   │   └── PurchaseService.java
│   └── util                   # Utility/helper classes
│       └── BookListFormatter.java
