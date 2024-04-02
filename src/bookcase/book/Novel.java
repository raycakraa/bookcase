package bookcase.book;

import bookcase.author.Novelist;
import bookcase.publisher.Publisher;

public class Novel extends Book implements interfaceCalculate {

    private static Novelist novelist;
    // private static Publisher publisher;
    private String genre;

    public Novel(String bookCode, String title, Novelist novelist, Publisher publisher, double price, String genre) {
        super(bookCode, title, publisher, price);
        // TODO Auto-generated constructor stub
        Novel.novelist = novelist;
        this.genre = genre;
    }

    public static Novelist getNovelist() {
        return novelist;
    }

    public static void setNovelist(Novelist novelist) {
        Novel.novelist = novelist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double calculatePrice() {
        if (novelist.getRating().equals("New Commer")) {

            return getPublisher().getProductionCost() * 1.25;

        } else if (novelist.getRating().equals("Good")) {

            return getPublisher().getProductionCost() * 1.35;

        } else if (novelist.getRating().equals("Best Seller")) {

            return getPublisher().getProductionCost() * 1.5;

        }

        return getPublisher().getProductionCost();

    }

    @Override
    public double calculateTax() {
        return calculatePrice() * 0.05;
    }

    public double getPrice() {
        return calculatePrice();
    }
}
