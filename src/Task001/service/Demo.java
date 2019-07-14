package Task001.service;

import Task001.entity.Genres;
import Task001.repository.Library;
import Task001.entity.Book;

public class Demo {
    public void go(){
        Library myLibrary = new Library("Моя библиотека", 2);
        Book[] myBooks = {
                new Book("Моя первая книга", "Алексей Биянов", Genres.Fantastic),
                new Book("Дорога домой","Зыков",Genres.Fantastic),
                new Book("Книга, которая никуда не добавится", "Автор тоже никому не нужен", Genres.Detective),
        };

        for (Book book:myBooks
             ) {
            myLibrary.addBook(book);
        }

        System.out.println(myLibrary.toString());
        System.out.println("Count: " + Book.getCount());

        myLibrary.delBook(2);

        System.out.println(myLibrary.toString());
        System.out.println("Count: " + Book.getCount());

        String search = "Зыков";
        if (myLibrary.searchBook(search) != null){
            System.out.println("Результат поиска: " + myLibrary.searchBook(search));
        }
        else {
            System.out.println("Ничего не найдено");
        }
    }

}
