public class Heightofwatter {
    public int maxArea(int[] height) {
        int max=0;
        for (int i =0;i<height.length;i++){
            for (int j =height.length-1;j>=0;j--){
              max= (int) Math.max(max,Math.min(height[i], height[j])* (j-i));
            }
        }
        return  max;
    }
}
