import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Set;

class WordDictionary {
    WordDictionary obj;
    Set<String> k;

    public WordDictionary() {
        obj = new WordDictionary();
        k = new HashSet<>();
    }

    public void addWord(String word) {
        k.add(word);
    }

    public boolean search(String word) {
//        for (String dictWord : k) {
//            if (matchesWithPattern(dictWord, word))
//                if (dictWord.length() == word.length()) {
//                    return true;
//                }
//        }
        return false;
    }
}

