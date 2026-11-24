import java.util.Arrays;

public class q51RotateAndPrefixSum {
    public static void main(String[] args) {
        // 1. Rotate Array Right by k = 2
        int[] arr = {1, 2, 3, 4, 5};
        rotateRight(arr, 2);
        System.out.println("Rotated right by 2: " + Arrays.toString(arr));

        // 2. Prefix Sum for O(1) Range Queries
        int[] data = {4, 2, 7, 1, 5};
        int[] prefix = buildPrefixSum(data);
        System.out.println("Prefix array: " + Arrays.toString(prefix));
        System.out.println("Sum from index 1 to 3 (2 + 7 + 1): " + rangeSum(prefix, 1, 3));
    }

    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle k >= n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] buildPrefixSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}