import java.util.Arrays;
 class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {30, 10, 40, 20};

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers)); // [10, 20, 30, 40]

        // Check if two arrays are equal
        int[] numbers2 = {10, 20, 30, 40};
        System.out.println("Arrays are equal: " + Arrays.equals(numbers, numbers2)); // true

        // Search for an element (binary search requires a sorted array)
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index); // 2

        // Fill the array with a specific value
        Arrays.fill(numbers, 99);
        System.out.println("Array after filling: " + Arrays.toString(numbers)); // [99, 99, 99, 99]
    }
}
