package recursion;

public class ArraySortingCheck {
    static boolean isSorted(int[] arr, int size) {
        // base case
        if (size == 0 || size == 1) return true;

        // recursive relation
        if (arr[0] > arr[1]) return false;
        else return isSorted(arr, size-1);
    }
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1, 2}, 2));
    }
}
