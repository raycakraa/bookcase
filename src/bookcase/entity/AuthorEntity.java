package bookcase.entity;

import bookcase.author.Author;
import bookcase.author.Mangaka;
import bookcase.author.Novelist;

public class AuthorEntity {
    public static Author author1 = new Author("Haidar", "Musyafa", "Indonesia", 30);
    public static Author author2 = new Author("Bert", "Bates", "United State", 50);
    public static Author author3 = new Author("Barry", "Burd", "United State", 52);
    public static Author author4 = new Author("Mark", "Manson", "United State", 38);
    public static Author author5 = new Author("Andi", "Susanto", "Indonesia", 32);
    public static Author author6 = new Author("Adi", "Sutanto", "Indonesia", 27);

    public static Novelist novelist1 = new Novelist("J.K", "Rowling", "England", 57, "Best Seller", true);
    public static Novelist novelist2 = new Novelist("Tere", "Liye", "Indonesia", 35, "Best Seller", true);
    public static Novelist novelist3 = new Novelist("Dee", "Lestari", "Indonesia", 30, "Good", true);
    public static Novelist novelist4 = new Novelist("Faisal", "Syahreza", "Indonesia", 40, "New Commer", true);
    public static Novelist novelist5 = new Novelist("Julia", "Golding", "England", 41, "Best Seller", false);

    public static Mangaka mangaka1 = new Mangaka("Masashi", "Kishimotor", "Japan", 48, "Best Seller");
    public static Mangaka mangaka2 = new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good");
    public static Mangaka mangaka3 = new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller");
    public static Mangaka mangaka4 = new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Commer");
    public static Mangaka mangaka5 = new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Commer");
}
