package Activity8;

class CustomException extends Exception {
    private String message;

    // Constructor to initialize custom message
    public CustomException(String message) {
        this.message = message;
    }

    // Override getMessage() method
    @Override
    public String getMessage() {
        return message;
    }
}