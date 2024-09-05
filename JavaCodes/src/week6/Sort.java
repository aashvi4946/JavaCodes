package week6;

// Define the Sortable interface
interface Sortable {
    void sort(int[] array);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Create an array of integers to be sorted
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = array1.clone(); // Clone the array for selection sort

        // Sort using BubbleSort
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(array1);
        System.out.println("Sorted array using BubbleSort:");
        printArray(array1);

        // Sort using SelectionSort
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(array2);
        System.out.println("Sorted array using SelectionSort:");
        printArray(array2);
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


