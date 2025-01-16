import java.lang.reflect.Array;
import java.util.Arrays;

public class move_0 {
   static public void moveZeroes(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[n]=nums[i];
                n++;
            }
        }
        while(n<nums.length){
            nums[n]=0;
            n++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        moveZeroes(a);

    }
}
