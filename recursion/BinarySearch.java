package recursion;

public class BinarySearch {
    static boolean isFound(int[] arr, int start, int end, int key) {
        // base case
        if (start > end) return false;

        int mid = (start + end) / 2;
        if (arr[mid] == key) return true;

        // recursive relation
        if (arr[mid] < key)
            return isFound(arr, mid+1, end, key);
        else
            return isFound(arr, start, mid-1, key);
    }
    public static void main(String[] args) {
        System.out.println(isFound(new int[] {1, 2, 3}, 0, 2, 11));
    }
}
