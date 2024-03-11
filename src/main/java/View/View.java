package View;

import java.util.List;
import Model.*;

public class View {
    public void displayBooks(List<Books> books) {
        System.out.println("Library Books:");
        for (Books book : books) {
            System.out.println("Title: " + book.getBookTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println("--------------------------");
        }
    }
}
