import java.util.*;

public class RecCheckSort {
    public static boolean checkSorted(int[] array, int index) {
         

        if (index == array.length - 1) {
            return true;
        }

        if (array[index] < array[index + 1]) {
            return checkSorted(array, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int index = 0;
        boolean isSorted = checkSorted(array, index);
        System.out.println("Is the array sorted? " + isSorted);
    }
}