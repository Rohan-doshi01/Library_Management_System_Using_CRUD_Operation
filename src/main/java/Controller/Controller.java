package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.*;
import View.View;

public class Controller {
    private List<Books> books;
    private View view;
    
    public Controller(View view) {
        this.books = new ArrayList<>();
        this.view = view;
    }
    
    public void addBook(String title, String author, int year) {
        Books newBook = new Books(title, author, year);
        books.add(newBook);
    }
    
    public void deleteBook(String title) {
        boolean found = false;
        for (Books book : books) {
            if (book.getBookTitle().equals(title)) {
                books.remove(book);
                found = true;
                break;
            }
        }
        
        if (!found) {
            throw new IllegalArgumentException("Book not found: " + title);
        }
    }
    
    public List<Books> getBooks() {
        return books;
    }
    
    public void updateBook(String title, String newTitle, String newAuthor, int newYear) {
        boolean found = false;
        for (Books book : books) {
            if (book.getBookTitle().equals(title)) {
                book.setBookTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setYear(newYear);
                found = true;
                break;
            }
        }
        
        if (!found) {
            throw new IllegalArgumentException("Book not found: " + title);
        }
    }
    
    public void displayBooks() {
        view.displayBooks(books);
    }
}