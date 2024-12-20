package activities;


public class Activity2 {
    public static void main(String[] args) {
        // Initialize an array with 6 numbers
        int[] numbers = {10, 77, 10, 54, -11, 10};

        // Variable to store the sum of 10's
        int sum = 0;

        // Iterate through the array
        for (int num : numbers) {
            // Check if the number is 10
            if (num == 10) {
                sum += num;
            }
        }

        // Check if the sum is equal to 30
        if (sum == 30) {
            System.out.println("The sum of all 10's is exactly 30.");
        } else {
            System.out.println("The sum of all 10's is not 30. It is: " + sum);
        }
    }
}