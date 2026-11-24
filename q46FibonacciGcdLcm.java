public class q46FibonacciGcdLcm {
    public static void main(String[] args) {
        printFibonacci(8);

        int a = 36, b = 48;
        System.out.println("GCD of " + a + " and " + b + " = " + findGCD(a, b));
        System.out.println("LCM of " + a + " and " + b + " = " + findLCM(a, b));
    }

    public static void printFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci (" + terms + " terms): ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Euclidean Algorithm: O(log(min(a, b)))
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a / findGCD(a, b)) * b; // Divide first to prevent integer overflow
    }
}