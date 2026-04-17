public class Sort_Colors {
    public void sortColors(int[] nums) {
        int n0 =0,n2=nums.length-1;
       for (int i =0;i<nums.length;i++)
       {
           if(nums[i]==0) {
               nums[i]=nums[n0];
               nums[n0]=0;
               n0++;
           }
           else if(nums[i]==2){
               nums[i]=nums[n2];
               nums[n2]=2;
               n2--;
           }
       }
    }


//    Quick Sort
//    int pos(int nums[],int l,int h){
//        int x=l-1;
//        int pivot =nums[h];
//        for (int i=l;i<h;i++){
//            if(nums[i]<=pivot)
//            {
//                x++;
//                int temp=nums[i];
//                nums[i]=nums[x];
//                nums[x]=temp;
//            }
//        }
//        int temp=nums[h];
//        nums[h]=nums[x+1];
//        nums[x+1]=temp;
//        return x+1;
//    }
//    void helper(int nums[],int l,int h){
//        if(l<h){
//            int x=pos(nums,l,h);
//            helper(nums,l,x-1);
//            helper(nums,x+1,h);
//        }
//    }
}
