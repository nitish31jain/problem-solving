package recursion;

public class LinearSearch {
    static boolean isFound(int[] arr, int index, int size, int key) {
        // base case
        if (size == 0) return false;

        // recursive relation
        if (arr[index] == key) return true;
        return isFound(arr, index+1, size-1, key);
    }
    public static void main(String[] args) {
        System.out.println(isFound(new int[] {1, 2, 3}, 0, 3, 3));
    }
}
