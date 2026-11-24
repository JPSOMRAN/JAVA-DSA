public class q40LabeledLoopsAndNumbers {
    public static void main(String[] args) {
        // 1. Strong Number Check using while + for loops
        int num = 145;
        int temp = num;
        int factorialSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            factorialSum += fact;
            temp /= 10;
        }
        System.out.println(num + " is Strong Number? " + (factorialSum == num));

        
        // 2. Labeled break to exit nested loops immediately
        System.out.println("Searching pair (i, j) where i + j == 5:");
        searchLoop:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i + j == 5) {
                    System.out.println("Found first pair: (" + i + ", " + j + ") -> Breaking outer loop!");
                    break searchLoop;
                }
            }
        }
    }
}