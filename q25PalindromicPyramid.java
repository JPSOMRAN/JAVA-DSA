import java.util.Scanner;

public class q25PalindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Part 1: Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Part 2: Descending numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Part 3: Ascending numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}