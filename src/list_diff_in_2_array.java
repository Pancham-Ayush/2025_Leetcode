import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_diff_in_2_array {


   static public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];

            boolean x = true;
            for (int j = 0; j < nums2.length; j++) {
                if (a == nums2[j])
                    x = false;
            }

            if (x == true)
                if(l1.contains(a)) {

                }

                else
                    l1.add(a);
        }
        for (int i = 0; i < nums2.length; i++) {
            int a = nums2[i];

            boolean x = true;
            for (int j = 0; j < nums1.length; j++) {
                if (a == nums1[j])
                    x = false;
            }

            if (x == true)
                if(l2.contains(a)) {

                }

            else
                 l2.add(a);

        }
        System.out.println(l1+ "   "+l2);

    return  List.of(l1,l2);
    }
public static void main(String[] args) {



    int[] array1 = {1,2,3,3};

    int[] array12 = {1,1,2,2};
    System.out.println(findDifference(array1,array12));
}
}