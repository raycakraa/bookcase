package bookcase.repository;

import java.util.ArrayList;

import bookcase.author.AuthorAbs;
import bookcase.book.Book;
import bookcase.entity.AuthorEntity;
import bookcase.entity.CommercialBookEntity;
import bookcase.entity.PublisherEntity;
import bookcase.publisher.Publisher;

import java.util.List;

public class RepositoryBook {

    public RepositoryBook() {

    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        books.add((Book) CommercialBookEntity.ebook1);
        books.add((Book) CommercialBookEntity.ebook2);
        books.add((Book) CommercialBookEntity.ebook3);
        books.add((Book) CommercialBookEntity.ebook4);
        books.add((Book) CommercialBookEntity.ebook5);
        books.add((Book) CommercialBookEntity.ebook6);
        books.add((Book) CommercialBookEntity.ebook7);
        books.add((Book) CommercialBookEntity.ebook8);

        books.add((Book) CommercialBookEntity.novel1);
        books.add((Book) CommercialBookEntity.novel2);
        books.add((Book) CommercialBookEntity.novel3);
        books.add((Book) CommercialBookEntity.novel4);
        books.add((Book) CommercialBookEntity.novel5);
        books.add((Book) CommercialBookEntity.novel6);
        books.add((Book) CommercialBookEntity.novel7);
        books.add((Book) CommercialBookEntity.novel8);

        books.add((Book) CommercialBookEntity.comic1);
        books.add((Book) CommercialBookEntity.comic2);
        books.add((Book) CommercialBookEntity.comic3);
        books.add((Book) CommercialBookEntity.comic4);
        books.add((Book) CommercialBookEntity.comic5);
        books.add((Book) CommercialBookEntity.comic6);
        books.add((Book) CommercialBookEntity.comic7);
        books.add((Book) CommercialBookEntity.comic8);

        return books;
    }

    public List<AuthorAbs> getAllAuthors() {
        List<AuthorAbs> authors = new ArrayList<>();

        authors.add((AuthorAbs) AuthorEntity.author1);
        authors.add((AuthorAbs) AuthorEntity.author2);
        authors.add((AuthorAbs) AuthorEntity.author3);
        authors.add((AuthorAbs) AuthorEntity.author4);
        authors.add((AuthorAbs) AuthorEntity.author5);
        authors.add((AuthorAbs) AuthorEntity.author6);

        authors.add((AuthorAbs) AuthorEntity.novelist1);
        authors.add((AuthorAbs) AuthorEntity.novelist2);
        authors.add((AuthorAbs) AuthorEntity.novelist3);
        authors.add((AuthorAbs) AuthorEntity.novelist4);
        authors.add((AuthorAbs) AuthorEntity.novelist5);

        authors.add((AuthorAbs) AuthorEntity.mangaka1);
        authors.add((AuthorAbs) AuthorEntity.mangaka2);
        authors.add((AuthorAbs) AuthorEntity.mangaka3);
        authors.add((AuthorAbs) AuthorEntity.mangaka4);
        authors.add((AuthorAbs) AuthorEntity.mangaka5);

        return authors;
    }

    public List<Publisher> getAllPublishers() {
        List<Publisher> publishers = new ArrayList<>();

        publishers.add((Publisher) PublisherEntity.publisher1);
        publishers.add((Publisher) PublisherEntity.publisher2);
        publishers.add((Publisher) PublisherEntity.publisher3);
        publishers.add((Publisher) PublisherEntity.publisher4);
        publishers.add((Publisher) PublisherEntity.publisher5);
        publishers.add((Publisher) PublisherEntity.publisher6);
        publishers.add((Publisher) PublisherEntity.publisher7);
        publishers.add((Publisher) PublisherEntity.publisher8);
        publishers.add((Publisher) PublisherEntity.publisher9);

        return publishers;
    }

}
