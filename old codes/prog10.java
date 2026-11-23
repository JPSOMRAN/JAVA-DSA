
    import java.util.Scanner;
public class prog10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        // Reading a single line string
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Entered Sentence: " + sentence);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Entered Integer: " + x);

        // Reading a float value        
        System.out.print("Enter a float value: ");
        float f = Float.parseFloat(sc.nextLine());
        System.out.println("Entered Float Value: " + f);

        sc.close();
    }
}

