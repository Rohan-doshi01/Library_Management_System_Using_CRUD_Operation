package Model;

public class Books {
    private String bookTitle;
    private String author;
    private int year;
    
    public Books(String bookTitle, String author, int year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}
