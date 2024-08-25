import java.awt.*;
        import java.awt.event.InputEvent;
import java.util.*;

public class stringtest {
    public static String longestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> charIndex = new HashMap();

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (charIndex.containsKey(s.charAt(j))) {
                i = Math.max(charIndex.get(s.charAt(j)) + 1, i);
            }
            if (j - i + 1 > maxLen) {
                maxLen = j - i + 1;
                start = i;
                end = j;
            }

            charIndex.put(s.charAt(j), j);
        }
        System.out.println(maxLen);
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        System.out.println("Longest substring without repeating characters: " + longestSubstring("haassann"));
    }
}
