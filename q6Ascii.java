import java.util.Scanner;

public class q6Ascii {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Character :\n ");
            
            // Read the first character of the user's input
            char ch = sc.next().charAt(0);
            
            // Cast the character to an integer to get its ASCII value
            int ascii = (int) ch;
            
            System.out.println("The ASCII value of '" + ch + "' is:\n " + ascii);
        }
    }
}