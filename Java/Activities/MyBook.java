package activities;

class MyBook extends Book {
    // Implementation of the abstract method setTitle
    @Override
    void setTitle(String title) {
        this.title = title;
    }


// Main class to test the implementation

    public static void main(String[] args) {
        // Create an object of MyBook
        MyBook newNovel = new MyBook();

        // Set the title of the book
        newNovel.setTitle("To Kill a Mockingbird");

        // Get and print the title of the book
        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}
