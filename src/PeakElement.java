import java.util.Arrays;

public class PeakElement {

    public static void main(String[] args) {
        int[] list = {-3, -2, -1, 1, 2, 3, 4, 5, -1, -2, -3, -4};
        int ans = findPeak(list);
        System.out.println("Peak at index: " + ans);
        /// boolean made to check if he is searching in ASCENDING OR DESCINDING
        int firstCase = binarySearch(list, 0, ans, -4, true);  // search in the ascending part
        int secondCase = binarySearch(list, ans + 1, list.length - 1, -4, false);  // search in the descending part

        if (firstCase != -1) {
            System.out.println(firstCase);
        } else if (secondCase != -1) {
            System.out.println(secondCase);
        } else {
            System.out.println("not found");
        }
    }

    static int binarySearch(int[] list, int start, int end, int target, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == list[mid]) {
                return mid;
            }
            if (ascending) {
                if (target > list[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > list[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int findPeak(int[] list) {
        int start = 0;
        int end = list.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (list[mid] < list[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
