import java.util.*;

public class q10Cal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st no.: ");
            int a = sc.nextInt();
            
            System.out.print("Enter 2nd no.: ");
            int b = sc.nextInt();
            
            // Added ^, >, < to the prompt options
            System.out.print("Enter operation (+, -, *, /, %, ^, >, <): ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Addition: " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.println("Division: " + (a / b));
                    }
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("Error: Cannot calculate modulus by zero!");
                    } else {
                        System.out.println("Modulus: " + (a % b));
                    }
                    break;
                case '^': // Power operation (a raised to the power of b)
                    System.out.println("Power: " + (int) Math.pow(a, b));
                    break;
                case '>': // Find the larger number
                    System.out.println("Maximum: " + Math.max(a, b));
                    break;
                case '<': // Find the smaller number
                    System.out.println("Minimum: " + Math.min(a, b));
                    break;
                default:
                    System.out.println("Invalid operator chosen!");
                    break;
            }
        }
    }
}
