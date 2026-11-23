import java.util.Scanner;

public class q22tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                
                // If sum of row index and column index is even, print 1
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else { // If odd, print 0
                    System.out.print("0 ");
                }
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }

        sc.close();
    }
}