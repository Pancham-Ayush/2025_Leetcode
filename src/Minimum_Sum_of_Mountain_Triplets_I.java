public class Minimum_Sum_of_Mountain_Triplets_I {
        public int minimumSum(int[] nums) {
            int n = nums.length;
            int min = Integer.MAX_VALUE;

            for (int j = 1; j < n - 1; j++) {
                int leftMin = Integer.MAX_VALUE;
                int rightMin = Integer.MAX_VALUE;

                // find smaller left
                for (int i = 0; i < j; i++) {
                    if (nums[i] < nums[j]) {
                        leftMin = Math.min(leftMin, nums[i]);
                    }
                }

                // find smaller right
                for (int k = j + 1; k < n; k++) {
                    if (nums[k] < nums[j]) {
                        rightMin = Math.min(rightMin, nums[k]);
                    }
                }

                if (leftMin != Integer.MAX_VALUE && rightMin != Integer.MAX_VALUE) {
                    min = Math.min(min, leftMin + nums[j] + rightMin);
                }
            }

            return min == Integer.MAX_VALUE ? -1 : min;
        }
}
