import java.awt.List;

public class ConutRotate {

	public static void main(String[] args) {
        int[] nums = {15,18,2,3,6,12};
        int pivotIndex = count(nums);
        System.out.println(pivotIndex);
        System.out.println(pivotIndex+1);
    }

    static int count(int[] list) {
        int start = 0;
        int end = list.length - 1;

        if (list[start] <= list[end]) {
            // Array is not rotated
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && list[mid] > list[mid + 1]) {
                // Found the pivot (smallest element in the rotated array)
                return mid;
            }

            if (mid > start && list[mid] < list[mid - 1]) {
                // Found the pivot (smallest element in the rotated array)
                return mid - 1;
            }

            if (list[mid] <= list[start]) {
                // Search in the left half
                end = mid - 1;
            } else {
                // Search in the right half
                start = mid + 1;
            }
        }

        return -1; // If no pivot is found (should not reach here in a properly rotated array)
    }

}
