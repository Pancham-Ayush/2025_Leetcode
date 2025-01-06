public class moveball {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        // Prefix pass
        int moves = 0, count = 0;
        for (int i = 0; i < n; i++) {
            answer[i] += moves;
            count += boxes.charAt(i) - '0'; // Update count of balls encountered
            moves += count; // Add count to moves for next box
        }

        // Suffix pass
        moves = 0;
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += moves;
            count += boxes.charAt(i) - '0'; // Update count of balls encountered
            moves += count; // Add count to moves for next box
        }

        return answer;
    }
    }
