package activities;

public class Activity4 {
    public static void main(String[] args) {
        // Initialize an array with numbers in random order
        int[] numbers = {9, 5, 1, 4, 3, 62};

        // Display the array before sorting
        System.out.println("Array before sorting:");
        printArray(numbers);

        // Sort the array using insertion sort
        insertionSort(numbers);

        // Display the array after sorting
        System.out.println("\nArray after sorting:");
        printArray(numbers);
    }

    // Method to perform insertion sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

