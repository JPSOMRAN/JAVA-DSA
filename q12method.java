public class q12method {


    // 1. THE ENTRY POINT
    // This is where the Java program starts running.
    public static void main(String[] args) {
        
        // Declaring our inputs
        int input1 = 5;
        int input2 = 3;
        
        System.out.println("--- Starting the program ---");
        System.out.println("Inputs chosen: " + input1 + " and " + input2);
        
        // 2. THE METHOD CALL
        // We pass 'input1' (5) and 'input2' (3) into the add() method machine.
        // The method will execute and send back the number 8.
        // We store that returned output inside a variable named 'result'.
        int result = add(input1, input2);
        
        // 3. THE FINAL OUTPUT
        // Printing the result to the console window.
        System.out.println("The add() method returned: " + result);
        System.out.println("--- Program finished ---");
    }

    // 4. THE METHOD DEFINITION
    // This is the actual machine designed to perform the particular task.
    // 'int' means this method MUST return an integer output.
    // 'int a' and 'int b' are placeholders that catch the numbers 5 and 3.
    static int add(int a, int b) {
        
        // Operation step: The computer calculates 5 + 3
        int sum = a + b;
          // Output step: Deliver the final answer (8) back to the main program
        return sum; 
    }


}
