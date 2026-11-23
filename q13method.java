 public class q13method { 
    public static void main(String[] args) { 
        // Declaring our inputs
        int input1 = 5; 
        int input2 = 3; 

        System.out.println("--- Starting the program ---"); 
        System.out.println("Inputs chosen: " + input1 + " and " + input2); 

        // 2. THE METHOD CALLS
        // Calling the addition machine
        int addResult = add(input1, input2); 
        
        // Calling our brand new multiplication machine
        int multiplyResult = multiply(input1, input2); 

        // 3. THE FINAL OUTPUT 
        System.out.println("The add() method returned: " + addResult); 
        System.out.println("The multiply() method returned: " + multiplyResult); 
        System.out.println("--- Program finished ---"); 
    } 

    // 4. THE METHOD DEFINITIONS (Mandatory Blueprints)
    
    // Addition Machine
    static int add(int a, int b) { 
        int sum = a + b; 
        return sum; 
    } 

    // Multiplication Machine
    // Uses the '*' symbol to multiply 'a' times 'b'
    static int multiply(int a, int b) {
        int product = a * b; // Calculates 5 * 3 = 15
        return product;      // Delivers 15 back to main()
    }
}
  