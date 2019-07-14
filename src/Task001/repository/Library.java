package Task001.repository;

import Task001.entity.Book;
import Task001.service.LibraryImpl;

import java.util.Arrays;

public class Library implements LibraryImpl {
    public Library(String name, int size) {
        count++;
        this.name = name;
        books = new Book[size];
    }

    private static int count = 0;
    private String name;
    private Book[] books;


    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        Book.delCount();
        return false;
    }

    public boolean delBook(int id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIdBook() == id) {
                books[i] = null;
                Book.delCount();
                return true;
            }
        }
        return false;
    }

    public Book searchBook(String search){
        for (int i = 0; i < getBooks().length; i++) {
            if(getBooks()[i] != null && (getBooks()[i].getName().toLowerCase().indexOf(search.toLowerCase()) != -1 || getBooks()[i].getAuthor().toLowerCase().indexOf(search.toLowerCase()) != -1
                    || getBooks()[i].getGenre().getNameGenre().toLowerCase().indexOf(search.toLowerCase()) != -1)){
                return getBooks()[i];
            }
        }
        return null;
    }

    public Book searchBookFromId(int id){
        for (int i = 0; i < getBooks().length; i++) {
            if(getBooks()[i] != null && getBooks()[i].getIdBook() == id){
                return getBooks()[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
