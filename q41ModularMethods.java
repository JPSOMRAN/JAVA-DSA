public class q41ModularMethods {
    public static void main(String[] args) {
        // 1.Pass-by-value test
        int score = 50;
        boostScore(score);
        System.out.println("Score in main after method call: " + score);

        // 2.Clean modular method calls
        printPrimesInRange(10, 30);
    }

    public static void boostScore(int s) {
        s += 25; // Only modifies the local copy 's'
        System.out.println("Score inside boostScore(): " + s);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        System.out.print("Primes between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}