package bookcase.menu;

// import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bookcase.author.AuthorAbs;
import bookcase.book.Book;
import bookcase.publisher.Publisher;
import bookcase.repository.RepositoryBook;

public class mainMenu {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        String menu = menu();
        System.out.println(menu);

    }

    public static String menu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("	MAIN MENU	");
        System.out.println("================");
        System.out.println("1. Book");
        System.out.println("2. Author");
        System.out.println("3. Publisher");
        System.out.println("================");

        System.out.print("Pilih Menu: ");
        int menu = scan.nextInt();

        if (menu == 1) {
            bookMenu();
        } else if (menu == 2) {
            authorMenu();
        } else if (menu == 3) {
            publisherMenu();
        }
        scan.close();
        return "";
    }

    public static String bookMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("	BOOK MENU	");
        System.out.println("================");
        System.out.println("1. Buku dengan harga termurah");
        System.out.println("2. Buku dengan harga termahal");
        System.out.println("3. Buku berdasarkan range harga");
        System.out.println("4. Komik berdasarkan rating mangaka");
        System.out.println("5. Buku berdasarkan negara publisher");
        System.out.println("6. Buku berdasarkan negara author");
        System.out.println("7. Komik dengan harga termahal");
        System.out.println();
        System.out.println("0. Back to Main Menu");
        System.out.println("================");

        System.out.print("Pilih Menu: ");
        int chooseBook = scan.nextInt();

        if (chooseBook == 0) {
            menu();
        } else if (chooseBook == 1) {
            findCheapestBook();
        } else if (chooseBook == 2) {
            findExpensiveBook();
        } else if (chooseBook == 3) {
            findBooksByRange();
        } else if (chooseBook == 4) {
            findComicByRating();
        } else if (chooseBook == 5) {
            findBooksByCountryPublisher();
        } else if (chooseBook == 6) {
            findBooksByCountryAuthor();
        } else if (chooseBook == 7) {
            findExpensiveComic();
        }

        scan.close();
        return "";
    }

    public static String authorMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("	   AUTHOR MENU		");
        System.out.println("================");
        System.out.println("1. Data mangaka");
        System.out.println("2. Data author");
        System.out.println("3. Data novelis");
        System.out.println("4. Data author berdasarkan range umur");
        System.out.println("5. Data author berdasarkan negara");
        System.out.println();
        System.out.println("0. Back to Main Menu");
        System.out.println("================");

        System.out.print("Pilih Menu: ");
        int chooseAuthor = scan.nextInt();

        if (chooseAuthor == 0) {
            menu();
        } else if (chooseAuthor == 1) {
            findMangakaData();
        } else if (chooseAuthor == 2) {
            findAuthorData();
        } else if (chooseAuthor == 3) {
            findNovelistData();
        } else if (chooseAuthor == 4) {
            findAuthorByAge();
        } else if (chooseAuthor == 5) {
            findAuthorByCountry();
        }

        scan.close();
        return "";
    }

    public static String publisherMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("	   PUBLISHER MENU		");
        System.out.println("================");
        System.out.println("1. Publisher dengan production cost termahal");
        System.out.println("2. Publisher dengan production cost termurah");
        System.out.println();
        System.out.println("0. Back to Main Menu");
        System.out.println("================");

        System.out.print("Pilih Menu: ");
        int choosePublisher = scan.nextInt();

        if (choosePublisher == 0) {
            menu();
        } else if (choosePublisher == 1) {
            findPublisherWithExpensiveCost();
        } else if (choosePublisher == 2) {
            findPublisherWithCheapestCost();
        }

        scan.close();
        return "";
    }

    private static void findCheapestBook() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();

        Book cheapestBook = books.get(0);
        for (Book book : books) {
            if (book.getPrice() < cheapestBook.getPrice()) {
                cheapestBook = book;
            }
        }

        System.out.println(cheapestBook);
    }

    private static void findExpensiveBook() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();

        Book expensiveBook = books.get(0);
        for (Book book : books) {
            if (book.getPrice() > expensiveBook.getPrice()) {
                expensiveBook = book;
            }
        }

        System.out.println(expensiveBook);
    }

    private static void findBooksByRange() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();
        Scanner scan = new Scanner(System.in);

    }

    private static void findComicByRating() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();
        Scanner scan = new Scanner(System.in);

    }

    private static void findBooksByCountryPublisher() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();
        Scanner scan = new Scanner(System.in);

    }

    private static void findBooksByCountryAuthor() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();
        Scanner scan = new Scanner(System.in);

    }

    private static void findExpensiveComic() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> books = repositoryBook.getAllBooks();
        Scanner scan = new Scanner(System.in);

    }

    private static void findMangakaData() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorAbs> mangaka = repositoryBook.getAllAuthors();

        System.out.println(mangaka);

    }

    private static void findAuthorData() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorAbs> authors = repositoryBook.getAllAuthors();
        Scanner scan = new Scanner(System.in);

    }

    private static void findNovelistData() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorAbs> authors = repositoryBook.getAllAuthors();
        Scanner scan = new Scanner(System.in);

    }

    private static void findAuthorByAge() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorAbs> authors = repositoryBook.getAllAuthors();
        Scanner scan = new Scanner(System.in);

    }

    private static void findAuthorByCountry() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorAbs> authors = repositoryBook.getAllAuthors();
        Scanner scan = new Scanner(System.in);

    }

    private static void findPublisherWithExpensiveCost() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Publisher> publishers = repositoryBook.getAllPublishers();
        Scanner scan = new Scanner(System.in);

    }

    private static void findPublisherWithCheapestCost() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Publisher> publishers = repositoryBook.getAllPublishers();
        Scanner scan = new Scanner(System.in);

    }

}
