import java.lang.reflect.Array;
import java.util.Arrays;

public class move_0 {
   static public void moveZeroes(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=0;
                nums[n++]=temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int a[]={1,3,12};
        moveZeroes(a);

    }
}
