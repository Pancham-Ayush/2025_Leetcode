public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] res = new int[len];
        int point1 = 0, point2 = 0, i = 0;

        while (point1 < nums1.length && point2 < nums2.length) {
            if (nums1[point1] < nums2[point2]) {
                res[i++] = nums1[point1++];
            } else {
                res[i++] = nums2[point2++];
            }
        }

        while (point1 < nums1.length) {
            res[i++] = nums1[point1++];
        }
        while (point2 < nums2.length) {
            res[i++] = nums2[point2++];
        }
        if (len % 2 == 1) {
            return res[len / 2];
        } else {
            return (res[len / 2 - 1] + res[len / 2]) / 2.0;
        }
    }
}
