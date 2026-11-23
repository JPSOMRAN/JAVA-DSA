import java.util.*; 

public class q15HollowSquarePattern { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the rows: "); 
        int n = sc.nextInt(); 
        
        System.out.print("Enter Columns: "); 
        int m = sc.nextInt(); 
        
        // Outer loop for rows
        for (int i = 1; i <= n; i++) { 
            // Inner loop for columns
            for (int j = 1; j <= m; j++) { 
                // Print '*' for boundary cells, space ' ' for inner cells
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println(); // Move to the next line after completing a row
        } 
        
        sc.close(); 
    } 
}