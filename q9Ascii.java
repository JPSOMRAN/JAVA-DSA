import java.util.Scanner; 

public class q9Ascii { 
    public static void main(String[] args) { 
        // 1. Initialize the Scanner object
        try(Scanner sc = new Scanner(System.in)){ 
        
        System.out.print("Enter a character: ");
        
        // 2. Use lowercase 'c' for charAt(0)
        char ch = sc.next().charAt(0); 
        
        if (ch >= 'A' && ch <= 'Z') { 
            System.out.println("Uppercase"); 
        } else if (ch >= 'a' && ch <= 'z') { 
            System.out.println("Lowercase"); 
        } else if (ch >= '0' && ch <= '9') { 
            System.out.println("Digit"); 
        } else { 
            System.out.println("Special Character"); 
        } 
    }
        
        // 3. Close the scanner to release resources
     
    } 
}
