package org.lessons.java.algoritmi;

public class QuickSort {
    public static void quickSort(int[] array, int beginning, int end) {
        if (beginning < end) {
            // prima chiamata: beginning = 0, end = 5
            int pivotIndex = partition(array, beginning, end);
            quickSort(array, beginning, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }
    
    private static int partition(int[] array, int beginning, int end) {
        int pivot = array[end];
        int i = (beginning - 1);
        for (int j = beginning; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
}

private static void swap(int[] array, int el1, int el2) {
        int temp = array[el1];
        array[el1] = array[el2];
        array[el2] = temp;
    }
}
