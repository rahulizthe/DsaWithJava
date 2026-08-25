public class Recursion8{
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 6 is: " + fibonacci(6)); // Output: 8
    }
}   
