package bookcase.book;

public interface interfaceCalculate {

    double EBOOK_RATE = 1.2;

    double NOVEL_NEW_RATE = 1.25;
    double NOVEL_GOOD_RATE = 1.35;
    double NOVEL_BEST_RATE = 1.5;

    double COMIC_NEW_TRUE_RATE = 1.35;
    double COMIC_NEW_FALSE_RATE = 1.25;

    double COMIC_GOOD_TRUE_RATE = 1.45;
    double COMIC_GOOD_FALSE_RATE = 1.3;

    double COMIC_BEST_TRUE_RATE = 1.5;
    double COMIC_BEST_FALSE_RATE = 1.4;

    double TAX_RATE = 0.05;

    double calculatePrice();

    double calculateTax();

}
