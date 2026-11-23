import java.util.Scanner;

public class q29PrimeCheck {
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        // Use long to prevent integer overflow when i * i grows large
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner to prevent memory leaks
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            
            // Input validation: Check if user input is an integer before reading it
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                
                // Ternary operator to cleanly print the result on one line
                System.out.println(isPrime(n) ? "This is a prime number" : "This is not a prime number");
            } else {
                System.out.println("Error: Please enter a valid integer.");
            }
        }
    }
}
