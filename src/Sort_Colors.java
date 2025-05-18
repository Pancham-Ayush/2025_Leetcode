public class Sort_Colors {
    public void sortColors(int[] nums) {
        helper(nums,0,nums.length);
    }
    int pos(int nums[],int l,int h){
        int x=l-1;
        int pivot =nums[h];
        for (int i=l;i<h;i++){
            if(nums[i]<=pivot)
            {
                x++;
                int temp=nums[i];
                nums[i]=nums[x];
                nums[x]=temp;
            }
        }
        int temp=nums[h];
        nums[h]=nums[x+1];
        nums[x+1]=temp;
        return x+1;
    }
    void helper(int nums[],int l,int h){
        if(l<h){
            int x=pos(nums,l,h);
            pos(nums,l,x-1);
            pos(nums,x+1,h);
        }
    }
}
