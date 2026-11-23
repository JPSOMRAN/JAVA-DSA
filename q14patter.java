import java.util.*; 

public class q14patter { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        // Take actual input from the user instead of hardcoding
        System.out.print("Enter the rows: "); 
        int n = sc.nextInt(); 
        
        System.out.print("Enter Columns: "); 
        int m = sc.nextInt(); 
        
        // Outer loop for rows
        for(int i = 1; i <= n; i++) { 
            // Inner loop for columns
            for(int j = 1; j <= m; j++) { 
                System.out.print("*"); // CHANGED: print() keeps stars on the same row
            } 
            System.out.println(); // Moves to the next row
        } 
        
        sc.close(); 
    } 
}
