import java.util.Arrays;

public class q50MoveZerosTwoPointer {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Before: " + Arrays.toString(arr));

        moveZeros(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }

    public static void moveZeros(int[] nums) {
        int insertPos = 0; // Slow pointer tracks where next non-zero belongs

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }
    }
}