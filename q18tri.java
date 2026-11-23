import java.util.Scanner;

public class q18tri {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the rows: ");
            int n = sc.nextInt();
            
            // Outer loop for rows (1 to n)
            for (int i = 1; i <= n; i++) {
                
                // Inner loop 1: Print (n - i) spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                
                // Inner loop 2: Print i stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                
                // Move to the next row
                System.out.println();
            }
        }
    }
}