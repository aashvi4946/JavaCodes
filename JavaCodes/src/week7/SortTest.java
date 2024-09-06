package week7;

// SortTest.java

public class SortTest {

    // Bubble Sort algorithm
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort algorithm
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test sorting algorithms
    public static void main(String[] args) {
        SortTest sorter = new SortTest();

        int[] bubbleSortArray = {64, 34, 25, 12, 22, 11, 90};
        int[] selectionSortArray = {64, 25, 12, 22, 11};

        System.out.println("Original array for Bubble Sort:");
        sorter.printArray(bubbleSortArray);
        
        // Apply Bubble Sort
        sorter.bubbleSort(bubbleSortArray);
        System.out.println("Sorted array using Bubble Sort:");
        sorter.printArray(bubbleSortArray);

        System.out.println("Original array for Selection Sort:");
        sorter.printArray(selectionSortArray);
        
        // Apply Selection Sort
        sorter.selectionSort(selectionSortArray);
        System.out.println("Sorted array using Selection Sort:");
        sorter.printArray(selectionSortArray);
    }
}

