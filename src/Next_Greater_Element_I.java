import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Next_Greater_Element_I {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();

        AtomicInteger index =new AtomicInteger(0);

        Arrays.stream(nums1)
                .forEach( x -> {
                    map.put(x,index.getAndIncrement());
                });
        Stack <Integer> stack = new Stack<>();
            for (int i = nums2.length-1;i>=0;i--){
                int x = nums2[i];
                while (!stack.isEmpty() && stack.peek()<x)
                    stack.pop();

                if (map.containsKey(x))
                {
                    int id = map.get(x);
                    nums1[id]= stack.isEmpty()?-1:stack.peek();
                }
                stack.push(x);

            }
            return nums1;

    }
}
