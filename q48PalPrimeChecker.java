public class q48PalPrimeChecker {
    public static void main(String[] args) {
        System.out.print("Palindromic Primes (1 to 200): ");
        for (int i = 1; i <= 200; i++) {
            if (isPalPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method calling other methods
    public static boolean isPalPrime(int n) {
        return isPalindrome(n) && isPrime(n);
    }
}