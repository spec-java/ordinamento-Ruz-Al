package org.lessons.java.algoritmi;

public class BogoSort {

    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    private static void shuffle(int[] arr) {
        for (int x = 0; x < arr.length; ++x) {
            int index1 = (int) (Math.random() * arr.length);
            int index2 = (int) (Math.random() * arr.length);
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int x = 0; x < arr.length - 1; ++x) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bogoSort(String[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    private static void shuffle(String[] arr) {
        for (int x = 0; x < arr.length; ++x) {
            int index1 = (int) (Math.random() * arr.length);
            int index2 = (int) (Math.random() * arr.length);
            String temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

    private static boolean isSorted(String[] arr) {
        for (int x = 0; x < arr.length - 1; ++x) {
            if (arr[x].compareTo(arr[x + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
