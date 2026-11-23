import java.util.*; 

public class q17tri { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the rows: "); 
        int n = sc.nextInt(); 
        
        // Outer loop for rows
        for (int i = n; i >= 1; i--) { 
            // Inner loop for columns
            for (int j = 1; j <= i; j++) { 
                // Print '*' for boundary cells, space ' ' for inner cells
              
                    System.out.print("*");
             
            } 
            System.out.println(); // Move to the next line after completing a row
        } 
        
        sc.close(); 
    } 
}