package activities;

abstract class Book {
    // Variable to store the title
    String title;

    // Abstract method to set the title
    abstract void setTitle(String title);

    // Concrete method to get the title
    public String getTitle() {
        return title;
    }
}