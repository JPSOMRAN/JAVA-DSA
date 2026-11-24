public class q49ArrayBasicsAndSecondLargest {
    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        int[] sortedNums = {5, 10, 10, 22, 40};

        System.out.println("Second Largest in nums: " + findSecondLargest(nums));
        System.out.println("Is nums sorted? " + isSorted(nums));
        System.out.println("Is sortedNums sorted? " + isSorted(sortedNums));
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > largest) {
                secondLargest = largest;
                largest = val;
            } else if (val > secondLargest && val != largest) {
                secondLargest = val;
            }
        }
        return secondLargest;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}