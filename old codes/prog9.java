public class prog9{
    public static void main(String[] args){
        
        // decimal-form literal (float type suffix 'f' or 'F' is required)
        float a = 101.230f; 

        // It is a decimal literal despite the leading zero
        float b = 0123.222f; 

        // Hexadecimal floating-point literals ARE supported in Java (since Java 5).
        // They use 'p' or 'P' to specify the binary exponent.
    
        double c = 0x1.8p4;   // 1.8 (hex) × 2^3 = 12.0
      
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(c); 
    }
} 
    

