public class q52BinarySearch {
    public static void main(String[] args) {
        int[] sorted = {3, 8, 14, 19, 25, 31, 42, 56};

        System.out.println("Index of 31: " + binarySearch(sorted, 31));
        System.out.println("Index of 20: " + binarySearch(sorted, 20));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Avoids (low + high) integer overflow
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}