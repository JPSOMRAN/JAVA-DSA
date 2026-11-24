public class q44CharAndAsciiMath {
    public static void main(String[] args) {
        // 1. Implicit conversion from char to int reveals ASCII value
        char ch = 'G';
        int ascii = ch;
        System.out.println("ASCII of '" + ch + "' is: " + ascii);

        // 2. Manual Uppercase to Lowercase conversion (+32)
        char lower = (char) (ch + ('a' - 'A'));
        System.out.println("Converted to lowercase: " + lower);

        // 3. Alphabet Triangle using char loop variable
        System.out.println("Alphabet Triangle:");
        for (char row = 'A'; row <= 'D'; row++) {
            for (char col = 'A'; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}