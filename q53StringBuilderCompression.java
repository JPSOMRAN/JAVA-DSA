public class q53StringBuilderCompression {
    public static void main(String[] args) {
        String input = "aaabbcdddd";
        System.out.println("Original:   " + input);
        System.out.println("Compressed: " + compressString(input));
    }

    public static String compressString(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}