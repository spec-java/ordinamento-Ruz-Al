public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 54, 21, 9, 15, 52, 68 };
        System.out.println("Array before bubble sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        BubbleSort.bubbleSort(array);
        System.out.println("\nArray after bubble sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nArray before bogo sorting: ");
        int[] array2 = { 54, 21, 9, 15, 52, 68 };
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        Bogo.bogoSort(array2);
        System.out.println("\nArray after bogo sorting: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println("\n\nString array before sorting: ");
        String[] stringArray = { "ale", "riccardo", "mattia", "alessandro", "giulia" };
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        BubbleSort.bubbleSortStringByLenght(stringArray);
        System.out.println("\nString array after sorting: ");
        BubbleSort.printArray(stringArray);
    }


public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int support = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = support;
                }
            }
        }
    }

    public static void bubbleSortStringByLenght(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String support = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = support;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

public class Bogo {

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
}

}
