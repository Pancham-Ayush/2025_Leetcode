public class Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int res=0;
        for (int i=0;i<nums.length;i++)
        {
            int x= nums[i];
            int count =0;
            while (x>0){
                x/=10;
                count++;
            }
            if(count%2==0)
                res++;

        }
        return res;
    }
}
