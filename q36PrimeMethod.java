import java.util.*;

public class q36PrimeMethod {
    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is Not Prime");
            return; //Exits the method immediately (no value returned because return type is void)
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is Not Prime");
                return;
            }
        }
        System.out.println(n + " is Prime");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            checkPrime(num); // Passes a copy of 'num' into parameter 'n'
        }
    }
}