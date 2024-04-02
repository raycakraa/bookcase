package bookcase.book;

import bookcase.author.Author;
import bookcase.publisher.Publisher;

public class EBook extends Book implements interfaceCalculate {

    private static Author author;
    // private Publisher publisher;
    // private static double price;

    public EBook(String bookCode, String title, Author author, Publisher publisher, double price) {
        super(bookCode, title, publisher, price);
        // TODO Auto-generated constructor stub
        EBook.author = author;
    }

    public static Author getAuthor() {
        return author;
    }

    public static void setAuthor(Author author) {
        EBook.author = author;
    }

    @Override
    public double calculatePrice() {
        return getPublisher().getProductionCost() * 1.2;
    }

    @Override
    public double calculateTax() {
        return 0;
    }

    public double getPrice() {
        return calculatePrice();
    }

}
