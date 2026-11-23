import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        // The scanner is inside the parentheses of the 'try' statement
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } // Scanner closes automatically here!
    }

}
