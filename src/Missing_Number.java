public class Missing_Number {
    public int missingNumber(int[] nums) {
        int x[]= new int[nums.length+1];
        for (int a:nums)
            x[a]=1;
        for(int i=0;i<x.length;i++)
            if(x[i]!=1)
                return i;



        return 0;

    }
}
