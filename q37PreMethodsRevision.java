
public class q37PreMethodsRevision {
    public static void main(String[] args) {
        // 1. Data Types & Type Casting
        int totalMarks = 437;
        int subjects = 5;
        double percentage = ((double) totalMarks / (subjects * 100)) * 100; // Explicit cast
        char grade = (percentage >= 80) ? 'A' : 'B'; // Ternary operator

        System.out.printf("Percentage: %.2f%% | Grade: %c\n", percentage, grade);

        // 2. Switch Expression
        String remark = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Good";
            default -> "Needs Improvement";
        };
        System.out.println("Remark: " + remark);

        // 3. for loop with continue & break
        System.out.print("Odd numbers up to 9 (skipping 5): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;      // Skip 5
            if (i > 9) break;          // Stop after 9
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 4. while loop (Digit Sum)
        int num = 1234, sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits of 1234: " + sum);

        // 5. do-while loop (Runs at least once)
        int attempts = 0;
        do {
            attempts++;
        } while (attempts < 1);
        System.out.println("Do-while executed count: " + attempts);
    }
}