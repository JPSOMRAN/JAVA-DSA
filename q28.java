import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        // --- Part 1: Print Even Numbers ---
        try (Scanner sc = new Scanner(System.in)) {
            // --- Part 1: Print Even Numbers ---
            System.out.println("--- Even Numbers up to 25 ---");
            int limit = 25;
            for (int i = 1; i <= limit; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
            
            // --- Part 2: Prime Check ---
            System.out.print("Enter a number to check prime: ");
            int n = sc.nextInt();
            boolean isPrime = true;
            
            if (n <= 1) {
                System.out.println("This is neither prime nor composite");
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    System.out.println(n + " is a prime number");
                } else {
                    System.out.println(n + " is not a prime number");
                }
            }
            
            // --- Part 3: Menu Driven Marks System ---
            int input;
            do {
                System.out.print("\nEnter student marks (0-100): ");
                int marks = sc.nextInt();
                
                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid Marks");
                }
                
                System.out.print("Want to continue? (yes(1) or no(0)): ");
                input = sc.nextInt();
                
            } while (input == 1);
        }
    }
}