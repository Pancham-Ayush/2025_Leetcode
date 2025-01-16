class Solutioon {
    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Check if words[i] is both a prefix and a suffix of words[j]
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        String[] x = {"abab", "ab"};
        System.out.println(countPrefixSuffixPairs(x)); // Expected output: 0
    }
}
