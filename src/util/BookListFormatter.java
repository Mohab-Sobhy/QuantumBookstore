package util;

import model.Book;
import model.EBook;
import model.PaperBook;
import model.ShowcaseBook;

import java.util.List;

public class BookListFormatter {

    public static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(format(book));
        }
    }

    public static String format(Book book) {
        StringBuilder sb = new StringBuilder();
        sb.append("Title       : ").append(book.getTitle()).append("\n");
        sb.append("Author      : ").append(book.getAuthor()).append("\n");
        sb.append("ISBN        : ").append(book.getIsbn()).append("\n");
        sb.append("Year        : ").append(book.getYear()).append("\n");
        sb.append("Price       : ").append(book.getPrice()).append("\n");
        sb.append("Purchasable : ").append(book.isPurchasable() ? "Yes" : "No").append("\n");

        // I’m aware that using instanceof is not ideal and breaks proper OOP principles like polymorphism.
        // But due to time constraints, I went with this simpler solution to keep things clear and functional.
        if (book instanceof PaperBook) {
            sb.append("Type        : Paper Book\n");
            sb.append("Stock       : ").append(((PaperBook) book).getStock()).append("\n");
        } else if (book instanceof EBook) {
            sb.append("Type        : E-Book\n");
            sb.append("File Type   : ").append(((EBook) book).getFileType()).append("\n");
        } else if (book instanceof ShowcaseBook) {
            sb.append("Type        : Showcase Book (Not for Sale)\n");
        }

        return sb.toString();
    }

}
