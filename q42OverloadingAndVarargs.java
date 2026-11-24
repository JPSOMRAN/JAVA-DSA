public class q42OverloadingAndVarargs {
    public static void main(String[] args) {
        // 1. Overloaded methods
        System.out.println("Square of 6: " + calculate(6));
        System.out.println("Power 2^5: " + calculate(2, 5));
        System.out.printf("Circle Area (r=3.5): %.2f\n", calculate(3.5));

        // 2. Varargs method
        System.out.printf("Average of 3 numbers: %.2f\n", averageOf(10, 20, 30));
        System.out.printf("Average of 5 numbers: %.2f\n", averageOf(12, 18, 25, 30, 40));

        // 3. Decimal to Binary conversion method
        int dec = 25;
        System.out.println("Decimal " + dec + " in Binary: " + decimalToBinary(dec));
    }

    // Overload 1: 1 int parameter (Square)
    public static int calculate(int n) {
        return n * n;
    }

    // Overload 2:2 int parameters (Power)
    public static int calculate(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    // Overload 3: 1 double parameter (Circle Area)
    public static double calculate(double radius) {
        return Math.PI * radius * radius;
    }

    // Varargs: accepts 0 or more ints
    public static double averageOf(int... nums) {
        if (nums.length == 0) return 0.0;
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return (double) sum / nums.length;
    }

    // Decimal to Binary using pure arithmetic (no built-in helper)
    public static int decimalToBinary(int n) {
        int binary = 0;
        int place = 1;
        while (n > 0) {
            int rem = n % 2;
            binary += rem * place;
            place *= 10;
            n /= 2;
        }
        return binary;
    }
}