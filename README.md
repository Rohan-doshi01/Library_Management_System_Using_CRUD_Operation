# Library Management System

This is a basic Library Management System implemented in Java, showcasing CRUD operations and following the MVC (Model-View-Controller) architecture. The system allows users to manage books in a library setting.

## Files Structure

- **Controller**: Handles the business logic and user input.
  - `Controller.java`: Contains methods for adding, deleting, updating, and displaying books.
  
- **Model**: Represents the data and business logic.
  - `Books.java`: Defines the structure of a book with attributes like title, author, and year.
  
- **View**: Responsible for the user interface and displaying information.
  - `View.java`: Provides methods to display the list of books in a formatted manner.
  
- **Library**: Main entry point of the application.
  - `Library.java`: Contains the main method to run the library management system.

## Instructions

1. **Navigate to the project directory**:

   ```bash
   cd library-management-system

## Usage

Upon running the application, you will see a menu with options to:

- Add a new book
- Delete a book
- Update a book
- Display all books
- Exit the system

Follow the prompts to perform the desired actions.

## Example Usage

### Adding a Book:

1. Enter the title, author, and year of the book when prompted.

### Deleting a Book:

1. Enter the title of the book you want to delete.

### Updating a Book:

1. Enter the title of the book you want to update.
2. Provide the new title, author, and year.

### Displaying Books:

This option will list all the books currently in the library.

