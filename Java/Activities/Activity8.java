package Activity8;

public class Activity8 {
	 public static void exceptionTest(String value) throws CustomException {
	        if (value == null) {
	            throw new CustomException("Input string is null. This is a custom exception.");
	        } else {
	            System.out.println("Input string: " + value);
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            // Test with a non-null string
	            exceptionTest("Hello, World!");

	            // Test with a null value
	            exceptionTest(null);
	        } catch (CustomException e) {
	            // Print custom error message
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }
	}

