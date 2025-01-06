public class reverse_integer {

    public static int reverse(int x) {
        // Determine the sign of the number
        boolean isNegative = x < 0;
        // Get the absolute value of x
        int absX = Math.abs(x);

        // Reverse the number using StringBuffer
        String reversedStr = new StringBuffer(String.valueOf(absX)).reverse().toString();

        try {
            // Parse the reversed string back to an integer
            int reversedInt = Integer.parseInt(reversedStr);
            // Apply the negative sign if needed
            return isNegative ? -reversedInt : reversedInt;
        } catch (NumberFormatException e) {
            // Return 0 if the reversed number overflows
            return 0;
        }
    }
}
