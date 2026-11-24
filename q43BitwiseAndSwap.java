public class q43BitwiseAndSwap {
    public static void main(String[] args) {
        int num = 17;

        // 1. Bitwise AND (& 1) checks the last bit (0 = Even, 1 = Odd)
        String parity = ((num & 1) == 0) ? "Even" : "Odd";
        System.out.println(num + " is: " + parity);

        // 2. Left shift (<<) multiplies by 2^k, Right shift (>>) divides by 2^k
        System.out.println("17 << 2 (17 * 4): " + (num << 2));
        System.out.println("17 >> 1 (17 / 2): " + (num >> 1));

        // 3. XOR (^) swap without a third variable
        int a = 25, b = 40;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap:  a = " + a + ", b = " + b);
    }
}