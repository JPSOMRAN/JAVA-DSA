public class q45DoWhileAndMenu {
    public static void main(String[] args) {
        // Simulated user choices (replace with Scanner in interactive mode)
        int[] choices = {1, 2, 3, 0};
        int step = 0;
        int x = 6, y = 3;
        int choice;

        do {
            choice = choices[step++];
            switch (choice) {
                case 1 -> System.out.println("[Option 1] " + x + " + " + y + " = " + (x + y));
                case 2 -> System.out.println("[Option 2] " + x + " * " + y + " = " + (x * y));
                case 3 -> System.out.println("[Option 3] " + x + "^" + y + " = " + (int) Math.pow(x, y));
                case 0 -> System.out.println("[Option 0] Exiting menu safely.");
                default -> System.out.println("Invalid option!");
            }
        } while (choice != 0);
    }
}