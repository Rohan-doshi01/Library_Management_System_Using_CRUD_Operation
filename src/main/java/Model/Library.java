package Model;

import java.util.Scanner;
import Controller.Controller;
import View.View;

public class Library {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Update Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    controller.addBook(title, author, year);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Title of book to delete: ");
                    String delTitle = scanner.nextLine();
                    controller.deleteBook(delTitle);
                    System.out.println("Book deleted successfully.");
                    break;
                case 3:
                    System.out.print("Enter Title of book to update: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter New Year: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    controller.updateBook(oldTitle, newTitle, newAuthor, newYear);
                    System.out.println("Book updated successfully.");
                    break;
                case 4:
                    controller.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
