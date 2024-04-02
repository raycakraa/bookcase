package bookcase.book;

import bookcase.author.Mangaka;
import bookcase.publisher.Publisher;

public class Comic extends Book implements interfaceCalculate {

    private static Mangaka mangaka;
    private boolean isSeries;
    private double tax;
    // private static Publisher publisher;

    public Comic(String bookCode, String title, Mangaka mangaka, Publisher publisher, double price, boolean isSeries,
            double tax) {
        super(bookCode, title, publisher, price);
        // TODO Auto-generated constructor stub
        Comic.mangaka = mangaka;
        this.isSeries = isSeries;
        this.tax = tax;
    }

    public Mangaka getMangaka() {
        return mangaka;
    }

    public void setMangaka(Mangaka mangaka) {
        Comic.mangaka = mangaka;
    }

    public boolean isSeries() {
        return isSeries;
    }

    public void setSeries(boolean isSeries) {
        this.isSeries = isSeries;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double calculatePrice() {
        if (mangaka.getRating().equals("New Commer")) {

            if (isSeries == true) {
                return getPublisher().getProductionCost() * 1.35;
            } else {
                return getPublisher().getProductionCost() * 1.25;
            }

        } else if (mangaka.getRating().equals("Good")) {

            if (isSeries == true) {
                return getPublisher().getProductionCost() * 1.45;
            } else {
                return getPublisher().getProductionCost() * 1.3;
            }

        } else if (mangaka.getRating().equals("Best Seller")) {

            if (isSeries == true) {
                return getPublisher().getProductionCost() * 1.5;
            } else {
                return getPublisher().getProductionCost() * 1.4;
            }

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
