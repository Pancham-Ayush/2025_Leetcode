public class plus1 {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;  // No carry-over needed
                return digits;
            }

        }
        int[] result = new int[n + 1];
        result[0] = 1;  // Set the most significant digit to 1
        return result;
    }
}