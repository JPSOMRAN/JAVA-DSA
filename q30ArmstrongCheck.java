 import java.util.Scanner;

public class q30ArmstrongCheck {

    // Helper method to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        if (n < 0) return false;

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");

            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                System.out.println(isArmstrong(n) ? "This is an Armstrong number" : "This is not an Armstrong number");
            } else {
                System.out.println("Error: Please enter a valid integer.");
            }
        }
    }

    
}
