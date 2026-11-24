public class q47DiamondPatternMethod {
    public static void main(String[] args) {
        printDiamond(4);
    }

    public static void printDiamond(int n) {
        // Upper half (1 to n)
        for (int i = 1; i <= n; i++) {
            printRow(n - i, 2 * i - 1);
        }
        // Lower half (n - 1 down to 1)
        for (int i = n - 1; i >= 1; i--) {
            printRow(n - i, 2 * i - 1);
        }
    }

    // Helper method keeps nested loop clean and readable
    private static void printRow(int spaces, int stars) {
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
        for (int st = 0; st < stars; st++) {
            System.out.print("*");
        }
        System.out.println();
    }
}