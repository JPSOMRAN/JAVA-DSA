import java.util.Scanner;

public class q23Rhombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
                // Print leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print n stars
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}