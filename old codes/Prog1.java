import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get Age
        System.out.print("Enter Age: "); // Print BEFORE asking for input
        int age = sc.nextInt();

        // 2. Get Height
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        // 3. Get Grade (The fix for nextChar)
        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0); 

        sc.nextLine();// ADD THIS LINE TO CLEAR THE BUFFER

        // 4. Get Name
        System.out.print("Enter Name of student: ");
        String name = sc.nextLine();

        // Displaying the results
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}