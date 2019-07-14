package Task001.service;

import Task001.entity.Book;

public interface LibraryImpl {
    boolean addBook(Book book);
    boolean delBook(int id);
    Book searchBook(String search);
    Book searchBookFromId(int id);

}
