import java.util.ArrayList;

public class FINDING_SUBARRAY_SUM {


    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int sum = 0;
        int left = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Reduce the window size if the sum exceeds the target
            while (sum > target && left <= i) {
                sum -= arr[left];
                left++;
            }

            // If the sum matches the target, return the 1-based indices
            if (sum == target) {
                result.add(left + 1); // 1-based index for the start
                result.add(i + 1);   // 1-based index for the end
                return result;
            }
        }

        // If no subarray is found, return -1
        result.add(-1);
        return result;
    }
}