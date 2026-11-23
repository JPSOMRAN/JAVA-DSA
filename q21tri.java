import java.util.Scanner;

public class q21tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        int number = 1; // Counter starts at 1

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop: print 'i' numbers per row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment number after printing
            }
            
            // Move to the next row
            System.out.println();
        }

        sc.close();
    }
}