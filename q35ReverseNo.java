import java.util.Scanner;

public class q35ReverseNo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int rev = 0;

            while (n > 0) {
                int digit = n % 10;      // 'digit' is scoped ONLY to this while block
                rev = rev * 10 + digit;
                n = n / 10;
            }
            // System.out.println(digit); // ERROR: 'digit' cannot be resolved outside the loop
            System.out.println("Reversed: " + rev);
        }
    }
}