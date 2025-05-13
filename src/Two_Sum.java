import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
//        for (int i =0;i<nums.length;i++)
//            for (int j =i;j<nums.length;j++)
//                if (i!=j && nums[i]+nums[j]==target)
//                    return new int []{i,j};

//        or

        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if(!h.containsKey(target-nums[i]))
                h.put(nums[i],i );
            else
            {
                return new int[]{i,h.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
}
