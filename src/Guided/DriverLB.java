package Guided;

public class DriverLB {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("The Hunger Games");
        lb.setAuthor("Suzanne Collins");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.getTitle());
        System.out.println("Author: " + lb.getAuthor());
        System.out.println("Is borrowed: " + lb.getIsBorrowed());
    }
}
