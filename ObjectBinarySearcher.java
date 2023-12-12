/*
 The IntBinarySearcher class presented in this chapter searches an int array for a specific
value. Create an ObjectBinarySearcher class that can search an array of Comparable objects.
Demonstrate the class in a program that searches for a String in an array of String objects.
Searching for Objects with the Binary Search Algorithm
 */

public class ObjectBinarySearcher {

    // Generic binary search method
    public static <T extends Comparable<T>> int binarySearch(T[] array, T value) {
        return binarySearchUtil(array, value, 0, array.length - 1);
    }

    // Helper method
    public static <T extends Comparable<T>> int binarySearchUtil(T[] array, T value, int lo, int hi) {
        if (lo <= hi) {
            int mid = (lo + hi) / 2;
            int cmp = value.compareTo(array[mid]);

            if (cmp < 0) return binarySearchUtil(array, value, lo, mid - 1);
            if (cmp > 0) return binarySearchUtil(array, value, mid + 1, hi);

            return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(binarySearch(arr, 4));
    }
}
