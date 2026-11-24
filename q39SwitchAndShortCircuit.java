public class q39SwitchAndShortCircuit {
    public static void main(String[] args) {
        // 1. Short-circuit safety check
        int total = 100, count = 0;
        if (count != 0 && (total / count) > 10) {
            System.out.println("Average is above 10");
        } else {
            System.out.println("Safely skipped division by zero!");
        }

        // 2.Switch expression for days in a month
        int month = 2;
        int year = 2024;

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            default -> -1;
        };

        System.out.println("Month " + month + " in year " + year + " has " + days + " days.");
    }
}