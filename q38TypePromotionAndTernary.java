public class q38TypePromotionAndTernary {
    public static void main(String[] args) {
        // 1. Byte arithmetic promotes to int automatically
        byte b1 = 60, b2 = 70;
        byte sum = (byte) (b1 + b2); // 130 overflows signed byte (-128 to 127) -> -126
        System.out.println("Casted byte sum (60 + 70): " + sum);

        // 2. Integer overflow wrap-around
        int max = Integer.MAX_VALUE;
        System.out.println("Max Int: " + max);
        System.out.println("Max Int + 1 (Overflow): " + (max + 1));

        // 3. The Nested Ternary Operator
        int temp = 34;
        String weather = (temp > 35) ? "Hot" : (temp >= 20) ? "Pleasant" : "Cold";
        System.out.println("Temperature " + temp + "°C is: " + weather);
    }
}