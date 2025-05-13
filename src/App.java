import org.lessons.java.algoritmi.BogoSort;
import org.lessons.java.algoritmi.BubbleSort;
import org.lessons.java.algoritmi.QuickSort;

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

        System.out.println("\n\nArray before quick sorting: ");
        int[] array1 = { 54, 21, 9, 15, 52, 68 };
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        QuickSort.quickSort(array1, 0, array1.length - 1);
        System.out.println("\nArray after quick sorting: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\nArray before bogo sorting: ");
        int[] array2 = { 54, 21, 9, 15, 52, 68 };
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        BogoSort.bogoSort(array2);
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

        System.out.println("\n\nString array before bogo sorting: ");
        String[] stringArray1 = { "ale", "riccardo", "mattia", "alessandro", "giulia" };
        for (int i = 0; i < stringArray1.length; i++) {
            System.out.print(stringArray1[i] + " ");
        }
        BogoSort.bogoSort(stringArray1);
        System.out.println("\nString array after bogo sorting: ");

        for (int i = 0; i < stringArray1.length; i++) {
            System.out.print(stringArray1[i] + " ");
        }
    }

}
