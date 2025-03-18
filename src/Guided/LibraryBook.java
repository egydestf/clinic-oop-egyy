package Guided;

public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsBorrowed(boolean bool) {
        this.isBorrowed = bool;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("The Hunger Games");
        lb.setAuthor("Suzanne Collins");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.title);
        System.out.println("Author: " + lb.author);
        System.out.println("Is borrowed: " + lb.isBorrowed);
    }
}
