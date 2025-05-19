import java.util.ArrayList;
import java.util.List;

public class Sum_of_All_Subset_XOR_Totals {
        public int subsetXORSum(int[] nums) {
            return dfs(nums, 0, 0);
        }

        private int dfs(int[] nums, int index, int currentXOR) {
            if (index == nums.length) {
                return currentXOR;
            }

            // Include nums[index]
            int include = dfs(nums, index + 1, currentXOR ^ nums[index]);

            // Exclude nums[index]
            int exclude = dfs(nums, index + 1, currentXOR);

            return include + exclude;
        }
    }
