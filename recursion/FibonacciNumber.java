package recursion;

public class FibonacciNumber {
    static int fibonacci(int number) {
        // base case
        if (number == 0) return 0;
        if (number == 1) return 1;

        // recursive relation
        return fibonacci(number-1) + fibonacci(number-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
