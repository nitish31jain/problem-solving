package recursion;

class Factorial {
    static int factorial(int number) {
        // base case
        if (number == 0) return 1;

        // recursive call
        return number * factorial(number-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}