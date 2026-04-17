public class Remove_Duplicates_from_Sorted_Array {

    public int removeDuplicates(int[] nums) {
    int pointer =0;
    int p_val=nums[0];
    for(int i =1;i<nums.length;i++){
        if (nums[i]!=p_val){
            pointer++;
            nums[pointer]=nums[i];
            p_val=nums[i];
        }
    }
    return pointer+1;
    }

}
