public class String_to_Integer_atoi {
        public int myAtoi(String s) {
            int i = 0, n = s.length();
            // Step 1: Skip leading whitespace
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            // Step 2: Handle sign if present
            int sign = 1;
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                sign = (s.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            // Step 3: Convert digits
            long result = 0;
            while (i < n && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                result = result * 10 + digit;

                // Step 4: Check for overflow
                if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
                if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

                i++;
            }

            return (int) (sign * result);
        }

}
