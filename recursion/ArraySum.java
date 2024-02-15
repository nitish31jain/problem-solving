package recursion;

public class ArraySum {

    static int getSum(int[] arr, int index, int size) {
        // base case
        if (size == 0) return 0;
        if (size == 1) return arr[0];

        // recursive relation
        return arr[0] + arr[index] + getSum(arr, index+1, size-1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(new int[] {1, 2, 3, 4, 5}, 0, 5));
    }
}
